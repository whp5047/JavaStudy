package OOP.ch21;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.setSubjectList("����", 100);
		studentLee.setSubjectList("����", 50);

		Student studentKim = new Student("Kim");
		
		studentKim.setSubjectList("����", 70);
		studentKim.setSubjectList("����", 85);
		studentKim.setSubjectList("����", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
		
		
	}

}
