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
//			System.out.println(customer.getCustmerName() + "���� "+ cost + "���� �����ϼ̽��ϴ�.");
//			System.out.println(customer.getCustmerName() + "���� ���� ���ʽ� ����Ʈ�� "+ customer.bonusPoint + "�� �Դϴ�.");
//		}
		if( customerE instanceof GoldCustomer) {// instanceof ��Ÿ���� ������ ��Ÿ���̿��� ��Ȯ�����ִ°�
			GoldCustomer vc = (GoldCustomer)customerE; //�ٿ�ĳ����
			System.out.println(vc.showCustomerInfo());
			System.out.println(customerE.showCustomerInfo());
		}
		
//		VIPCustomer vc = (VIPCustomer)customerE; // GoldCustomer�� VIPCustomer�� �Ұ���
		
	}
	
}
