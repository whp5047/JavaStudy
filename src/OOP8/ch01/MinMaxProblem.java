package OOP8.ch01;

public class MinMaxProblem {
	
	/* 여러 개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다
	 * 배열의 몇 번째에 있는지 순서를 찾는다.
	 * 반복문을 한번만 사용하여 문제를 해결한다
	 * 수의 예 {10, 55, 23, 2, 79, 101, 16, 82, 30, 45}
	 * 
	 * 배열에 있는 수 중 맨 처음 값을 max 와 min으로 가정하고 배열의 마지막 숫자까지 비교하면서 더 큰수나 작은 수가 나올때 max와 min의 값을 변경
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
		System.out.println("가장 큰 수는 "+ max + "이고, "+ maxPos + "번째에 위치합니다." );
		System.out.println("가장 작은 수는 "+ min + "이고, "+ minPos + "번째에 위치합니다." );
		
		
	}
	
}
