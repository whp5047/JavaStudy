package ch20;

public class NestedLoopTest {
	public static void main(String[] args) {
		
		/*
		 * ��ø �ݺ��� > ���� ������ �ݺ����� ���ļ� ���� > ����ð��� ���� �߻�����
		 * �ܺ� �ݺ����� ���� �ݸ� ���� ���� �� ��ȭ�� ���� �ϸ� �����ؾ���
		 * O(n) <- �ϳ��� ����ӵ�  O(n^2) <- ������ ����ӵ� n^�ݺ����� ���� 
		 * 
		 * 
		 * */
		int dan = 2;
		int count = 1;
		System.out.println("for ������");
		for(dan = 2; dan <= 9 ; dan++) {
			
			for(count = 1 ; count <= 9; count ++) {
				
				System.out.println(dan + " X " + count  + " = " + (dan * count));
			}
			System.out.println();
		}
		
		dan = 2;
		count = 1;
		System.out.println("while ������");
		
		while( dan <= 9) {
			
			while(count <=9) {
				
				System.out.println(dan + " X " + count  + " = " + (dan * count));
				count++;
			}
			System.out.println();
			dan++;
			count = 1;
		}
		
		
	}
	
}
