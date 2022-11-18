package JavaInnerClass.OOPAndLamndaComparison;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		
		StringConcat concat = (s, v) -> System.out.println(s1  + "," + v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override 
			public void makeString(String s1, String s2) { // Anonymous �͸� Ŭ������ ��������°� ������ �� @FunctionalInterface
				
				System.out.println(s1 + "...." + s2);
			}
		};
			
		concat2.makeString(s1, s2);
		
	}
	
	/* �͸� ���� Ŭ���������� ���������� ���ٽ� ���ο����� �ܺο� �ִ� ���� ������ ���� �����ϸ� ������ �߻�
	 * ���ٽ��� �Լ��� ����ó�� ���
	 * 
	 * ���� ����
	 * Ư�� �ڷ������� ������ ���� �� �� ���� ���� int num = 10;
	 * �Ű� ������ �����Ͽ� ��� add(int num, int num2)
	 * �޼����� ��ȯ ������ ��ȯ�ϱ� return num;
	 * 
	 * ���ٽ�
	 * 
	 * �Լ��� �������̽��� ���
	 * PrintString lambdaStr = s-> System.out.println(s); // ���ٽ��� ������ ����
	 * 
	 * �Ű������� �����ϴ� ���ٽ�
	 * showMyString(lambdaStr);
	 * public static void showMyString(PrintString p){
	 * 		p.showString("Hello lambda_2")
	 * }
	 * 
	 * ��ȯ������ ���̴� ���ٽ�
	 * public static PrintString returnString(){
	 * 		return s-> System.out.println(s + "world");
	 * }
	 * 
	 * PrintString reStr = returnString();
	 * reStr.showString("hello");
	 * 
	 * */

}
