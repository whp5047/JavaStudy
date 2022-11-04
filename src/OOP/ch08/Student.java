package OOP.ch08;

public class Student {
	
	/* 변수의 자료형 : 기본자료형 int, long, float, double 등
	 * 참조자료형 String, Date, Student 등
	 * 
	 * 클래스형으로 변수를 선언.
	 * 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만 참조자료형은 클래스에 따라다름
	 * 참조 자료형을 사용 할 때는 해당 변수에 대해 생성해야함 String은 예외적으로 생성 없이 사용가능
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
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
