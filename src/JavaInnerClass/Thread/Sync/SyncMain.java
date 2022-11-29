package JavaInnerClass.Thread.Sync;

class Bank{
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int money) { // synchronized 사용하여 해당 메서드 사용 시 다른 메서드가 돌아가지 않음(Block)
		int m = getMoney();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + money );
		
	}
	
	public void minusMoney(int minus) {
		
		synchronized (this) { // public synchronized 와 같은 효과 현재 메서드가 속해있는 객체에 lock
			int m = getMoney();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m - minus);
		}
		
	}
	
}

class Park extends Thread{
	
	public void run() {
		
		System.out.println("start Save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) :" + SyncMain.myBank.getMoney() );
		
	}
	
}

class ParkWife extends Thread{
	
	public void run() {
		
		System.out.println("start Minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) :" + SyncMain.myBank.getMoney() );
		
	}
	
}


public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		/* critical section, semaphore
		 * 
		 * critical section은 두 개 이상의 thread가 동시에 접근하는 경우 문제가 생길 수 있기 떄문에 동시에 접근 할 수 없는 영역
		 * semaphore는 특별한 형태의 시스템 객체이며 get/release 두 개의 기능이 있다
		 * 한 순간 오직 하나의 thread 만이 semaphore를 얻을 수 있고, 나머지 thread들은 (blocking) 상태가 된다.
		 * semaphore를 얻은 thread 만이 critical section에 들어갈 수 있다.
		 * 
		 * synchronization
		 * 두 개의 thread가 같은 객체에 접근 할 경우, 동시에 접근함으로써 오류가 발생
		 * 동기화는 임계영역에 접근한 경우 공유 자원을 lock 하여 다른 thread의 접근을 제어
		 * 동기화를 잘못 구현하면 deadlock(교착상태)에 빠질 수 있음
		 * 
		 * Park 와 ParkWife가 동시에 Bank 자원에 접근하여 작업
		 * */
		
		Park p = new Park();
		
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start(); 
		// 위의 코드대로 진행시 minusMoney(1000) :9000, saveMoney(3000) :13000 의 결과로 값에 오류가 생긴 것을 확인 가능
		// Park 이 getMoney 했을 때 다른 Thread가 실행되고 setMoney를 했을 때 금액차이로 인한 오류 
		// Save 작업 도중에 Minus가 작동하면 안됌 - > 동기화가 필요한 메서드에 synchronized
		
	}

}
