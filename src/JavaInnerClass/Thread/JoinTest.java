package JavaInnerClass.Thread;

public class JoinTest extends Thread{

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		
		int i;
		for(i = start; i <= end ; i++) {
			total += i;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		/* Join
		 * ���ÿ� �� �� �̻��� Thread�� ���� �� �� �ٸ� Thread�� ����� �����Ͽ� �����ؾ� �ϴ� ��� join()�Լ��� ���
		 * join() �Լ��� ȣ���� Thread�� not-runnable ���°���
		 * �ٸ� Thread�� ������ ������ runnable ���·� ���ƿ�
		 * 
		 * interrupt()
		 * �ٸ� Thread�� ���ܸ� �߻���Ű�� interrupt�� ������.
		 * Thread�� join(), sleep, wait() �Լ��� ���� not - runnable ������ �� interrupt() �޼��带 ȣ���ϸ� �ٽ� runnable ���°� �� �� ����
		 * 
		 * Thread ����
		 * while(flag) �� ��� flag �������� false�� �ٲپ� ���Ḧ ��Ŵ
		 * 
		 * 1���� 50, 51���� 100 ������ ���� ���ϴ� �ΰ��� Thread�� ����� �� ����� Ȯ���غ�����
		 * */
		System.out.println(Thread.currentThread() + "start");
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {// join, wait, sleep ���� interrupt Exception ó�� �ʿ� 
			e.printStackTrace();
		} 
		
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total : " + jt1.total);
		System.out.println("jt2.total : " + jt2.total);
		
		System.out.println("lastTotal.total : " + lastTotal);
		System.out.println(Thread.currentThread() + "end");

		
		
		
		
		
	}

}
