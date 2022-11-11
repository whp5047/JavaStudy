package OOP2.ch07;

public abstract class Computer {
	
	/* �߻� Ŭ����(abstract class) 
	 * ���� �ڵ� ���� �޼����� ���� �ִ� �߼� �޼���(abstract method)�� ������ Ŭ����
	 * �޼��弱��(declaration): ��ȯŸ��, �޼��� �̸�, �Ű������� ����
	 * �޼��� ����(definition) : �޼��� ����(implementation)�� ������ �ǹ� ������(body)�� ����({})
	 * int add(int x, int y); ����
	 * int add(int x, int x){} �����ΰ� ����, �߻�޼��尡 �ƴ�
	 * abstract ����� ���
	 * �߻�Ŭ������ new �� �� ���� (�ν��Ͻ�ȭ �� �� ����)
	 * 
	 * �����ϱ�
	 * �޼��忡 ���� �ڵ尡 ������ abstract ����
	 * abstract�� ����� �޼��带 ���� Ŭ������ abstract�� ����
	 * ��� �޼��尡 ���� �� Ŭ������ abstract�� ����Ǹ� �߻� Ŭ������ �ν��Ͻ�ȭ �� �� ����
	 * �߻� Ŭ������ �߻� �޼���� ���� Ŭ������ ����Ͽ� ����
	 * 
	 * 
	 * 
	 * */
	
    public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
