package OOP2.ch01;

public class VIPCustomer extends Customer {
	/* ���� Ŭ������ �����Ǵ� ����
	 * ����Ŭ������ �����ϸ� ����Ŭ������ ���� ������
	 * new VIPCustomer()�� ȣ���ϸ� Customer()�� ���� ȣ���
	 * Ŭ������ ��� ���� ��� ����Ŭ������ �����ڿ����� �ݵ�� ���� Ŭ������ �����ڸ� ȣ����
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
