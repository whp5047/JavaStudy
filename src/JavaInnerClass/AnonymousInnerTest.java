package JavaInnerClass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(final int i) { // java.lang 패키지에 선언되어있는 인터페이스 클래스를 스레드화 할때 필요한 run메소드 사용 구현방법1
		
		int num = 10;
		
		class MyRunnable implements Runnable {
			int localNum = 1000;
			@Override
			public void run() {
				
//				i = 50; 앞서 받아오는 값들을 재선언 하려고하면 오류가 발생 메서드의 호출 시 값들이 스택영역에 없을 수 있기 때문에 final로 선언(컴파일러가 묵시적으로해줌)
//				num = 20;
				
				System.out.println("i = " + i );
				System.out.println("num = " + num );
				System.out.println("localNum = " + localNum );
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)" );
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적변수)" );
				
			
			}
		};
		
		return new MyRunnable();
	}
	
	Runnable runnable = new Runnable() { // 구현방법2
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
	
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		/* 익명 내부 클래스
		 * 이름이 없는 클래스(위 지역 내부 클래스의 MyRunnable 클래스 이름은 실제로 호출되는 경우가 없음)
		 * 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
		 * 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 가능
		 * 
		 * */
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		runner.run();// 호출이 끝나고 스택에서 지워짐 > 따라서 상수화를 시켜 값을 가지고 있음
		
		out.runnable.run();
		
	}

}

