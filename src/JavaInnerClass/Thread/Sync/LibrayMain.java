package JavaInnerClass.Thread.Sync;

import java.util.ArrayList;

class FastLibray {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibray(){
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
//		shelf.add("태백산맥4");
//		shelf.add("태백산맥5");
//		shelf.add("태백산맥6"); 
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
//		if( shelf.size() == 0 ) {// wait 상태만들기 하지만 대기만하고 못빌릴 수 있음 따라서 while로 고치면 해결가능
		while( shelf.size() == 0 ) {
			
			System.out.println(t.getName() + " waiting start");
			wait(); // Object / 이 메서드를 수행하고 있는 thread를 runnable 상태로 만듬
			System.out.println(t.getName() + " waiting end");
		}
		
		
		if( shelf.size() > 0 ){ 
			String book = shelf.remove(0);
			System.out.println(t.getName() + " : " + book + " lend");
			return book;
			
		}else {
			return null;
		}
		
		
	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notify(); // Object
		System.out.println(t.getName() + " : " + book + " return");
		
	}
	
}

class Student extends Thread {
	
	public Student() {}
	
	public Student(String name) {
		super(name);
	}
	
	
	public void run() {
		
		try {
			String title = LibrayMain.libray.lendBook();
			
			if( title == null) { 
				System.out.println(getName() + " 찾고 계신 책이 없습니다. ");
				return;
			}
			
			sleep(5000);
			LibrayMain.libray.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}



public class LibrayMain {
	
	public static FastLibray libray = new FastLibray();
	public static void main(String[] args) {
		
		/* wait() / notify() 메서드를 활용한 멀티스레드 동기화 프로그래밍
		 * 
		 * 리소스가 어떤 조건에서 더이상 유효하지 않은 경우 리소스를 기다리기 위해서 Thread가 wait() 상태가 된다.
		 * wait() 상태(not - runnable)가 된 Thread는 notify()가 호출되고 wait() 하고 있는 Thread 중 *무작위로 하나의 Thread를 재시작하도록한다.
		 * 유용한 자원이 생기면 notifyAll() 이 호출되는 경우 wait() 하고 있는 모든 Thread가 재시작된다
		 * 이 경우 유효한 리소스 만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는 다시 wait() 상태로만든다
		 * 자바에서는 notifyAll() 메서드의 사용을 권장 -> 영원히 호출되지 않는 Thread가 존재 할 수 있기 때문에
		 * 
		 * 도서관 대출 예제
		 * */
		
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");// 배열의 개수를 초과하여 호출 시 out of bounds Exception 발생
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
		
	}

}
