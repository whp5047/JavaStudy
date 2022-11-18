package JavaInnerClass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
//		static int sInNum = 500; << ������ static ������ outClass�� �������� ������ ������ �����ؾ��ؼ� ���������� ���Ұ���
		
		void inTest() {
			System.out.println("OutClass num : " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum : " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass num : " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
		
	}
	
	public void usingClass() { // �޼��� �ȿ� innerClass�� ����޼��带 �־ ���
		inClass.inTest();
	}
	
	static class InSataicClass { // ���� ���� Ŭ���� -> �ܺ� Ŭ������ �������� ������� ��������� ������ �ܺ�Ŭ������ �ν��Ͻ� ���� ���Ұ� OutClass - num
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num : " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum : " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass num : " + sInNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
		
		static void sTest() { // ����Ŭ������ �ν��Ͻ������� ������ iNum��� �Ұ� << �����̵����ʾ� �ν��Ͻ� ������ �Ҵ��������
			System.out.println("OutClass sNum : " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass num : " + sInNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
//		OutClass outClass = new OutClass();
//		outClass.usingClass();
//		
//		System.out.println();
//		
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		OutClass.InSataicClass sInner = new OutClass.InSataicClass();
		sInner.inTest();
		
		System.out.println();
		
		OutClass.InSataicClass.sTest(); // �������� �ٷ� ȣ�Ⱑ�� static�̱⶧��
		
	}

}
