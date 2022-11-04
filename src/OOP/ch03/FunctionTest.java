package OOP.ch03;

public class FunctionTest {
	
	/* �Լ�(function) : �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
	 * ������ �Լ��� ȣ���Ͽ� ����ϰ� ȣ��� �Լ��� ����� ������ ��� ��ȯ
	 * �Լ��� ������ �ϳ��� ����� ���� ������ ������ ������� ȣ��Ǿ� ��밡��
	 * 
	 * �Լ��� �̸�, �Ű�����, ��ȯ ��, ��ü�� ����
	 * int add(�Ű�����){  < int(��ȯŸ��) add(�Լ���)
	 * 		���๮(�ٵ�)
	 * }
	 * 
	 * ���� : �Լ��� ȣ��� �� ���� �������� ����ϴ� �޸�
	 * �Լ��� ������ ������ �ڵ����� ��ȯ�Ǵ� �޸�
	 * 
	 * �޼���(method) : ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	 * ��� �Լ���� ��
	 * �޼��带 ���������ν� ��ü�� ����� ����
	 * �޼����� �̸��� �� ��ü�� ����ϴ� ��ü�� �°� ���°��� ����
	 * 
	 * �Լ��� �޼����� ���� -> �Լ��� ��� �������� ���� �ܵ����
	 * �޼���� Ŭ������ ���������� Ŭ���� ���� �ɹ� ������ ����Ͽ� ������ ��
	 * 
	 * */
	
	
	public static int addNum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
	}
	
	public static int calcSum(){
		
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total =addNum(n1, n2);
		System.out.println(total);
		
		sayHello("�ȳ��ϼ���");
		
		total = calcSum();
		System.out.println(total);
		
	}
	
}
