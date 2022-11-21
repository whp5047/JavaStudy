package JavaInnerClass.Exception.TryCatch;

public class ArrayExceptionHanding {

	public static void main(String[] args) {
		
		/* try -catch 
		 * try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try 블록안에서 예오가ㅏ 발생하면 catch블록이 수행됨
		 * try {
		 *		예외가 발생할 수 있는부분
		 *	} catch (처리할 예외타입 e) {
		 *		try 블록 안에서 예외가 발생했을 떄 예외를 처리하는 부분
	     *	}
	     * 
		 * */
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		for(int i = 0; i <= 5; i++) { // i <=5로 설정하여 인덱스의 범위보다 실행을 많이함 ArrayIndexOutOfBoundsException 발생
//			System.out.println(arr[i]);
//		}
		
		try {
			for(int i = 0; i <= 5; i++) { // i <=5로 설정하여 인덱스의 범위보다 실행을 많이함 ArrayIndexOutOfBoundsException 발생
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("실행체크");
		
	}

}
