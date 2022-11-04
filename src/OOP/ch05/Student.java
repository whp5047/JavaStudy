package OOP.ch05;

public class Student {
	
		/* ������ : ��ü�� ������ �� new Ű����� �Բ� ��� ex) new Student();
		 * �����ڴ� �Ϲ� �Լ�ó�� ����� ȣ���ϴ� ���� �ƴϰ� ��ü�� �����ϱ� ���� new�Բ� ȣ��
		 * ��ü�� ������ �� ������ ����� �ʱ�ȭ �ϰų� �ٸ� �ʱ�ȭ ����� �����ϴ� �޼��带 ȣ��
		 * �����ڴ� ��ȯ ���� ����, Ŭ������ �̸��� ����
		 * ��κ��� �����ڴ� �ܺο��� ���� ����������,�ʿ信 ���� private�� ���� �Ǵ� ��찡 ����
		 * 
		 * �⺻������(default constructor):
		 * Ŭ������ �ݵ�� ��� �ϳ� �̻��� �����ڰ� ����
		 * Ŭ������ �����ڸ� �������� �ʾƵ� new Ű����� �Բ� �����ڸ� ȣ���� �� ���� 
		 * Ŭ������ �����ڰ� �ϳ��� ���� ��� �����Ϸ��� ������ �ڵ带 �־��� ex) public Student(){}
		 * �Ű�����, �����ΰ� ����
		 * 
		 * */
	
		public int studentNumber;
		public String StudentName;
		public int grade ;
		
		public Student() {}
		
		public Student(int studentNumber, String studentName, int grade) {
			this.studentNumber = studentNumber;
			this.StudentName = studentName;
			this.grade = grade;
			
		}
		
		public String showStudentInfo() {
			 
			return StudentName + " �л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
		}
		

}
