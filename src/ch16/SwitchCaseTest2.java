package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	public static void main (String[] args){
		
		/*	�� ������ Ư�� ���̳� ���ڿ��� ��� ��� > break ���� ����Ͽ� �� ������ �����Ǹ�
		 *  switch ���� ������������ ��
		 * 
		 * 
		 * */
		
		String medal = "Gold";
		
		switch(medal) {
		
			case "Gold" : 
				System.out.println("�ݸ޴� �Դϴ�..");
				break;
				
			case "Silver" : 
				System.out.println("���޴� �Դϴ�..");
				break;
				
			case "Bronze" : 
				System.out.println("���޴� �Դϴ�.");
				break;
			
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
		
	}
}
