package ch09;

public class LocalVariableType {
	public static void main(String[] args) {
		
		// var Java 10버전부터 지원하는 지역변수 타입 추론기능 javaScript와 같은 스크립트언어 기능이지만 Java의 경우 간단하게 지원
		
		var i = 10; //int
		var j = 10.0; // double
		var str = "hello"; //String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 문자형 초기화 가능
		System.out.println(str);
		
		// str = 3; 과 같이 위에서 var가 String으로 선언과 초기화 후 int로 초기화 불가능 
		
		
	}
}
