package OOP2.ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+ "��� �ݾ��� " + price +"�� �Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000); 
		System.out.println(customerKim.showCustomerInfo() + "��� �ݾ���" + price+"�� �Դϴ�.");
		
		Customer vc = new VIPCustomer(12345, "noname"); // Customer�� ���ε��Ǿ� VIP ����ʵ� ��� �Ұ�
		price = vc.calcPrice(1000); // Customer�� ����ȯ�Ǿ� ������ �޼���� �������� ������ �Ǵ°�? 
		System.out.println(vc.showCustomerInfo() + "��� �ݾ��� " + price +"�� �Դϴ�.");
		
		// vc ������ Ÿ���� Customer���� �ν��Ͻ��� Ÿ���� VIPCustomer �� �ڹٿ����� �׻� �ν��Ͻ��� �޼��尡 ȣ���(����޼����� ����)
		// �ڹٿ����� �׻� �ν��Ͻ��� �޼��尡 ȣ��� (����޼����� ����), �ڹ��� ��� �޼���� ����޼��� (virtual method)��
	}
	
}
