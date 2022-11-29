package JavaInnerClass.Thread.Sync;

class Bank{
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int money) { // synchronized ����Ͽ� �ش� �޼��� ��� �� �ٸ� �޼��尡 ���ư��� ����(Block)
		int m = getMoney();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + money );
		
	}
	
	public void minusMoney(int minus) {
		
		synchronized (this) { // public synchronized �� ���� ȿ�� ���� �޼��尡 �����ִ� ��ü�� lock
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
		 * critical section�� �� �� �̻��� thread�� ���ÿ� �����ϴ� ��� ������ ���� �� �ֱ� ������ ���ÿ� ���� �� �� ���� ����
		 * semaphore�� Ư���� ������ �ý��� ��ü�̸� get/release �� ���� ����� �ִ�
		 * �� ���� ���� �ϳ��� thread ���� semaphore�� ���� �� �ְ�, ������ thread���� (blocking) ���°� �ȴ�.
		 * semaphore�� ���� thread ���� critical section�� �� �� �ִ�.
		 * 
		 * synchronization
		 * �� ���� thread�� ���� ��ü�� ���� �� ���, ���ÿ� ���������ν� ������ �߻�
		 * ����ȭ�� �Ӱ迵���� ������ ��� ���� �ڿ��� lock �Ͽ� �ٸ� thread�� ������ ����
		 * ����ȭ�� �߸� �����ϸ� deadlock(��������)�� ���� �� ����
		 * 
		 * Park �� ParkWife�� ���ÿ� Bank �ڿ��� �����Ͽ� �۾�
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
		// ���� �ڵ��� ����� minusMoney(1000) :9000, saveMoney(3000) :13000 �� ����� ���� ������ ���� ���� Ȯ�� ����
		// Park �� getMoney ���� �� �ٸ� Thread�� ����ǰ� setMoney�� ���� �� �ݾ����̷� ���� ���� 
		// Save �۾� ���߿� Minus�� �۵��ϸ� �ȉ� - > ����ȭ�� �ʿ��� �޼��忡 synchronized
		
	}

}
