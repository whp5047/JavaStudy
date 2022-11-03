package ch17;

public class WhileTest {
	public static void main (String[] args){
		
		/*	주어진 조건이 참 (true) 인동안 수행문을 반복하여 수행하는 제어문
		 * 조건이 맞지않으면 (false) 수행이 중단
		 * 
		 * while(조건식) {
		 * 		 수행문
		 * }
		 * 
		 * 
		 * */
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		

	}
}
