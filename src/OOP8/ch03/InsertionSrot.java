package OOP8.ch03;

public class InsertionSrot {

	public static void insertionSort(int[] arr, int count) {
		
		int i = 0, j = 0;
		int temp = 0;

		for(i = 1; i < count; i++) { // arr[i], arr[j]��� ���� ������ �ε����� ����Ű�� temp�� arr[i]���� ���� �� [i-1] ��ĭ ���� �ε��� ���� �� ū ��� arr[i]�� [i-1] ���� ���� �� temp�� i-1]���� �����Ͽ� ���� ���� ������ ���� 
			
			temp = arr[i];
			System.out.println(i + "��° temp : " + temp);
			j = i;
			while((j > 0) && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j - 1;
			}
			arr[j] = temp;

			System.out.println("�ݺ� -" + i);
			printSort(arr, count);
		}
		
		
	}
	
	public static void printSort(int value[], int count)
	{
		int i = 0;
		for(i = 0; i < count; i++) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		/* ���� �˰��� : ��� ���� �ð��� O(n^2)�� �˰���
		 * ��������(Bubble Sort), ���� ����(Insertion Sort), ��������(Selection Sort)
		 * �� ��Ұ� �ٸ� ��ҿ� ��� �ѹ� �̻� �񱳸� �Ͽ� ���ĉ�
		 * 
		 * Insertion Sort ����
		 * �̹� ���ĵ� ������ ��ҿ� ���ο� ��Ҹ� �߰��� �� �����Ͽ� �߰��ϴ� ����
		 * �ι�° ��� ���� ���� ��ҵ�� ���ϸ鼭 insert �� ��ġ�� ã�ư��� �����ϴ� �˰���
		 * 
		 * 
		 * */
		
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };
		
		insertionSort(arr, 8);
		
	}

}
