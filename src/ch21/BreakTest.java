package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		/* Break문 
		 * 감싸고 있는 제어문의 블록을 빠져나오는 기능 Switch 문에서도 사용
		 * 반복문에서 주로 조건문과 같이 사용 여러 반복문이 중첩되어 있는경우 break문이 포함 되어있는 반복문만 탈출
		 * 
		 * */
		int sum = 0;
		int num = 1;
		
		for(num = 1 ; ; num++) {
			sum += num;
			if(sum >= 100)break;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		
	}

}
