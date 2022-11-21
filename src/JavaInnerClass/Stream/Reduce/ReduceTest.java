package JavaInnerClass.Stream.Reduce;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		
		if( s1.getBytes().length >= s2.getBytes().length ) return s1;
		else return s2;
		
	}
}

public class ReduceTest {
	
	public static void main(String[] args) {
	
		/* reduce() 연산
		 * 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
		 * 
		 * T reduce(T identity, BinaryOperator<T> accumulator)
		 * 최종 연산으로 스트림 요소를 소모하며 연산 수행
		 * 
		 * 배열의 모든 요소의 합을 구하는 reduce 연산 구현 예
		 * Arrays.stream(arr).reduce(0, (a,b)-> a+b)); 0= 이니셜 값 더하는 초기 값
		 * 
		 * reduce() 메서드의 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행 할 수 있음
		 * 람다식을 직접 구현하거나 람다식이 긴 경우 BinaryOperator를 구현한 클래스를 사용함
		 * 
		 * */
		
		String greeting[] = {"안녕하세요 ~~~", "Hello", "Good mornig", "반갑습니다."};
		
//		System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) ->
//		
//			{if( s1.getBytes().length >= s2.getBytes().length ) return s1;
//			else return s2;}
//			));
		
		String str = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);
	
		
		
	}
	
	
}
