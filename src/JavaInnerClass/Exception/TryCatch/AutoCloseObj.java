package JavaInnerClass.Exception.TryCatch;

public class AutoCloseObj  implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("closing...");
		
	}
	
	/* try - with - resources 문
	 * 
	 * 리소스 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
	 * 자바 7부터 제공되는 구문
	 * 리소스를 try() 내부에서 선언해야함 // 자바 7까지
	 * close()를 명시적으로 호출하지 않아도 try{} 블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨
	 * 해당 리소스 클래스가 AutoClaseable 인터페이스를 구현해야함
	 * FileInputStream의 경우에는 AutoClaseAble 을 구현하고 있음
	 * 
	 * 자바 9부터 리소스 try{} 외부에 선언하고 변수만을 try(obj)와 같이 사용 할 수 있음
	 * 
	 * */
	
}
