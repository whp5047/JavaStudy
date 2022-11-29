package JavaInnerClass.Thread.Sync;

import java.util.ArrayList;

class FastLibray {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibray(){
		shelf.add("�¹���1");
		shelf.add("�¹���2");
		shelf.add("�¹���3");
//		shelf.add("�¹���4");
//		shelf.add("�¹���5");
//		shelf.add("�¹���6"); 
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
//		if( shelf.size() == 0 ) {// wait ���¸���� ������ ��⸸�ϰ� ������ �� ���� ���� while�� ��ġ�� �ذᰡ��
		while( shelf.size() == 0 ) {
			
			System.out.println(t.getName() + " waiting start");
			wait(); // Object / �� �޼��带 �����ϰ� �ִ� thread�� runnable ���·� ����
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
				System.out.println(getName() + " ã�� ��� å�� �����ϴ�. ");
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
		
		/* wait() / notify() �޼��带 Ȱ���� ��Ƽ������ ����ȭ ���α׷���
		 * 
		 * ���ҽ��� � ���ǿ��� ���̻� ��ȿ���� ���� ��� ���ҽ��� ��ٸ��� ���ؼ� Thread�� wait() ���°� �ȴ�.
		 * wait() ����(not - runnable)�� �� Thread�� notify()�� ȣ��ǰ� wait() �ϰ� �ִ� Thread �� *�������� �ϳ��� Thread�� ������ϵ����Ѵ�.
		 * ������ �ڿ��� ����� notifyAll() �� ȣ��Ǵ� ��� wait() �ϰ� �ִ� ��� Thread�� ����۵ȴ�
		 * �� ��� ��ȿ�� ���ҽ� ��ŭ�� Thread���� ����� �� �ְ� �ڿ��� ���� ���� Thread�� ���� �ٽ� wait() ���·θ����
		 * �ڹٿ����� notifyAll() �޼����� ����� ���� -> ������ ȣ����� �ʴ� Thread�� ���� �� �� �ֱ� ������
		 * 
		 * ������ ���� ����
		 * */
		
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");// �迭�� ������ �ʰ��Ͽ� ȣ�� �� out of bounds Exception �߻�
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
