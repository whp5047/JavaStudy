package ch17;

public class WhileTest {
	public static void main (String[] args){
		
		/*	�־��� ������ �� (true) �ε��� ���๮�� �ݺ��Ͽ� �����ϴ� ���
		 * ������ ���������� (false) ������ �ߴ�
		 * 
		 * while(���ǽ�) {
		 * 		 ���๮
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
