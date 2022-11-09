package OOP.ch21;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.setSubjectList("국어", 100);
		studentLee.setSubjectList("수학", 50);

		Student studentKim = new Student("Kim");
		
		studentKim.setSubjectList("국어", 70);
		studentKim.setSubjectList("수학", 85);
		studentKim.setSubjectList("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
		
		
	}

}
