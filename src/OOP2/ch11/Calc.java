package OOP2.ch11;

public interface Calc {
	
	/* �������̽��� �������� ���
	 * 
	 * ��� : ��� ������ ����� ��ȯ�� public static final
	 * 
	 * �߻�޼��� : ��� ����� �޼���� �߻� �޼��� public abstract
	 * 
	 * */
	
	double PI = 3.14;
	int ERORR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	/* ����Ʈ �޼���(�ڹ� 8����) : ������ ������ �޼���, �������̽��� �������� Ŭ�����鿡�� �������� ����� �� �ִ� �⺻ �޼���
	 * default Ű���� ���
	 * */
	default void dscription(){
		System.out.println("���� ��Ģ������ �����մϴ�.");
		myMethod();
	}
	
	//�����޼���(static method) : �ڹ� 8���Ļ��
	// �ν��Ͻ� ������ ��� ���� �������̽� Ÿ������ ����� �� �ִ� �޼���
	static int total(int[] arr){
	 	int total = 0;
	 
	 	for(int i : arr){
	 		total += i;
	 	}
	 	myStaticMethod();
	 	return total;
	 }
	
	/*private �޼��� (�ڹ� 9 ����)
	 * �������̽��� ������ Ŭ�������� ����ϰų� ������ �� �� ����
	 * �������̽� ���ο����� ����ϱ� ���� �����ϴ� �޼���
	 * default �޼��峪 static �޼��忡�� ���
	 * 
	 * */
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}
