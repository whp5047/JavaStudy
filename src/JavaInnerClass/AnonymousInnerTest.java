package JavaInnerClass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(final int i) { // java.lang ��Ű���� ����Ǿ��ִ� �������̽� Ŭ������ ������ȭ �Ҷ� �ʿ��� run�޼ҵ� ��� �������1
		
		int num = 10;
		
		class MyRunnable implements Runnable {
			int localNum = 1000;
			@Override
			public void run() {
				
//				i = 50; �ռ� �޾ƿ��� ������ �缱�� �Ϸ����ϸ� ������ �߻� �޼����� ȣ�� �� ������ ���ÿ����� ���� �� �ֱ� ������ final�� ����(�����Ϸ��� ��������������)
//				num = 20;
				
				System.out.println("i = " + i );
				System.out.println("num = " + num );
				System.out.println("localNum = " + localNum );
				
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)" );
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ��������)" );
				
			
			}
		};
		
		return new MyRunnable();
	}
	
	Runnable runnable = new Runnable() { // �������2
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
	
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		/* �͸� ���� Ŭ����
		 * �̸��� ���� Ŭ����(�� ���� ���� Ŭ������ MyRunnable Ŭ���� �̸��� ������ ȣ��Ǵ� ��찡 ����)
		 * Ŭ������ �̸��� �����ϰ� �ַ� �ϳ��� �������̽��� �ϳ��� �߻� Ŭ������ �����Ͽ� ��ȯ
		 * �������̽��� �߻� Ŭ���� �ڷ����� ������ ���� �����Ͽ� Ŭ������ �����ϰų� ���� ���� Ŭ������ �޼��� ���ο��� �����Ͽ� ��ȯ ����
		 * 
		 * */
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		runner.run();// ȣ���� ������ ���ÿ��� ������ > ���� ���ȭ�� ���� ���� ������ ����
		
		out.runnable.run();
		
	}

}

