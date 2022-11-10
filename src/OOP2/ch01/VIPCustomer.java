package OOP2.ch01;

public class VIPCustomer extends Customer {
	/* 하위 클래스가 생성되는 과정
	 * 하위클래스를 생성하면 상위클래스가 먼저 생성됌
	 * new VIPCustomer()를 호출하면 Customer()가 먼저 호출됌
	 * 클래스가 상속 받은 경우 하위클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출함
	 * 
	 * */
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
	
}
