package OOP2.ch08;

public abstract class Car {
	
	/* ���ø� �޼���
	 * �߻� �޼��峪 ���� �ȸ޼��带 Ȱ���Ͽ� �ڵ��� �帧(�ó�����)�� ���� �ϴ� �޼���
	 * Ŭ���� final�� �����Ͽ� ���� Ŭ�������� ������ �� �� ������ < ��� �Ұ�
	 * ����, final ���� < ���
	 * �޼��� final ���� Ŭ�������� ������ �Ұ����� �޼���
	 * �����ӿ�ũ���� ���� ����� ��������
	 * �߻� Ŭ������ ����� ���� Ŭ�������� ���ø� �޼��带 Ȱ���Ͽ� ��ü���� �帧�� �����ϰ� ���� Ŭ��������
	 * �ٸ��� �����Ǿ�� �ϴ� �κ��� �߻�޼���� �����Ͽ� ���� Ŭ�������� �����ϵ��� ��
	 * 
	 * */
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); // < �� �޼ҵ� �ʿ��Ѱ�� ����Ŭ�������� �������ؼ� ����ϴ� �޼ҵ�
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {} // �߻�޼��尡 �ƴ϶� �����Ǿ� �ִµ� ����ΰ� ���� �ʿ��Ѱ�� ����Ŭ�������� ������
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
