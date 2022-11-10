package OOP2.ch04;

public class TestMethod {
	
	/* 메서드 재정의와 가상 메서드 원리
	 * 메서드의 이름은 주소값을 나타냄
	 * 메서드는 명령어의 set이고 프로그램이 로드되면 메서드영역(코드영역)에 명령어 set이 위치
	 * 해당 메서드가 호출되면 명령어 set이 있는 주소를찾아가 명령어가 실행
	 * 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치함
	 * 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출
	 * 인스턴스가 생성되면 변수는 힙메모리에 생성, 메서드 명령(set)은 처음 한번만 로드
	 * 
	 * 지역변수 > 스택 , 인스턴스 > 힙
	 * 
	 * 가상메서드의 원리
	 * 가상메서드 테이블(vitual method table)에서 해당 메서드에 대한 address를 가지고있음
	 * 재정의된 경우는 재정의 된 메서드의 주소를 가리킴
	 * 
	 * 
	 * */
	int num;
	
	void aaa() {
		System.out.println("aaa() 호출");
	}
	
	public static void main(String[] args) {
		
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();
		
		
	}
	
}
