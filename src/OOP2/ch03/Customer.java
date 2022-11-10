package OOP2.ch03;

public class Customer {
	
	/* 메서드 재정의하기 (Overriding)
	 * 하위 클래스에서 메서드 재정의 하기
	 * 오버라이딩(Overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위클래스에서 구현할 내용과 맞지 않은 경우 하위 클래스에서
	 * 동일한 이름의 메서드를 재정의 할 수 있음
	 * VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
	 * 재정의 하여 구현해야함
	 * 
	 * 메서드 이름이 같고 여러개의 매개변수 < 오버로딩
	 * 오버라이딩 < 반환 값, 이름, 매개변수 타입, 갯수는 같아야하고 실행부가 달라야함
	 * */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "Silver";
//		bonusRatio = 0.01;
//		System.out.println("Customer() call");
//	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
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
