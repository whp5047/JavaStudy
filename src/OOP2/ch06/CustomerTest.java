package OOP2.ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Percy");
		Customer customerK = new VIPCustomer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
//		for(Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int pirce = 10000;
//		for(Customer customer : customerList) {
//			
//			int cost = customer.calcPrice(pirce);
//			System.out.println(customer.getCustmerName() + "님이 "+ cost + "원을 지불하셨습니다.");
//			System.out.println(customer.getCustmerName() + "님의 현재 보너스 포인트는 "+ customer.bonusPoint + "원 입니다.");
//		}
		if( customerE instanceof GoldCustomer) {// instanceof 이타입의 변수가 이타입이였는 지확인해주는것
			GoldCustomer vc = (GoldCustomer)customerE; //다운캐스팅
			System.out.println(vc.showCustomerInfo());
			System.out.println(customerE.showCustomerInfo());
		}
		
//		VIPCustomer vc = (VIPCustomer)customerE; // GoldCustomer를 VIPCustomer로 불가능
		
	}
	
}
