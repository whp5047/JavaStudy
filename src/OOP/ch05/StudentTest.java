package OOP.ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo()); // null , 0, 0���� ���� ������ �ڵ����� �ʱ�ȭ �Ǿ��� ���� 
		
		Student studentKim = new Student(123456, "Kim", 3); // �����ڸ� ���� �ɹ� �ʱ�ȭ
		System.out.println(studentKim.showStudentInfo());
		
	}

}
