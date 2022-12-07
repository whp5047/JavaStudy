package design.adapter;

public interface Electronic110V {
	/*
	 * 호환성 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 하는 것 SOLID 중에 개발 폐쇄 원칙(OCP)
	 * 
	 * */
	
	void powerOn();
	
}
