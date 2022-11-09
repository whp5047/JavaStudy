package OOP8.ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		/* ���� ���� ���� ������ ������ ���� �� Ư���� ���� ã�� ���
		 * �ܼ� �ݺ����� �̿��ϸ� ���� ������ ���� �� Ƚ���� �����ϴ� O(n)�� ������ �̷����
		 * ���� ������ ���¿����� ���� Ž��(binary search)�� Ȱ���ϸ� �Ź� �񱳵Ǵ� ����� ���� �������� ���ҵ� �� ��������
		 * O(logN)�� �������� ���ϴ� ���� ã�� �� ����
		 * {12, 25, 31, 48, 54, 66, 70, 83, 95, 100}
		 * 
		 * ���� ���ĵ� �����̹Ƿ� �߰��� ���� �ϳ� �����Ͽ� ã������ ������ ũ�� ���������� �׺��� ������ ������ �������� ���� ���ִ� �ѹ� ���Ҷ����� 
		 * 2����1�� ������ ��������.
		 * 
		 * */
		
		int numbers[] = {12, 25, 31, 48, 54, 66, 70, 83, 95 ,100};
		
		int left = 0;
		int right = numbers.length-1;
		
		int mid = (left + right)/ 2;
		
		int temp = numbers[mid];
		int target = 255;
		boolean find = false;
		
		while(left <= right) {
			
			if(target == temp) {
				find = true;
				break;
				
			}else if(target < temp) {
				right = mid - 1;
				
			}else {
				left = mid + 1;
			}
			mid = (right + left) /2 ;
			temp = numbers[mid];
			
		}
		if(find) {
			mid++;
			System.out.println("ã�� ���� " + mid + "��°�� �ֽ��ϴ�.");
			
		}else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
		
		
		
		

	}

}
