package JavaInnerClass.Thread;

class PriorityThread extends Thread{
	
	/* 우선순위
	 * Thread.MIN_PRIORTY(=1) ~ Thread.MAX+PRIORITY(=10) // 1부터 10까지
	 * 디폴트 우선순위 = 5
	 * 우선 순위가 높은 Thraed가 CPU 배분을 받을 확률이 높은 것이지 무조건은 아님
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
