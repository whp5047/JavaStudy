package OOP2.ch01;

public class Customer {
	
	/* 클래스의 상속 :
	 * 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아 속성이나 기능을 확장하여 클래스를 구현
	 * 이미 구현된 크래스보다 더 구체적인 기능을 가진 클래스를 구현해야할때 기존 클래스를 상속
	 * 
	 *  상속하는 클래스 : 상위클래스 parent class, base class, super class
	 *  상속받는 클래스 : 하위클래스, child class, derived class, sub class
	 *  
	 *  상속의 문법 class B extends A
	 *  
	 *  상속을 구현하는 경우
	 *  상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
	 *  하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
	 *  하위 클래스가 상위 클래스의 속성과 기능을 확장(extends)한다는 의미
	 *
	 *  *멤버십 시나리오
	 *  회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과
	 *  이보다 충성도가 높은 우수고객(VIP)에 따른 서비스를 제공하고자 함
	 *  물품을 구매 할 떄 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름
	 *  여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
	 *  멤버십에 대한 구현을 클래스 상속을 활용해 구현
	 *
	 *  Custmer > 고객 아이디, 고객이름 등급, 보너스 포인트, 적립비율 1%
	 *  
	 *  
	 * */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustmerName() {
		return customerName;
	}

	public void setCustmerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade+ "이며, 보너스 포인트는 " + bonusPoint + "입니다." ;
	}
	
	
}
