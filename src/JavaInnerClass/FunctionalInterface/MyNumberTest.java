package JavaInnerClass.FunctionalInterface;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber myNumber = (x, y) ->  x > y? x: y; // ���ٽ� �������̽� �ڷ��� max ������ ����
		System.out.println(myNumber.getMax(10, 20)); // �������̽� �ڷ��� ������ �Լ� ȣ��
		
	}

}
