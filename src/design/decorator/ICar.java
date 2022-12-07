package design.decorator;

public interface ICar {
	/*
	 * ������ ����(Ŭ����)�� �����ϸ鼭 ���� �ʿ��� ���·� ���� �� �� ���
	 * Ȯ���� �ʿ��� ��� ����� ������ε� Ȱ��, SOLID �߿� ������� ��Ģ(OCP), ���� ������Ģ(DIP)
	 * 
	 * */
	
	int getPrice();
	void showPrice();
	
	
}
