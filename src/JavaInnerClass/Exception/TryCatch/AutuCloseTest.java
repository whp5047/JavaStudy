package JavaInnerClass.Exception.TryCatch;



public class AutuCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj) { // 안에 코드가 없으나 자동으로 close메서드가 호출되는 모습
			throw new Exception(); // 강제로 Exception으로 넘김
			
		}catch (Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
		
		
	}

}
