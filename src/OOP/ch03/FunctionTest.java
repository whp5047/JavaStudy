package OOP.ch03;

public class FunctionTest {
	
	/* 함수(function) : 하나의 기능을 수행하는 일련의 코드
	 * 구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어가 반환
	 * 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용가능
	 * 
	 * 함수는 이름, 매개변수, 반환 값, 몸체로 구성
	 * int add(매개변수){  < int(반환타입) add(함수명)
	 * 		실행문(바디)
	 * }
	 * 
	 * 스택 : 함수가 호출될 때 지역 변수들이 사용하는 메모리
	 * 함수의 수행이 끝나면 자동으로 반환되는 메모리
	 * 
	 * 메서드(method) : 객체의 기능을 구현하기 위해 클래승 내부에 구현되는 함수
	 * 멤버 함수라고도 함
	 * 메서드를 구현함으로써 객체의 기능이 구현
	 * 메서드의 이름은 그 객체를 사용하는 객체에 맞게 짓는것이 좋음
	 * 
	 * 함수와 메서드의 차이 -> 함수는 어디에 속해있지 않음 단독모듈
	 * 메서드는 클래스에 속해있으며 클래스 내의 맴버 변수를 사용하여 구현된 것
	 * 
	 * */
	
	
	public static int addNum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
	}
	
	public static int calcSum(){
		
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total =addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
		
	}
	
}
