package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		/*	for(�ʱ�ȭ��; ���ǽ�; ������) {
		 * 		���๮;
		 *  }
		 *  �ʱ�ȭ�İ� �����Ŀ� ���ÿ� ������ ���𰡴� ex) for(int i = 0, count = 1 ; i < 10 ; i++ ,count++) 
		 * 
		 *  �ʱ�ȭ�� ���� ����
		 *  int i = 0;
		 *  for( ; i < 5; i ++)
		 *  
		 *  ���ǽ� ��������
		 *  for( i = 0; ; i++){
		 *  	sum += i
		 *  	if(sum> 200)break;
		 *  }
		 * 
		 * 	������ ���� ����
		 * 	for( i = 0; i < 5; ){
		 *  	...
		 *  	i = (++i) % 10;
		 *  }
		 * 
		 * 	���ѹݺ�
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
