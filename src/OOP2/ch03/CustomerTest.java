package OOP2.ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+ "사용 금액은 " + price +"원 입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000); 
		System.out.println(customerKim.showCustomerInfo() + "사용 금액은" + price+"원 입니다.");
		
		Customer vc = new VIPCustomer(12345, "noname"); // Customer로 바인딩되어 VIP 멤버필드 사용 불가
		price = vc.calcPrice(1000); // Customer로 형변환되어 있으나 메서드는 무엇으로 적용이 되는가? 
		System.out.println(vc.showCustomerInfo() + "사용 금액은 " + price +"원 입니다.");
		
		// vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임 자바에서는 항상 인스턴스의 메서드가 호출됌(가상메서드의 원리)
		// 자바에서는 항상 인스턴스의 메서드가 호출됌 (가상메서드의 원리), 자바의 모든 메서드는 가상메서드 (virtual method)임
	}
	
}
