package OOP.ch17;

public class ArrayTest {
	public static void main(String[] args) {
		
		/* 배열 Array
		 * 동일한 자료형의 순차적 자료 구조
		 * 인덱스 연산자[]를 이용하여 빠른 참조가 가능
		 * 물리적 위치와 논리적 위치가 동일
		 * 배열 순서는 0부터 시작
		 * 자바에서는 객체 배열을 구현한 ArrayList를 많이 이용
		 * 
		 * 배열의 선언과 초기화
		 * int[] arr1 = new int[10];
		 * int arr2[] = new int[10];
		 * 
		 * int[] numbers = new int[] {20, 30, 40} // [] 안의 갯수 생략
		 * int[] numbers = {10, 20, 30} // new int[] 생략가능
		 * int[] ids;
		 * ids = new int[] {10, 20 ,30} 선언 후 배열을 생성하는 경우는 new int[] 생략이 불가능
		 * 
		 * 향상된 for문
		 * for(변수 : 배열){} n개의 요소를 n-1번 실행할때 사용
		 * 
		 * */
		
		 int[] arr = new int[10];
		  int total = 0;
		  
		  for(int i = 0, num = 1; i < arr.length; i++, num++){ // arr[0] ~ [9] 까지 1 ~ 10 값이 담김 
		  		arr[i] = num;
		  }
		  
//		  for(int i = 0; i < arr.length; i++){ //arr[0] ~ [10]의 값 즉, 1 ~ 10 값을 모두 더하니 total = 55; 
//			  total += arr[i];
//		  }
		  for(int num : arr) {
			  total += num;
		  }
		  
		  		
		  System.out.println(total);
		  
		  double[] dArr = new double[5]; // 배열을 선언하면 개수만큼 메모리가 할당되지만 실제 요소(데이터)가 없는 경우도 있음
		  //length속성은 배열의 개수를 반환해주기 때문에 요소의 갯수와는 다름
		  int count = 0;
		  dArr[0] = 1.1; count++; 
		  dArr[1] = 2.1; count++;
		  dArr[2] = 3.1; count++;

		  double mtotal = 1;
		  System.out.println(dArr.length);
		  
//		  for(int i = 0; i < dArr.length; i++){ // 곱하기를 해버리면 [3], [4] 의 값이 정해지지 않아 기본 값 0 으로 전체 값에 대한 오류 발생
//		  		mtotal *= dArr[i];
//		  }
		  
		  for(int i = 0; i < count; i++){ // count와 같은 변수를 만들어 실행하여 대체
		  		mtotal *= dArr[i];
		  }
		  
		  
		  System.out.println(mtotal);
		  
		  
		  
	}
	
}
