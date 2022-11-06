package OOP.ch14;

public class Employee {
	
	/* ���� �ν��Ͻ����� �������� ����ϴ� ���� -> static
	 * ���� �ν��Ͻ��� �����ϴ� ���� ���� �ʿ��� ��쿡 ���
	 * 	�л����� ���ο� �й� ����
	 *	ī��ȸ�簡 ī�带 ���� �߱��Ҷ����� ���ο� ī�� ��ȣ�� �ο�
	 * 	ȸ�翡 ����� �Ի��Ҷ� ���� ���ο� ����� �ʿ��� ���
	 * 
	 */
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
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
