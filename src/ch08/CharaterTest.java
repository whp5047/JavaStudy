package ch08;

public class CharaterTest {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); // �����ڵ� 65�� 'A'�̱� ������ int�� ����ȯ�ϸ� 65�� ���
		
		char ch2 = 66;
		System.out.println((char)ch2); // �����ڵ� 66�� 'B'�̱� ������ 'B'�� ���
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3); // �����ڵ� 67�� 'C'�̱� ������ int�� ����ȯ�Ǿ� 'C'�� ���
		
		char han = '��';
		char ch = '\uD55C'; //�����ڵ� ���� \ u~ �ڵ� �̿�
		
		System.out.println(han);
		System.out.println(ch);
		
		/* character set : ���ڸ� ���ڷ� ��ȯ�� ���� ��Ʈ
		 * encoding : ���ڰ� ���ڷ� ��ȯ�Ǵ� ��
		 * decoding : ���ڿ��� �ٽ� ���ڷ� ��ȯ�Ǵ� ��
		 * 
		 * ASKII code : ���ĺ��� ���� Ư�� ���ڵ��� 1����Ʈ�� ǥ���ϴµ� ����ϴ� ���ڼ�Ʈ
		 * UNICODE : �� ���� ǥ������ ���� ���� ��Ʈ
		 * UTF-8 : 1����Ʈ���� 4����Ʈ���� �پ��ϰ� ���ڸ� ǥ���� �� ���� -����ſ� ���
		 * UTF-16 : 2����Ʈ�� ���ڸ� ǥ��
		 * 
		 * */
	
	}
}
