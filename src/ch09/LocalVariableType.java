package ch09;

public class LocalVariableType {
	public static void main(String[] args) {
		
		// var Java 10�������� �����ϴ� �������� Ÿ�� �߷б�� javaScript�� ���� ��ũ��Ʈ��� ��������� Java�� ��� �����ϰ� ����
		
		var i = 10; //int
		var j = 10.0; // double
		var str = "hello"; //String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // ������ �ʱ�ȭ ����
		System.out.println(str);
		
		// str = 3; �� ���� ������ var�� String���� ����� �ʱ�ȭ �� int�� �ʱ�ȭ �Ұ��� 
		
		
	}
}
