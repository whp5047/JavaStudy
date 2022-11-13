package OOP2.ch13.gameLevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("중급자 레벨부터 점프할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("고급자 레벨부터 턴할 수 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== 초급자 레벨입니다. ===");
	}
	
	
	
	
	
}
