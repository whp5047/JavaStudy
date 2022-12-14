package OOP2.ch13.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객 우선 숙련도 높은 상담원");
		
		int ch = System.in.read();
		Scheduler schduler = null;
		
		if( ch == 'R' || ch == 'r' ) {
			schduler = new RoundRobin();
			
		}else if( ch == 'L' || ch == 'l' ) {
			schduler = new LeastJob();
			
	    }else if( ch == 'P' || ch == 'p' ) {
			schduler = new PriorityAllocation();
			
	    }else {
	    	System.out.println("지원되지 않는 기능입니다.");
	    	return;
	    }
		
		schduler.getNextCall();
		schduler.sendCallToAgent();
		
	}

}
