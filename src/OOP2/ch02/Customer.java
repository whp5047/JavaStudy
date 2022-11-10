package OOP2.ch02;

public class Customer {
	
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
		System.out.println("Customer(int, String) call");
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
