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
		System.out.println("��� �����߽��ϴ�.");
	}
	
	//�����ϴ� Ŭ�������� ������ ���� (�������̽��� ������ Ŭ������ �ν��Ͻ��� ���� �Ǿ�� ��� ������)
	@Override
	public void dscription(){
		System.out.println("CompleteCalc���� �������� default �޼���.");
	}
	
	
	

}
