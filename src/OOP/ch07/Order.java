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
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + buyerPhoneNumber);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + productNumber);
		
	}
	
	
	
}
