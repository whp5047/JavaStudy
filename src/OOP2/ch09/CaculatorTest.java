package OOP2.ch09;

public class CaculatorTest {

	public static void main(String[] args) {
		
		/* �������̽� ������ ����ȯ
	 	* �������̽��� ������ Ŭ������ �������̽� ������ ������ ������ �� ��ȯ �� �� ����
	 	* Calc calc = new CompleteCalc();
	 	* ��ӿ����� �� ��ȯ�� ������ �ǹ�
	 	* Ŭ���� ��Ӱ� �޸� �����ڵ尡 �����Ƿ� ���� �������̽��� ������ �� ����(cf. extends)
	 	* �� ��ȯ�Ǵ� ��� �������̽��� ����� �޼��常�� ��밡����
		* 
		* */
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		CompleteCalc cCalc = new CompleteCalc(); // �������̽� Calc�� implements �ϴ� CompleteCalc������ ���� ���� ���� CompleteCalc�� ������ �޼��� ��밡�� 
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		cCalc.showInfo();
		
	}	

}
