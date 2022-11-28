package JavaInnerClass.Thread;

class MyThread extends Thread{
	
	public void run() {
		
		int i;
		for(i = 1; i<= 200; i++) {
			System.out.print(i + "\t");
		}
		
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		/* Thread
		 * process ���� ���� ���α׷��� ����Ǹ� OS�� ���� �޸𸮸� �Ҵ�޾� ���μ��� ���°� ��
		 * Thread �ϳ��� ���μ����� �ϳ� �̻��� Thread�� ������ �ǰ�, ���� �۾��� �����ϴ� ������ Thread
		 * 
		 * Multi-Threading
		 * ���� Thread�� ���ÿ� ����Ǵ� ���α׷���, ���� �۾��� ���ÿ� ����Ǵ� ȿ��
		 * thread�� ���� �ڽŸ��� �۾� ������ ����(context)
		 * �� thread ���̿��� �����ϴ� �ڿ�(Shared resource)�� ���� �� ���� (�ڹٿ����� Static instance)
		 * ���� thread�� �ڿ��� �����Ͽ� �۾��� ����Ǵ� ��� ���� �ڿ��� �����Ϸ��� race condition�� �߻��� �� ����
		 * �̷��� ���� thread�� �����ϴ� �ڿ��� ������ �߻��ϴ� �κ��� critical section
		 * critical section�� ���� ����ȭ(������ ������ ����)�� �������� ������ ������ �߻� ����
		 * 
		 * Thread Ŭ������ ����Ͽ� ����.
		 * Runnable �������̽� ����Ͽ� ����
		 * */
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");
		
		
		
	}

}
