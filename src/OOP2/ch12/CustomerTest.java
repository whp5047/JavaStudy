package OOP2.ch12;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell sell = customer;
		sell.sell();
		sell.order();
		
		
	}

}
