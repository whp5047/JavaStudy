package OOP.ch19;

public class TwoDinensionTest {
	public static void main(String[] args) {
		
		/* ������ �迭 : ������ �̻����� ���� �� �迭 ���(������ �迭)�̳� ����(������ �迭)�� Ȱ���� ���α׷� ����
		 * int[][] arr = new int [��][��];
		 * 
		 * */
		
		int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};
		int[][] arr1 =new int[3][4];
		
		int i, j;
		
		for(i = 0; i < arr.length; i++) {
			
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println("\t" + arr[i].length);
		}
		
		System.out.println("==== arr1====="); //�ʱ�ȭ�� �ȵǾ� 0���� �޸𸮿����� ����
		for(i = 0; i < arr1.length; i++) {
			
			for(j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + ", ");
			}
			System.out.println("\t" + arr1[i].length);
		}
		
		
		
	}
	
}	
