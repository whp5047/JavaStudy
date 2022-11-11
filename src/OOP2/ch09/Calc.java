package OOP2.ch09;

public interface Calc {
	
	/* 인터페이스(interface)
	 * 모든 메서드가 추상 메서드로 선언됌 public abstract
	 * 모든 변수는 상수로 선언됌 public static final
	 * 
	 * 자바8 부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능 제공으로 이룹 구현 코드존재
	 * 
	 * */
	
	double PI = 3.14;
	int ERORR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
}
