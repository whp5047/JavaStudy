package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		/*	&&(�� ��) : �� ���� ��� ���� ��쿡�� ��� ���� ture �׷��� ������ false
		 *  ||(�� ��) : �� �� �� �ϳ��� �׸� ���̸� ture ��� �����̸� false
		 *  ! (����) : ���� ������ true�� ��� false, false�� ��� true
		 * 
		 * 
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0 ) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0 ) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 > 0 ) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0 ) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0 );
		System.out.println(flag);
		
		int i = 2;
		boolean value = ( (num1= num1 + 10) < 10 ) || (i = i + 2) < 10; // �ܶ� ȸ�� �� short circuit evaluation 
		System.out.println("value : " + value);
		System.out.println("num1 : " + num1);
		System.out.println("i : " + i);
		
	}
	
}
