package OOP2.ch01;

public class Customer {
	
	/* Ŭ������ ��� :
	 * ���ο� Ŭ������ ���� �� �� �̹� ������ Ŭ������ ���(inheritance) �޾� �Ӽ��̳� ����� Ȯ���Ͽ� Ŭ������ ����
	 * �̹� ������ ũ�������� �� ��ü���� ����� ���� Ŭ������ �����ؾ��Ҷ� ���� Ŭ������ ���
	 * 
	 *  ����ϴ� Ŭ���� : ����Ŭ���� parent class, base class, super class
	 *  ��ӹ޴� Ŭ���� : ����Ŭ����, child class, derived class, sub class
	 *  
	 *  ����� ���� class B extends A
	 *  
	 *  ����� �����ϴ� ���
	 *  ���� Ŭ������ ���� Ŭ���� ���� �� �Ϲ����� ����� ����� ����
	 *  ���� Ŭ������ ���� Ŭ���� ���� �� ��ü���� ����� ����� ����
	 *  ���� Ŭ������ ���� Ŭ������ �Ӽ��� ����� Ȯ��(extends)�Ѵٴ� �ǹ�
	 *
	 *  *����� �ó�����
	 *  ȸ�翡�� �� ������ Ȱ���� ���� ���񽺸� �ϱ� ���� �Ϲݰ�(Customer)��
	 *  �̺��� �漺���� ���� �����(VIP)�� ���� ���񽺸� �����ϰ��� ��
	 *  ��ǰ�� ���� �� �� ����Ǵ� �������� �����Ǵ� ���ʽ� ����Ʈ�� ������ �ٸ�
	 *  ���� ����ʿ� ���� ���� �پ��� ���񽺸� ������ �� ����
	 *  ����ʿ� ���� ������ Ŭ���� ����� Ȱ���� ����
	 *
	 *  Custmer > �� ���̵�, ���̸� ���, ���ʽ� ����Ʈ, �������� 1%
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
		return customerName + "���� ����� " + customerGrade+ "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�." ;
	}
	
	
}
