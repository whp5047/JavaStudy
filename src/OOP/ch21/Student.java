package OOP.ch21;

import java.util.ArrayList;

public class Student {
	
	/* 1001 학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
	 * Lee 학생은 국어와 수학 2 과목을 수강했고, Kim 학생은 국어, 수학, 영어, 3과목을 수강했습니다.
	 * Lee 학생은 국어 100점 수학 50점입니다.
	 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다.
	 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요.
	 * 
	 * */
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	public static int num = 1000;
	
	public Student() {
		num++;
		setStudentId(num);
	}

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public void setSubjectList(String subjectName, int score){
		Subject subject = new Subject(subjectName, score);
		subject.setScore(score);
		subject.setSubjectName(subjectName);
		subjectList.add(subject);
	}

	public void addSubject(String subjectName, int score) {
		this.setSubjectList(subjectName, score);
	}

	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + "과목 성적은 " + subject.getScore() + "입니다.");
			total += subject.getScore();
		}
		System.out.println("학생 " + studentName+ "의 총점은 " + total + " 입니다.");
	}
	
	
	
	

}
