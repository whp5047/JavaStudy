package design.proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

	public static void main(String[] args) {
//		Browser browser = new Browser("www.naver.com");
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show(); // 여러번 호출 시 원래는 매번 로딩
		
		IBrowser browser = new BrowserProxy("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		
		// AOP > 특정한 메소드의 실행 시간, 특정한 패키지에 존재하는 메서드의 전, 후로 작업하고 싶은 부분
		// 특정한 요청에 대해 리퀘스트정보, 리스폰스 정보를 남길 때 코드에 개별적이 아니라 일괄적으로 특정 패키지에 모든 메소드에 가능 
		// 시간 측정과 같은 것에 사용
		// 데이터베이스 작업 시 트렌젝션 부분에 활용, 서비스간의 통신시 활용, 클라이언트의 http 통신
		
		/* 동시성 문제 AtomicLong()
		 * Thread-safe로 구현되어 멀티쓰레드에서 synchronized 없이 사용할 수 있다.
		 * 또한 synchronized 보다 적은 비용
		 * */
		
		AtomicLong start = new AtomicLong(); // 0으로 생성, 매개변수에 값을 넣을 경우 해당 값으로 초기화 
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowser("www.naver.com",
				()->{ //람다식 Runnable 구현
					System.out.println("before");
					start.set(System.currentTimeMillis());
				},
				
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
				}
		);
		
		aopBrowser.show();
		System.out.println("loading time : "+ end.get());
		
		aopBrowser.show();
		System.out.println("loading time : "+ end.get()); // 두번째 활용시 cache를 활용하기 때문에 0초인거 확인 가능
		
		
	}

}
