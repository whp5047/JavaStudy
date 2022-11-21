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
	
		/* reduce() ����
		 * ���ǵ� ������ �ƴ� ���α׷��Ӱ� ���� ������ ������ ����
		 * 
		 * T reduce(T identity, BinaryOperator<T> accumulator)
		 * ���� �������� ��Ʈ�� ��Ҹ� �Ҹ��ϸ� ���� ����
		 * 
		 * �迭�� ��� ����� ���� ���ϴ� reduce ���� ���� ��
		 * Arrays.stream(arr).reduce(0, (a,b)-> a+b)); 0= �̴ϼ� �� ���ϴ� �ʱ� ��
		 * 
		 * reduce() �޼����� �� ��° ��ҷ� ���޵Ǵ� ���ٽĿ� ���� �پ��� ����� ���� �� �� ����
		 * ���ٽ��� ���� �����ϰų� ���ٽ��� �� ��� BinaryOperator�� ������ Ŭ������ �����
		 * 
		 * */
		
		String greeting[] = {"�ȳ��ϼ��� ~~~", "Hello", "Good mornig", "�ݰ����ϴ�."};
		
//		System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) ->
//		
//			{if( s1.getBytes().length >= s2.getBytes().length ) return s1;
//			else return s2;}
//			));
		
		String str = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);
	
		
		
	}
	
	
}
