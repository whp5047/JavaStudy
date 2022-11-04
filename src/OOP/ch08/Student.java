package OOP.ch08;

public class Student {
	
	/* ������ �ڷ��� : �⺻�ڷ��� int, long, float, double ��
	 * �����ڷ��� String, Date, Student ��
	 * 
	 * Ŭ���������� ������ ����.
	 * �⺻ �ڷ����� ����ϴ� �޸��� ũ�Ⱑ ������ ������ �����ڷ����� Ŭ������ ����ٸ�
	 * ���� �ڷ����� ��� �� ���� �ش� ������ ���� �����ؾ��� String�� ���������� ���� ���� ��밡��
	 * 
	 * 
	 * */
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void showScoreInfo() {
		
		int total = korea.score + math.score ;
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}
	
}
