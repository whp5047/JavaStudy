package JavaClass.String;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		/* StringBuilder, StringBuffer
		 *  내부적으로 가변적인 char[]를 멤버 변수로가짐
		 *  문자열을 여러번 연결하거나 변경할 때 사용하면 유용
		 *  새로운 인스턴스를 생성하지 않고 char[]를 변경
		 *  StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(snchronization)을 보장
		 *  단일 쓰레드 프로그램에서는 StringBuilder 사용을 권장
		 *  toString() 메서드로 String 반환
		 * 
		 * */
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); 
		buffer.append(android); //문자열 합치기
		System.out.println(System.identityHashCode(buffer)); // 문자열을 합쳐도 있어도 주소값이 동일한 것을 알수 있음 
		
		String test = buffer.toString();
		System.out.println(test);
		
		
	}
	
}
