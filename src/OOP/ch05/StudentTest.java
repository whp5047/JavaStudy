package OOP.ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo()); // null , 0, 0으로 나옴 생성시 자동으로 초기화 되었기 때문 
		
		Student studentKim = new Student(123456, "Kim", 3); // 생성자를 통한 맴버 초기화
		System.out.println(studentKim.showStudentInfo());
		
	}

}
