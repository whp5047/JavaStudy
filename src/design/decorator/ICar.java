package design.decorator;

public interface ICar {
	/*
	 * 기존의 뼈대(클래스)를 유지하면서 이후 필요한 형태로 수정 할 때 사용
	 * 확장이 필요한 경우 상속의 대안으로도 활용, SOLID 중에 개방폐쇄 원칙(OCP), 의존 역전원칙(DIP)
	 * 
	 * */
	
	int getPrice();
	void showPrice();
	
	
}
