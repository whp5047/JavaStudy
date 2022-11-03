package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	public static void main (String[] args){
		
		/*	비교 조건이 특정 값이나 문자열인 경우 사용 > break 문을 사용하여 각 조건이 만족되면
		 *  switch 블럭을 빠져나오도록 함
		 * 
		 * 
		 * */
		
		String medal = "Gold";
		
		switch(medal) {
		
			case "Gold" : 
				System.out.println("금메달 입니다..");
				break;
				
			case "Silver" : 
				System.out.println("은메달 입니다..");
				break;
				
			case "Bronze" : 
				System.out.println("동메달 입니다.");
				break;
			
			default:
				System.out.println("메달이 없습니다.");
				break;
		}
		
	}
}
