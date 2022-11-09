package OOP8.ch01;

public class MinMaxProblem {
	
	/* ���� ���� ���� �迭�� ���� �� �� �� ���� ū ���� ���� ���� ���� ã�´�
	 * �迭�� �� ��°�� �ִ��� ������ ã�´�.
	 * �ݺ����� �ѹ��� ����Ͽ� ������ �ذ��Ѵ�
	 * ���� �� {10, 55, 23, 2, 79, 101, 16, 82, 30, 45}
	 * 
	 * �迭�� �ִ� �� �� �� ó�� ���� max �� min���� �����ϰ� �迭�� ������ ���ڱ��� ���ϸ鼭 �� ū���� ���� ���� ���ö� max�� min�� ���� ����
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int numbers[] = {10, 55, 23, 2 ,79, 101, 16 , 82, 30, 45 }; 
		
		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		System.out.println("���� ū ���� "+ max + "�̰�, "+ maxPos + "��°�� ��ġ�մϴ�." );
		System.out.println("���� ���� ���� "+ min + "�̰�, "+ minPos + "��°�� ��ġ�մϴ�." );
		
		
	}
	
}
