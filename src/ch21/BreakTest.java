package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		/* Break�� 
		 * ���ΰ� �ִ� ����� ����� ���������� ��� Switch �������� ���
		 * �ݺ������� �ַ� ���ǹ��� ���� ��� ���� �ݺ����� ��ø�Ǿ� �ִ°�� break���� ���� �Ǿ��ִ� �ݺ����� Ż��
		 * 
		 * */
		int sum = 0;
		int num = 1;
		
		for(num = 1 ; ; num++) {
			sum += num;
			if(sum >= 100)break;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		
	}

}
