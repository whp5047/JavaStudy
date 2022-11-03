package ch21;

public class ContinueTest {
	public static void main(String[] args) {
		/*
		 * Continue문
		 * 반복문 내부에서 조건문과 같이 사용 조건이 맞는경우 반복문 블럭 내부의 다른 수행문들을 수행하지 않음
		 * */
		int num;
		
		for(num = 1; num <= 100 ; num++) {
			if(num % 3 != 0) continue;
			System.out.println(num);
		}
		
	}
	
}
