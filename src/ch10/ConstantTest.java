package ch10;

public class ConstantTest {
	public static void main(String[] args) {
		
		final int MAX_NUM = 100; 
		final int MIN_NUM; 
		
		//MAX_NUM = 0; // final ������ ����� �������� �빮�ڷ� ǥ�� �ʱ�ȭ �� �ٽ� �ʱ�ȭ�� �Ұ���
		MIN_NUM = 0; // ���� �߱� ������ ������� �ʱ�ȭ�� �ʿ� �ʱ�ȭ���� ���� �� �����߻�
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		/* ���ͷ� ����, ����, ������ ����
		 * ���ͷ��� constant pool������ (�������)
		 * ������ int �Ǽ��� double�� ���� ������ int�� ���� �ʰ��� L��,
		 * �Ǽ��� float�� ����ϱ� ���ؼ��� F�� �ĺ��ڷ� ���������
		 * 
		 * */
		
	}
}
