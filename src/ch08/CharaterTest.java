package ch08;

public class CharaterTest {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); // 유니코드 65가 'A'이기 때문에 int로 형변환하면 65가 출력
		
		char ch2 = 66;
		System.out.println((char)ch2); // 유니코드 66가 'B'이기 때문에 'B'가 출력
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3); // 유니코드 67가 'C'이기 때문에 int로 형변환되어 'C'가 출력
		
		char han = '한';
		char ch = '\uD55C'; //유니코드 사용시 \ u~ 코드 이용
		
		System.out.println(han);
		System.out.println(ch);
		
		/* character set : 문자를 숫자로 변환한 값의 세트
		 * encoding : 문자가 숫자로 변환되는 것
		 * decoding : 숫자에서 다시 문자로 변환되는 것
		 * 
		 * ASKII code : 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
		 * UNICODE : 전 세계 표준으로 만든 문자 세트
		 * UTF-8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음 -웹통신에 사용
		 * UTF-16 : 2바이트로 문자를 표현
		 * 
		 * */
	
	}
}
