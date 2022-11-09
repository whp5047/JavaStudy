package OOP8.ch03;

public class InsertionSrot {

	public static void insertionSort(int[] arr, int count) {
		
		int i = 0, j = 0;
		int temp = 0;

		for(i = 1; i < count; i++) { // arr[i], arr[j]라는 것이 동일한 인덱스를 가르키고 temp에 arr[i]값을 저장 후 [i-1] 한칸 앞의 인덱스 값이 더 큰 경우 arr[i]에 [i-1] 값을 저장 후 temp를 i-1]값을 저장하여 작은 수를 앞으로 정렬 
			
			temp = arr[i];
			System.out.println(i + "번째 temp : " + temp);
			j = i;
			while((j > 0) && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j - 1;
			}
			arr[j] = temp;

			System.out.println("반복 -" + i);
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
		
		/* 정렬 알고리즘 : 평균 수행 시간이 O(n^2)인 알고리즘
		 * 버블정렬(Bubble Sort), 삽입 정렬(Insertion Sort), 선택정렬(Selection Sort)
		 * 각 요소가 다른 요소와 평균 한번 이상씩 비교를 하여 정렬됌
		 * 
		 * Insertion Sort 구현
		 * 이미 정렬된 생태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념
		 * 두번째 요소 부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘
		 * 
		 * 
		 * */
		
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };
		
		insertionSort(arr, 8);
		
	}

}
