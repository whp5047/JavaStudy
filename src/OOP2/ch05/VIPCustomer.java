package OOP2.ch05;

public class VIPCustomer extends Customer {
	
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
	
	/* 어노테이션 (annotation)
	 * @Override 재정의된 메서드라는 정보 제공
	 * @Functionallnterface 함수형 인터페이스라는 정보 제공
	 * @Deprecated 사용되지 않을 수 있는 변수, 메서드에서 사용
	 * @SupperessWarnings 특정 경고가 나타나지 않도록함
	 * @SupperWarnings("deprecation") < @Deprecated가 나타나지 않도록 함
	 * */
	
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		price -= (int)(price * salesRatio);
		
		return price;
	}
	
	
}
