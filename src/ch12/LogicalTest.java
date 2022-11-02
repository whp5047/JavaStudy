package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		/*	&&(논리 곱) : 두 항이 모두 참인 경우에만 결과 값이 ture 그렇지 않으면 false
		 *  ||(논리 합) : 두 할 중 하나의 항만 참이면 ture 모두 거짓이면 false
		 *  ! (부정) : 단항 연산자 true인 경우 false, false인 경우 true
		 * 
		 * 
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0 ) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0 ) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 > 0 ) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0 ) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0 );
		System.out.println(flag);
		
		int i = 2;
		boolean value = ( (num1= num1 + 10) < 10 ) || (i = i + 2) < 10; // 단락 회로 평가 short circuit evaluation 
		System.out.println("value : " + value);
		System.out.println("num1 : " + num1);
		System.out.println("i : " + i);
		
	}
	
}
