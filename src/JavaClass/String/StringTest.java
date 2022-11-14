package JavaClass.String;

public class StringTest {
	public static void main(String[] args) {
	
		/* �� �޸𸮿� �ν��Ͻ��� �����Ǵ� ���� ��� Ǯ(constant pool)�� �ִ� �ּҸ� �����ϴ� �� ���� ���
		 * �� �޸𸮴� �����ɶ����� �ٸ� �ּ� ���� ��������, ��� Ǯ�� ���ڿ��� ��� ���� �ּ� ���� ����
		 * 
		 * �ѹ� ������ String�� �Һ�(immutable)
		 * String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� ������(�޸��� ���� �߻�����)
		 * ->> StringBuffer, StringBuilder�� ���� �ذ�
		 * */
		
		String str1 = new String("abc"); // �� �޸𸮿� ���� ����
		String str2 = "abc";
		
		System.out.println(str1 == str2); // false
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // true
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //������ �ּ� ��
		
		java = java.concat(android); // ���ڿ��� ��ġ�� ���ο� �ּ� ���� �ش� ���� ����
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // ���ο� �ּ� ���� �Ҵ�� ���� Ȯ�� ����
		
		
		
		
		
	}
}
