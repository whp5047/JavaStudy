package OOP.ch21;

import java.util.ArrayList;

public class Student {
	
	/* 1001 �й� Lee�� 1002�й� Kim, �� �л��� �ֽ��ϴ�.
	 * Lee �л��� ����� ���� 2 ������ �����߰�, Kim �л��� ����, ����, ����, 3������ �����߽��ϴ�.
	 * Lee �л��� ���� 100�� ���� 50���Դϴ�.
	 * Kim �л��� ���� 70��, ���� 85��, ���� 100���Դϴ�.
	 * Student�� Subject Ŭ������ ����� ArrayList�� Ȱ���Ͽ� �� �л��� ���� ������ ������ ����ϼ���.
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
			System.out.println("�л� " + studentName + "�� " + subject.getSubjectName() + "���� ������ " + subject.getScore() + "�Դϴ�.");
			total += subject.getScore();
		}
		System.out.println("�л� " + studentName+ "�� ������ " + total + " �Դϴ�.");
	}
	
	
	
	

}
