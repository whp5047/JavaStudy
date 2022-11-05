package OOP.ch12;

public class Bus {
	
	/* ��ü���� ����(Collaboration)
	 * ��ü���� ���α׷����� ��ü ������ ������ �̷��� Ex) ����(��ü)���� ���� �����ϰ� ��(��ü)�� ��ǰ�� ����
	 * ������ ���ؼ��� �ʿ��� �޼����� �����ϰ� �̸� ó���ϴ� ����� �����Ǿ�� ��
	 * �Ű� ������ ��ü�� ���޵Ǵ� ��찡 �߻�
	 * 
	 * ���� ) James�� Tomas�� ���� ������ ����ö�� Ÿ�� �б�������.
	 * James�� 5000���� ������ �־���, 100�� ������ Ÿ�鼭 1000���� �����Ѵ�
	 * Tomas�� 10000���� ������ �־���, �ʷϻ� ����ö�� Ÿ�鼭1200���� �����Ѵ�.
	 * �� �л��� ������ ����ö�� Ÿ�� ��Ȳ�� �����غ��ƶ�. 
	 * 
	 * */
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "���� �°� ���� " + passengerCount + "���̰�, ������ "
						+ money + "�� �Դϴ�." );
	}
	
}
