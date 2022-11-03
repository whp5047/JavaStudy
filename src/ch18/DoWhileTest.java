package ch18;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		/*
		 * while문은 조건을 먼저 체크하고 반복이 수행 -> do-while의 경우 조건과 상관 없이
		 * 수행을 한번 한 뒤 조건을 체크 > 무조건 한번 실행됌
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력하세요(종료를 원하시면 0을 입력해주세요) >> ");
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println("sum : " + sum);
		
		
	}
}
