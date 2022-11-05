package OOP.ch12;

public class Bus {
	
	/* 객체간의 협력(Collaboration)
	 * 객체지향 프로그램에서 객체 간에는 협력이 이뤄짐 Ex) 점원(객체)에게 돈을 지붛하고 나(객체)는 상품을 받음
	 * 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
	 * 매개 변수로 객체가 전달되는 경우가 발생
	 * 
	 * 예제 ) James와 Tomas는 각각 버스와 지하철을 타고 학교에간다.
	 * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불한다
	 * Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서1200원을 지불한다.
	 * 두 학생이 버스와 지하철을 타는 상황을 구현해보아라. 
	 * 
	 * */
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명이고, 수입은 "
						+ money + "원 입니다." );
	}
	
}
