package OOP2.ch12;

public interface Buy {
	
	/* 여러 인터페이스 구현, 인터페이스 상속
	 * 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 있음
	 * 디폴트 메서드가 중복되는 경우 구현하는 클래스에서 재정의
	 * 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당인터페이스에 선언된 메서드만 사용 가능
	 * 
	 * 클래스는 다중상속이 불가능 Diamond Problem
	 * 
	 * */
	
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
	
	
}
