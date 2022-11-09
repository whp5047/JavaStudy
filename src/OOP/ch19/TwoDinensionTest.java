package OOP.ch19;

public class TwoDinensionTest {
	public static void main(String[] args) {
		
		/* 다차원 배열 : 이차원 이상으로 구현 된 배열 평명(이차원 배열)이나 공간(삼차원 배열)을 활용한 프로그램 구현
		 * int[][] arr = new int [행][열];
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
		
		System.out.println("==== arr1====="); //초기화가 안되어 0으로 메모리영역만 차지
		for(i = 0; i < arr1.length; i++) {
			
			for(j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + ", ");
			}
			System.out.println("\t" + arr1[i].length);
		}
		
		
		
	}
	
}	
