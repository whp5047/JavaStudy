package OOP.ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		/* 인스턴스 : 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태
		 * 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수를 가짐
		 * 학생의 클래스에서 생성된 각각의 인스턴스는 가각 다른 이름, 학번, 학년의 값을가짐 new 를 통해 인스턴스 생성
		 * 
		 * 
		 * 힙 메모리 : 생성된 인스턴스는 동적메로이 즉 힙메모리에 할당됌
		 * C, C++ 언어에서 사용하는 동적 메모리를 프로그래머가 free(), delete를 사용해 해제 시켜야하지만
		 * 자바는 Garbage Collector가 주기적으로 사용하지 않는 메모리를 수거 
		 * 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를가짐
		 * 
		 * 객체 : 객체 지향 프로그램의 대상, 생성된 인스터늣
		 * 클래스 : 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태
		 * 멤버 변수 : 클래스의 속성, 특성
		 * 메서드 : 멤버 변수를 이용해 클래스의 기능을 구현한 함수
		 * 참조 변수 : 메모리에 생성된 인스턴스를 가르키는 변수
		 * 참조 값 : 생성된 인스턴스의 메모리 주소 값
		 * 
		 * */
		
		
		Student studentLee = new Student(); // 참조변수
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		System.out.println(studentLee); // JVM이 할당해준 가상의 주소
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim); // JVM이 할당해준 가상의 주소
		
		
		
	}

}
