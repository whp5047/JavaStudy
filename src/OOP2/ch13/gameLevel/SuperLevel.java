package OOP2.ch13.gameLevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== ����� �����Դϴ�. ===");
	}
	
}
