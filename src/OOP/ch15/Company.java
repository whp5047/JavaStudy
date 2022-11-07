package OOP.ch15;

public class Company {
	
	/* 싱글톤 패턴 > 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
	 * static 변수, 메서드를 활용하여 구현 할 수 있음
	 * 
	 * 
	 * 
	 * 
	 * */
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		
		if( instance == null ) {
			instance = new Company();
		}
		
		return instance;
		
	}
	
}
