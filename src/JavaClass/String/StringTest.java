package JavaClass.String;

public class StringTest {
	public static void main(String[] args) {
	
		/* 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
		 * 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
		 * 
		 * 한번 생성된 String은 불변(immutable)
		 * String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨(메모리의 낭비가 발생가능)
		 * ->> StringBuffer, StringBuilder를 통해 해결
		 * */
		
		String str1 = new String("abc"); // 힙 메모리에 따로 생성
		String str2 = "abc";
		
		System.out.println(str1 == str2); // false
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // true
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //기존의 주소 값
		
		java = java.concat(android); // 문자열을 합치면 새로운 주소 값에 해당 값을 저장
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // 새로운 주소 값이 할당된 것을 확인 가능
		
		
		
		
		
	}
}
