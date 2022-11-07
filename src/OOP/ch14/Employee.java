package OOP.ch14;

public class Employee {
	
	/* 여러 인스턴스에서 공통으로 사용하는 변수 -> static
	 * 여러 인스턴스가 공유하는 기준 값이 필요한 경우에 사용
	 * 	학생마다 새로운 학번 생성
	 *	카드회사가 카드를 새로 발급할때마다 새로운 카드 번호를 부여
	 * 	회사에 사원이 입사할때 마다 새로운 사번이 필요한 경우
	 * 
	 * 변수의 유혀 범위와 메모리
	 * 
	 * 지역변수(로컬변수) : 함수 내부에 선언 , 함수내부에서만 사용, 메모리(스택), 함수가 호출될 떄 생성되고 함수가 끝나면 소멸
	 * 
	 * 멤버변수(인스턴스 변수) : 클래스 멤버 변수로 선언, 클래스 내부에서 사용하고 private가 아니면 참조변수로 다른클래서에서 사용가능, 메모리(힙)
	 * 					  인스턴스가 생성도리 때 힙에서 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됌
	 * 
	 * static 변수(클래스 변수) : static 예약어를 사용하여 클래스 내부에 선언, 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능
	 * 						메모리(데이터 영역), 프로그램이 처음 시작할 때 상수와 함꼐 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됌
	 * 
	 * static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
	 * 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
	 * 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됌, 상황에 적절하게 변수를 사용
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
	
	public static int getSerialNum() { // static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출이 가능
									   //인스턴스 생성전에 호출이 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
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
