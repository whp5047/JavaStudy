package JavaInnerClass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
//		static int sInNum = 500; << 오류남 static 변수는 outClass의 생성과는 별개로 접근이 가능해야해서 구조적으로 사용불가능
		
		void inTest() {
			System.out.println("OutClass num : " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum : " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass num : " + iNum + "(내부 클래스의 인스턴스 변수)");
			
		}
		
	}
	
	public void usingClass() { // 메서드 안에 innerClass의 실행메서드를 넣어서 사용
		inClass.inTest();
	}
	
	static class InSataicClass { // 정적 내부 클래스 -> 외부 클래스의 생성과는 상관없이 만들어지기 때문에 외부클래스의 인스턴스 변수 사용불가 OutClass - num
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num : " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum : " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass num : " + sInNum + "(내부 클래스의 인스턴스 변수)");
			
		}
		
		static void sTest() { // 내부클래스의 인스턴스변수를 사용못함 iNum사용 불가 << 생성이되지않아 인스턴스 변수가 할당되지않음
			System.out.println("OutClass sNum : " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass num : " + sInNum + "(내부 클래스의 인스턴스 변수)");
			
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
//		OutClass outClass = new OutClass();
//		outClass.usingClass();
//		
//		System.out.println();
//		
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		OutClass.InSataicClass sInner = new OutClass.InSataicClass();
		sInner.inTest();
		
		System.out.println();
		
		OutClass.InSataicClass.sTest(); // 생성없이 바로 호출가능 static이기때문
		
	}

}
