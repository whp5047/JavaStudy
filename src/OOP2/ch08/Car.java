package OOP2.ch08;

public abstract class Car {
	
	/* 템플릿 메서드
	 * 추상 메서드나 구현 된메서드를 활용하여 코드의 흐름(시나리오)를 정의 하는 메서드
	 * 클래스 final로 선언하여 하위 클래스에서 재정의 할 수 없게함 < 상속 불가
	 * 변수, final 선언 < 상수
	 * 메서드 final 하위 클래스에서 재정의 불가능한 메서드
	 * 프레임워크에서 많이 사용디는 설계패턴
	 * 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서
	 * 다르게 구현되어야 하는 부분은 추상메서드로 선언하여 하위 클래스에서 구현하도록 함
	 * 
	 * */
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); // < 훅 메소드 필요한경우 하위클래스에서 재정의해서 사용하는 메소드
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 추상메서드가 아니라 구현되어 있는데 실행부가 없음 필요한경우 하위클래스에서 재정의
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
