package ch13;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		
		/* 삼항연산자 
		 * 조건문의 결과가 true, flase 에 따라 다른 결과가 실행됌
		 * if 조건문을 간단히 표현 >> 조건식? 결과1 : 결과2  ex) int num = (5>3) ? 10: 20;
		 * 
		 * */
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.");
		
		System.out.print("첫 번째 숫자. : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두 번째 숫자. : ");
		int num2 = scanner.nextInt();
		
		max = num1 > num2 ? num1 : num2;
		
		System.out.println("더 큰 숫자 : " + max);
		System.out.println();
		
	}
}
