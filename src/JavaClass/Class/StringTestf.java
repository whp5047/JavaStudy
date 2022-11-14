package JavaClass.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
	
	/* forName(String className) : class나 interface을 맵핑해주는 (동적로딩, 동적바인딩)메서드
	 * Class c = Class.forName("java.lang.String");
	 * 
	 * Class 클래스
	 * 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
	 * class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공
	 * 
	 * 클래스 이름으로 직접 Class 가져오기
	 * Class c = String.class;
	 * 
	 * 생성된 인스턴스에서 Class 클래스 가져오기
	 * String s = new String();
	 * Class c = s.getClass(); // Object메서드
	 * 
	 * 동적로딩
	 * 컴파일 시에 데이터 타입이 binding이 되는 것이 아닌, 실행(runtime)중에 데이터 타입을 binding하는 방법
	 * 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에는 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
	 * 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생ㄱ ㅏㅡㄴㅇ
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String"); // 소대문자 오타시에 오류발생
		
		Constructor[] cons = c.getConstructors(); //java.lang.reflect.Constructor에 있음
		
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		
		for(Method mth :m) {
			System.out.println(mth);
		}
		
		
		
	}

}
