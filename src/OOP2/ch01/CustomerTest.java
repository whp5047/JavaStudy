package OOP2.ch01;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		
		customerLee.setCustmerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustmerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}
	
}
