package OOP2.ch02;

public class VIPCustomer extends Customer {
	/* ���� Ŭ������ �����Ǵ� ����
	 * ����Ŭ������ �����ϸ� ����Ŭ������ ���� ������
	 * new VIPCustomer()�� ȣ���ϸ� Customer()�� ���� ȣ���
	 * Ŭ������ ��� ���� ��� ����Ŭ������ �����ڿ����� �ݵ�� ���� Ŭ������ �����ڸ� ȣ����
	 * 
	 * super(); ���� Ŭ������ ȣ���ϴ� ������ ������ �����Ϸ��� �ڵ����� �־���
	 * �̶� �ݵ�� ����Ŭ������ �⺻�����ڰ� ���� �ؾ���
	 * ���� Ŭ�������� ������ ���� Ŭ������ ���� ���� ��
	 * ���� Ŭ������ �⺻ �����ڰ� ���� ��� (�ٸ� �����ڰ� �ִ� ���) ���� Ŭ���������� �����ڿ����� super�� �̿��Ͽ� ��������� ���� Ŭ������ �����ڸ� ȣ����
	 * super�� ������ ���� Ŭ���� �ν��Ͻ��� ���� ���� �����Ƿ� super�� �̿��Ͽ� ���� Ŭ������ �޼��峪 ��� ������ ���� ���ɤ�
	 * 
	 * ���޸𸮿� 
	 * Custmoer()������ ȣ�� ���� ������� ���� prive�� ������ ������ ������ �ȵǴ� �� 
	 * VIPCustomer() ������ ȣ�� ���� ������� ����
	 * 
	 * ����ȯ(��ĳ����)
	 * ���� Ŭ������ ������ �����ϰ� ���� Ŭ������ �����ڷ� �ν��Ͻ��� ����
	 * Customer customerLee = new VIPCustomer();
	 * 
	 * ���� Ŭ���� Ÿ���� ������ ���� Ŭ���� ������ ����
	 * VIPCustomer vCustomer = new VIPCustomer(); addCustomer(vCustomer)
	 * int addCustomer(Customer customer){
	 * 
	 * ���� Ŭ������ ���� Ŭ������ Ÿ���� �����ϰ� �����Ƿ� ���� Ŭ�������� ������ �� ��ȯ�� ������
	 * ��Ӱ��迡�� ��� ���� Ŭ������ ����Ŭ������ ����ȯ(��ĳ����)�� ���� ���� ����x
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
