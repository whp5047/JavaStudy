package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		/*	for(초기화식; 조건식; 증감식) {
		 * 		수행문;
		 *  }
		 *  초기화식과 증감식에 동시에 여러개 선언가능 ex) for(int i = 0, count = 1 ; i < 10 ; i++ ,count++) 
		 * 
		 *  초기화식 생략 가능
		 *  int i = 0;
		 *  for( ; i < 5; i ++)
		 *  
		 *  조건식 생략가능
		 *  for( i = 0; ; i++){
		 *  	sum += i
		 *  	if(sum> 200)break;
		 *  }
		 * 
		 * 	증감식 생략 가능
		 * 	for( i = 0; i < 5; ){
		 *  	...
		 *  	i = (++i) % 10;
		 *  }
		 * 
		 * 	무한반복
		 * 	for(; ; ){
		 * 		...
		 * 	}
		 * 
		 * */
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10 ; i++ , count++) {
			
			sum += count;
		}
		
		System.out.println("sum : " + sum);
		
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println("num : " + num);
		System.out.println("total : " + total);
		
	}

}
