package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main (String[] args){
		
		/*	�� ������ Ư�� ���̳� ���ڿ��� ��� ��� > break ���� ����Ͽ� �� ������ �����Ǹ�
		 *  switch ���� ������������ ��
		 *  int ~~ = switch() {} case 1: yield 31; };>> ��ȯ�� �޴¹��
		 *  
		 *  JAVA 14 �������� case 1, 3, 4, 5 -> �� ����
		 * 
		 * */
		System.out.println("���� �Է����ּ��� >> ");
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
				System.out.println("�������� �ʴ� ���Դϴ�.");
				day = -1;
		}
		System.out.println(month + "���� " + day +"�� �Դϴ�.");
		
	}
}
