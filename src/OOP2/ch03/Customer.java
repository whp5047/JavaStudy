package OOP2.ch03;

public class Customer {
	
	/* �޼��� �������ϱ� (Overriding)
	 * ���� Ŭ�������� �޼��� ������ �ϱ�
	 * �������̵�(Overriding) : ���� Ŭ������ ���ǵ� �޼����� ���� ������ ����Ŭ�������� ������ ����� ���� ���� ��� ���� Ŭ��������
	 * ������ �̸��� �޼��带 ������ �� �� ����
	 * VIPCustomer Ŭ������ calcPrice()�� �������� ������� ����
	 * ������ �Ͽ� �����ؾ���
	 * 
	 * �޼��� �̸��� ���� �������� �Ű����� < �����ε�
	 * �������̵� < ��ȯ ��, �̸�, �Ű����� Ÿ��, ������ ���ƾ��ϰ� ����ΰ� �޶����
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
		return customerName + "���� ����� " + customerGrade+ "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�." ;
	}
	
	
}
