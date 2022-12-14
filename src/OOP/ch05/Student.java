package OOP.ch05;

public class Student {
	
		/* 생성자 : 객체를 생성할 때 new 키워드와 함께 사용 ex) new Student();
		 * 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new함께 호출
		 * 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출
		 * 생성자는 반환 값이 없고, 클래스의 이름과 동일
		 * 대부분의 생성자는 외부에서 접근 가능하지만,필요에 의해 private로 선언 되는 경우가 있음
		 * 
		 * 기본생성자(default constructor):
		 * 클래스에 반드시 적어도 하나 이상의 생성자가 존재
		 * 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음 
		 * 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어줌 ex) public Student(){}
		 * 매개변수, 구현부가 없음
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
			 
			return StudentName + " 학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
		}
		

}
