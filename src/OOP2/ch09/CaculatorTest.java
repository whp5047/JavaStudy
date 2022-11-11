package OOP2.ch09;

public class CaculatorTest {

	public static void main(String[] args) {
		
		/* 인터페이스 구현과 형변환
	 	* 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
	 	* Calc calc = new CompleteCalc();
	 	* 상속에서의 형 변환과 동일한 의미
	 	* 클래스 상속과 달리 구현코드가 없으므로 여러 인터페이스를 구현할 수 있음(cf. extends)
	 	* 형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함
		* 
		* */
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		CompleteCalc cCalc = new CompleteCalc(); // 인터페이스 Calc를 implements 하는 CompleteCalc형으로 선언 가능 따라서 CompleteCalc에 생성한 메서드 사용가능 
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		cCalc.showInfo();
		
	}	

}
