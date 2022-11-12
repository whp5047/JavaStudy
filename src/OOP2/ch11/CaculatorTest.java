package OOP2.ch11;

public class CaculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.dscription();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr)); // 스태틱메서드라 new 없이 사용가능
		
		
	}	

}
