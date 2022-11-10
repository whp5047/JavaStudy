package OOP2.ch02;

public class VIPCustomer extends Customer {
	/* 하위 클래스가 생성되는 과정
	 * 하위클래스를 생성하면 상위클래스가 먼저 생성됌
	 * new VIPCustomer()를 호출하면 Customer()가 먼저 호출됌
	 * 클래스가 상속 받은 경우 하위클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출함
	 * 
	 * super(); 상위 클래스를 호출하는 문구가 없으면 컴파일러가 자동으로 넣어줌
	 * 이때 반드시 상위클래스의 기본생성자가 존재 해야함
	 * 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
	 * 상위 클래스의 기본 생성자가 없는 경우 (다른 생성자가 있는 경우) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출함
	 * super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근 가능ㄴ
	 * 
	 * 힙메모리에 
	 * Custmoer()생성자 호출 관련 멤버변수 생성 prive도 생성됌 하지만 접근이 안되는 것 
	 * VIPCustomer() 생성자 호출 관련 멤버변수 생성
	 * 
	 * 형변환(업캐스팅)
	 * 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
	 * Customer customerLee = new VIPCustomer();
	 * 
	 * 상위 클래스 타입의 변수에 하위 클래스 변수가 대입
	 * VIPCustomer vCustomer = new VIPCustomer(); addCustomer(vCustomer)
	 * int addCustomer(Customer customer){
	 * 
	 * 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함
	 * 상속관계에서 모든 하위 클래스는 상위클래스로 형변환(업캐스팅)이 가능 역은 성립x
	 * 
	 * */
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		super(0,"no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() call");
	}
	
	
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}



	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
	
}
