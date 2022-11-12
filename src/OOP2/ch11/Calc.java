package OOP2.ch11;

public interface Calc {
	
	/* 인터페이스의 여러가지 요소
	 * 
	 * 상수 : 모든 변수는 상수로 변환됌 public static final
	 * 
	 * 추상메서드 : 모든 선언된 메서드는 추상 메서드 public abstract
	 * 
	 * */
	
	double PI = 3.14;
	int ERORR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	/* 디폴트 메서드(자바 8이후) : 구현을 가지는 메서드, 인터페이스를 구혀낳는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
	 * default 키워드 사용
	 * */
	default void dscription(){
		System.out.println("정수 사칙연산을 제공합니다.");
		myMethod();
	}
	
	//정적메서드(static method) : 자바 8이후사용
	// 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
	static int total(int[] arr){
	 	int total = 0;
	 
	 	for(int i : arr){
	 		total += i;
	 	}
	 	myStaticMethod();
	 	return total;
	 }
	
	/*private 메서드 (자바 9 이후)
	 * 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
	 * 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
	 * default 메서드나 static 메서드에서 사용
	 * 
	 * */
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}
