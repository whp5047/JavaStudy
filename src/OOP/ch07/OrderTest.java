package OOP.ch07;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderNumber = "202011020003";
		order.buyerPhoneNumber = "01023450001";
		order.address = "서울시 강남구 역삼동 111-333";
		order.orderDate = "20201102";
		order.orderTime = "130258";
		order.price = 35000;
		order.productNumber = 0003 ;
		
		order.orderDetail();
		
	}
}	
