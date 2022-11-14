package JavaClass.Object;

import java.util.Objects;

public class Student implements Cloneable{
	
	/* equals() : 두 인스턴스의 주소 값을 비교하여 true/ false 를 반환
	 * 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
	 * 인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음 (같은학번, 같은사번, 같은 아이디의 회원)
	 * 
	 * hashCode() : 인스턴스의 저장 주소를 반환함
	 * 힙메모리에 인스턴스가 저장되는 방식이 hash 방식
	 * 정보를 저장, 검색하는 자료구조 > hash
	 * 자료의 특정 값(키 값) 에 대한 저장위치를 반환해주는 해시 함수를 사용 index = hash(key)
	 * 
	 * clone()메서드
	 * 객체의 원본을 복제하는데 사용하는 메서드
	 * 생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
	 * 
	 * clone() 메서드를 사용하면 객체의 정보(멤버 변수 값등)가 동일한 또 다른인스턴스가 생성되는 것이므로, 객체지향 프로그래밍에서 정보의 은닉
	 * 객체 보호의 관점에서 위배 될 수 있음
	 * 
	 * 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해줌
	 * 
	 * 
	 * 
	 * */
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override //논리적 재정의
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if( this.studentName == std.studentName) {
				return true;
				
			}else {
				return false;
			}
				
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
