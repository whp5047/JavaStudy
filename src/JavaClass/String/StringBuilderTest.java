package JavaClass.String;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		/* StringBuilder, StringBuffer
		 *  ���������� �������� char[]�� ��� �����ΰ���
		 *  ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ����
		 *  ���ο� �ν��Ͻ��� �������� �ʰ� char[]�� ����
		 *  StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ(snchronization)�� ����
		 *  ���� ������ ���α׷������� StringBuilder ����� ����
		 *  toString() �޼���� String ��ȯ
		 * 
		 * */
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); 
		buffer.append(android); //���ڿ� ��ġ��
		System.out.println(System.identityHashCode(buffer)); // ���ڿ��� ���ĵ� �־ �ּҰ��� ������ ���� �˼� ���� 
		
		String test = buffer.toString();
		System.out.println(test);
		
		
	}
	
}
