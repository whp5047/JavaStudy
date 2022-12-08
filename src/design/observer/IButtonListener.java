package design.observer;

public interface IButtonListener {
	
	/* Observer pattern : 관찰자패턴
	 * 
	 * 변화가 일어났을 때 미리 등록된 다른 클래스에 통보해주는 패턴을 구현
	 * event listener 에서 자주 활용
	 * 
	 * */
	
	void clickEvent(String event);
	
	
}
