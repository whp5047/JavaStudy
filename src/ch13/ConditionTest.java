package ch13;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		
		/* ���׿����� 
		 * ���ǹ��� ����� true, flase �� ���� �ٸ� ����� ������
		 * if ���ǹ��� ������ ǥ�� >> ���ǽ�? ���1 : ���2  ex) int num = (5>3) ? 10: 20;
		 * 
		 * */
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���.");
		
		System.out.print("ù ��° ����. : ");
		int num1 = scanner.nextInt();
		
		System.out.print("�� ��° ����. : ");
		int num2 = scanner.nextInt();
		
		max = num1 > num2 ? num1 : num2;
		
		System.out.println("�� ū ���� : " + max);
		System.out.println();
		
	}
}
