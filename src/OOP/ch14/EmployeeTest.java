package OOP.ch14;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
//		System.out.println(employeeLee.serialNum);
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
//		employeeKim.serialNum++; // ������ kim���� ������ �Ʒ� �Ѵ� �ø��� �ѹ��� �����Ѹ�� ���� �⺻�����ڿ� serialNum++ �� �صθ� �ڵ����� ī��Ʈ�� ������
		
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId() + "�Դϴ�.");
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId() + "�Դϴ�.");
		
		
		
	}

}
