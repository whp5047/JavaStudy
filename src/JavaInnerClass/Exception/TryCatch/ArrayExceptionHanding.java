package JavaInnerClass.Exception.TryCatch;

public class ArrayExceptionHanding {

	public static void main(String[] args) {
		
		/* try -catch 
		 * try ��Ͽ��� ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ��ϰ� try ��Ͼȿ��� �������� �߻��ϸ� catch����� �����
		 * try {
		 *		���ܰ� �߻��� �� �ִºκ�
		 *	} catch (ó���� ����Ÿ�� e) {
		 *		try ��� �ȿ��� ���ܰ� �߻����� �� ���ܸ� ó���ϴ� �κ�
	     *	}
	     * 
		 * */
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		for(int i = 0; i <= 5; i++) { // i <=5�� �����Ͽ� �ε����� �������� ������ ������ ArrayIndexOutOfBoundsException �߻�
//			System.out.println(arr[i]);
//		}
		
		try {
			for(int i = 0; i <= 5; i++) { // i <=5�� �����Ͽ� �ε����� �������� ������ ������ ArrayIndexOutOfBoundsException �߻�
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("����üũ");
		
	}

}
