package OOP.ch17;

public class ArrayTest {
	public static void main(String[] args) {
		
		/* �迭 Array
		 * ������ �ڷ����� ������ �ڷ� ����
		 * �ε��� ������[]�� �̿��Ͽ� ���� ������ ����
		 * ������ ��ġ�� ���� ��ġ�� ����
		 * �迭 ������ 0���� ����
		 * �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� �̿�
		 * 
		 * �迭�� ����� �ʱ�ȭ
		 * int[] arr1 = new int[10];
		 * int arr2[] = new int[10];
		 * 
		 * int[] numbers = new int[] {20, 30, 40} // [] ���� ���� ����
		 * int[] numbers = {10, 20, 30} // new int[] ��������
		 * int[] ids;
		 * ids = new int[] {10, 20 ,30} ���� �� �迭�� �����ϴ� ���� new int[] ������ �Ұ���
		 * 
		 * ���� for��
		 * for(���� : �迭){} n���� ��Ҹ� n-1�� �����Ҷ� ���
		 * 
		 * */
		
		 int[] arr = new int[10];
		  int total = 0;
		  
		  for(int i = 0, num = 1; i < arr.length; i++, num++){ // arr[0] ~ [9] ���� 1 ~ 10 ���� ��� 
		  		arr[i] = num;
		  }
		  
//		  for(int i = 0; i < arr.length; i++){ //arr[0] ~ [10]�� �� ��, 1 ~ 10 ���� ��� ���ϴ� total = 55; 
//			  total += arr[i];
//		  }
		  for(int num : arr) {
			  total += num;
		  }
		  
		  		
		  System.out.println(total);
		  
		  double[] dArr = new double[5]; // �迭�� �����ϸ� ������ŭ �޸𸮰� �Ҵ������ ���� ���(������)�� ���� ��쵵 ����
		  //length�Ӽ��� �迭�� ������ ��ȯ���ֱ� ������ ����� �����ʹ� �ٸ�
		  int count = 0;
		  dArr[0] = 1.1; count++; 
		  dArr[1] = 2.1; count++;
		  dArr[2] = 3.1; count++;

		  double mtotal = 1;
		  System.out.println(dArr.length);
		  
//		  for(int i = 0; i < dArr.length; i++){ // ���ϱ⸦ �ع����� [3], [4] �� ���� �������� �ʾ� �⺻ �� 0 ���� ��ü ���� ���� ���� �߻�
//		  		mtotal *= dArr[i];
//		  }
		  
		  for(int i = 0; i < count; i++){ // count�� ���� ������ ����� �����Ͽ� ��ü
		  		mtotal *= dArr[i];
		  }
		  
		  
		  System.out.println(mtotal);
		  
		  
		  
	}
	
}
