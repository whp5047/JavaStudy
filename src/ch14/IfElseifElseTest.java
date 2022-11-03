package ch14;

public class IfElseifElseTest {
	public static void main (String[] args) {
		
		/*
		 *  if - else if - else 문 
		 *  각 조건은 상호 배타적관계
		 *  
		 *  if(조건문1){
		 *  	수행문;	조건식이 "참"인 경우 실행 이후 조건문 탈출
		 *  
		 *  }else if(조건문2){
		 *  	수행문;	조건식이 "참"인 경우 실행 이후 조건문 탈출
		 *  
		 *  }else if(조건문3){
		 *  	수행문;	조건식이 "참"인 경우 실행 이후 조건문 탈출
		 *  
		 *  }else{
		 *  	수행문; 디폴트 컨디션 위의 조건을 하나도 만족시키지 못한다면 실행
		 *  }
		 *  
		 *  수행문; 조건문이 끝나고 실행	
		 * 
		 */
		
		int age = 15;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
			
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
			
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
			
		}else {
			charge = 3000;
			System.out.println("일반인입니다.");
			
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
				
		
		
		
		
	}
}
