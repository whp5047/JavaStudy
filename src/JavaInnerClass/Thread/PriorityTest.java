package JavaInnerClass.Thread;

class PriorityThread extends Thread{
	
	/* �켱����
	 * Thread.MIN_PRIORTY(=1) ~ Thread.MAX+PRIORITY(=10) // 1���� 10����
	 * ����Ʈ �켱���� = 5
	 * �켱 ������ ���� Thraed�� CPU ����� ���� Ȯ���� ���� ������ �������� �ƴ�
	 * setPriority() / getPriority()
	 * 
	 * */
	
		public void run() {
		
			int sum = 0;
			Thread t = Thread.currentThread();
			System.out.println(t + "start");
			
			for(int i = 0 ; i <= 1000000; i++) {
				
				sum += i;
				
			}
			System.out.println(t.getPriority() + "end");
			
		
		}
}	


public class PriorityTest{
	

	public static void main(String[] args) {
	
		int i;
//		for(i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
//			
//			PriorityThread pt = new PriorityThread();
//			pt.setPriority(i);
//			pt.start();
//			
//		}
		
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
		
	}
	
}
