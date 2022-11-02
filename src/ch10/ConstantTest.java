package ch10;

public class ConstantTest {
	public static void main(String[] args) {
		
		final int MAX_NUM = 100; 
		final int MIN_NUM; 
		
		//MAX_NUM = 0; // final 변수는 상수로 변수명을 대문자로 표현 초기화 후 다시 초기화가 불가능
		MIN_NUM = 0; // 선언만 했기 때문에 사용전에 초기화가 필요 초기화하지 않을 시 오류발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		/* 리터럴 숫자, 문자, 논리값을 뜻함
		 * 리터럴은 constant pool에있음 (상수영역)
		 * 정수는 int 실수는 double로 저장 정수가 int의 범위 초과시 L로,
		 * 실수를 float로 사용하기 위해서는 F를 식별자로 붙혀줘야함
		 * 
		 * */
		
	}
}
