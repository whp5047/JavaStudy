package OOP2.ch11;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)return ERORR;
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}
	
	//구현하는 클래스에서 재정의 가능 (인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능함)
	@Override
	public void dscription(){
		System.out.println("CompleteCalc에서 재정의한 default 메서드.");
	}
	
	
	

}
