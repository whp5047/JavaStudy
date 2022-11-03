package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main (String[] args){
		
		/*	비교 조건이 특정 값이나 문자열인 경우 사용 > break 문을 사용하여 각 조건이 만족되면
		 *  switch 블럭을 빠져나오도록 함
		 *  int ~~ = switch() {} case 1: yield 31; };>> 반환값 받는방법
		 *  
		 *  JAVA 14 버전부터 case 1, 3, 4, 5 -> 로 가능
		 * 
		 * */
		System.out.println("월을 입력해주세요 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int day;
		switch(month) {
		
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
				day = 31; 
				break;
				
			case 2 : 
				day = 28;
				break;
				
			case 4 : 
				day = 30;
				break;
			
			case 6 : 
				day = 30;
				break;

			case 9 : 
				day = 30;
				break;

			case 11 : 
				day = 30;
				break;
		
			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month + "월은 " + day +"일 입니다.");
		
	}
}
