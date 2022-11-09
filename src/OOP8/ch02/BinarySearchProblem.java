package OOP8.ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		/* 여러 개의 수가 저열된 순서로 있을 때 특정한 수를 찾는 방법
		 * 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐
		 * 수가 정려된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있음으로
		 * O(logN)의 수행으로 원하는 수를 찾을 수 있음
		 * {12, 25, 31, 48, 54, 66, 70, 83, 95, 100}
		 * 
		 * 수가 정렬된 상태이므로 중간의 값을 하나 선택하여 찾으려는 값보다 크면 오른쪽으로 그보다 작으면 범위를 왼쪽으로 좁힐 수있다 한번 비교할때마다 
		 * 2분의1씩 범위가 좁혀진다.
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
			System.out.println("찾는 수는 " + mid + "번째에 있습니다.");
			
		}else {
			System.out.println("찾는 수가 없습니다.");
		}
		
		
		
		

	}

}
