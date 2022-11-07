package OOP.ch14;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
//		System.out.println(employeeLee.serialNum);
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
//		employeeKim.serialNum++; // 증가는 kim에서 했지만 아래 둘다 시리얼 넘버가 증가한모습 따라서 기본생성자에 serialNum++ 을 해두면 자동으로 카운트가 증가됌
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
		
		
		
	}

}
