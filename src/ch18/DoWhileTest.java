package ch18;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		/*
		 * while���� ������ ���� üũ�ϰ� �ݺ��� ���� -> do-while�� ��� ���ǰ� ��� ����
		 * ������ �ѹ� �� �� ������ üũ > ������ �ѹ� ������
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			System.out.print("���ڸ� �Է��ϼ���(���Ḧ ���Ͻø� 0�� �Է����ּ���) >> ");
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println("sum : " + sum);
		
		
	}
}
