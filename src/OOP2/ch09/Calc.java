package OOP2.ch09;

public interface Calc {
	
	/* �������̽�(interface)
	 * ��� �޼��尡 �߻� �޼���� ������ public abstract
	 * ��� ������ ����� ������ public static final
	 * 
	 * �ڹ�8 ���� ����Ʈ �޼���(default method)�� ���� �޼���(static method) ��� �������� �̷� ���� �ڵ�����
	 * 
	 * */
	
	double PI = 3.14;
	int ERORR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
}
