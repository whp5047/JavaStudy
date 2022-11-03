package ch20;

public class NestedLoopTest {
	public static void main(String[] args) {
		
		/*
		 * 중첩 반복문 > 여러 겹으로 반복문을 겹쳐서 구현 > 수행시간에 문제 발생가능
		 * 외부 반복문과 내부 반목문 간의 변수 값 변화에 유의 하며 구현해야함
		 * O(n) <- 하나의 실행속도  O(n^2) <- 여러개 실행속도 n^반복문의 갯수 
		 * 
		 * 
		 * */
		int dan = 2;
		int count = 1;
		System.out.println("for 구구단");
		for(dan = 2; dan <= 9 ; dan++) {
			
			for(count = 1 ; count <= 9; count ++) {
				
				System.out.println(dan + " X " + count  + " = " + (dan * count));
			}
			System.out.println();
		}
		
		dan = 2;
		count = 1;
		System.out.println("while 구구단");
		
		while( dan <= 9) {
			
			while(count <=9) {
				
				System.out.println(dan + " X " + count  + " = " + (dan * count));
				count++;
			}
			System.out.println();
			dan++;
			count = 1;
		}
		
		
	}
	
}
