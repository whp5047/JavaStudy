package JavaInnerClass.IOStream;

import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		/*
		 * public static PrintStream out;
		 * public static InputStream in;
		 * public static PrintStream err;
		 * static 변수로 선언되어있어 new 없이 사용 가능
		 * 
		 * System 클래스의 표준 입출력 멤버
		 * System.out : 표준 출력(모니터) 스트림
		 * 
		 * System.in : 표준 입력(키보드) 스트림
		 * int d = System.in.read() // 한바이트 읽기
		 * 
		 * System.err : 표준 에러 출력(모니터) 스트림
		 * System.err.println("에러 메세지");
		 * 
		 * 
		 * */
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
//			while ( (i = System.in.read()) != '\n' ) { 
			while ( (i = irs.read()) != '\n' ) { 
				System.out.print((char)i); //한글은 깨짐 1byte씩 읽기 때문 한글은 2byte
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
