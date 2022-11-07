package OOP.ch14;

public class Employee {
	
	/* ���� �ν��Ͻ����� �������� ����ϴ� ���� -> static
	 * ���� �ν��Ͻ��� �����ϴ� ���� ���� �ʿ��� ��쿡 ���
	 * 	�л����� ���ο� �й� ����
	 *	ī��ȸ�簡 ī�带 ���� �߱��Ҷ����� ���ο� ī�� ��ȣ�� �ο�
	 * 	ȸ�翡 ����� �Ի��Ҷ� ���� ���ο� ����� �ʿ��� ���
	 * 
	 * ������ ���� ������ �޸�
	 * 
	 * ��������(���ú���) : �Լ� ���ο� ���� , �Լ����ο����� ���, �޸�(����), �Լ��� ȣ��� �� �����ǰ� �Լ��� ������ �Ҹ�
	 * 
	 * �������(�ν��Ͻ� ����) : Ŭ���� ��� ������ ����, Ŭ���� ���ο��� ����ϰ� private�� �ƴϸ� ���������� �ٸ�Ŭ�������� ��밡��, �޸�(��)
	 * 					  �ν��Ͻ��� �������� �� ������ �����ǰ�, ������ �÷��Ͱ� �޸𸮸� ������ �� �Ҹ��
	 * 
	 * static ����(Ŭ���� ����) : static ���� ����Ͽ� Ŭ���� ���ο� ����, Ŭ���� ���ο��� ����ϰ� private�� �ƴϸ� Ŭ���� �̸����� �ٸ� Ŭ�������� ��� ����
	 * 						�޸�(������ ����), ���α׷��� ó�� ������ �� ����� �Բ� ������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� ������ �� �Ҹ��
	 * 
	 * static ������ ���α׷��� �޸𸮿� �ִ� ���� ��� �� ������ �����ϹǷ� �ʹ� ū �޸𸮸� �Ҵ��ϴ� ���� ���� ����
	 * Ŭ���� ������ ���� �޼��忡�� ����ϴ� ������ ��� ������ �����ϴ� ���� ����
	 * ��� ������ �ʹ� ������ �ν��Ͻ� ���� �� �������� �޸𸮰� �Ҵ��, ��Ȳ�� �����ϰ� ������ ���
	 * 
	 */
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() { // static �޼���� �ν��Ͻ� ������ �����ϰ� Ŭ���� �̸����� ȣ���� ����
									   //�ν��Ͻ� �������� ȣ���� �� �� �����Ƿ� static �޼��� ���ο����� �ν��Ͻ� ������ ����� �� ����
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
