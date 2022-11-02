package ch10;

public class TypeConversion {
	public static void main(String[] args) {
		
		/* ����� �� ��ȯ(����), ������ �� ��ȯ(�ڵ�)�� ����
		 * 
		 * ������ int -> Long ���� �Ϳ��� ū ������ -> �ڷ��� ������ ���� ����
		 * ����� double -> int �Ǽ��̱� ������ ������ ��ȯ�� �ڷ��� ���ǹ߻�  
		 * 
		 * */
		
		byte bNum = 125; 
		int iNum = bNum;
		System.out.println(iNum);
		
		int iNum1 = 255;
		byte bNum1 = (byte)iNum1; // byte -128~ 127���� ǥ�������ϱ� ������ ������ �ʰ��� ���� �����÷ο� �߻�
								  // 127���� -128���� �������� + �Ͽ� -1 �� ���
		System.out.println(bNum1);
		
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println(iNum2); //�Ǽ��θ� ���� ���� 3�� ���
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum;
		int iNum4 = (int)(dNum1 + fNum);
		
		System.out.println(iNum3); // ���� ����ȯ�Ͽ� 1 + 0 = 0
		System.out.println(iNum4); // ��� �� ����ȯ�Ͽ� 2.1  =>  2
		
	}
}
