package OOP.ch07;

public class Order {
	
	public String orderNumber;
	public String buyerPhoneNumber;
	public String address;
	public String orderDate;
	public String orderTime;
	public int price;
	public int productNumber;
	
	public Order() {}

	public Order(String orderNumber, String buyerPhoneNumber, String address, String orderDate, String orderTime, int price,
			int productNumber) {
		this.orderNumber = orderNumber;
		this.buyerPhoneNumber = buyerPhoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
		this.productNumber = productNumber;
	}
	
	public void orderDetail() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + buyerPhoneNumber);
		System.out.println("�ֹ� �� �ּ�: " + address);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + productNumber);
		
	}
	
	
	
}
