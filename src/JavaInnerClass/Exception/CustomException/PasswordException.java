package JavaInnerClass.Exception.CustomException;

public class PasswordException extends Exception{
	
	/* �ڹٿ��� �����Ǵ� ���� Ŭ�����ܿ� ���α׷��Ӱ� ���� ������ �ϴ� ���ܰ� ���� �� ����
	 * ���� ���� Ŭ������ ���� ������ ���� Ŭ�������� ��� �޾� ����� ���� ���� Ŭ������ �����.
	 * �⺻������ Exception Ŭ������ ����ؼ� ���� �� ����
	 * 
	 * �н����忡 ���� ���� ó�� �ϱ�
	 * �н����忡 ���� ���� ó�� �ϱ� 
	 * �н����带 �Է��� �� ���� ó��
	 * null, 5�̸�, ���ڷθ� �̷������
	 * 
	 * */
	
	public PasswordException(String message) {
		super(message);
	}
	
	
}
