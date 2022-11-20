package JavaInnerClass.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
//		Arrays.stream(arr).forEach(n->System.out.println(n)); // intStream 반환 람다식을 통해 수행할 동작을 구현가능
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n)); // 호출하여 사용 후 아래에서 다시 사용 불가
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		
		
		
	}

}
