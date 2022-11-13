package OOP2.ch13.gameLevel;

public abstract class PlayerLevel {
	
	/* Player가 있고 Player는 GameLevel 속성을 가집닌다. 각 GameLevel 단계 마다 run(), jump(), turn() 세가지 기능이 업그레이드 됩니다.
	 * 초보자 레벨 : 천천히 달립니다. run()만가능
	 * 중급자 레벨 : 빨리 달리고, 점프할 수 있습니다. run(), jump()가능
	 * 고급자 레벨 : 엄청빨리달리고 ,높게 점프하고, 턴 할수 있습니다. run(), jump(), turn(); 가능
	 * Player는 한번에 하나의 레벨 상태만을 가질 수 있습니다.
	 * Player가 Play() 중에 레벨에 있는 go(int count)라는 메서드를 호출하면 run() count 횟수만큼 jump()하고 turn()합니다. 다음 클래스
	 * 다이어그램을 참고하여 각 레벨에서 go()가 호출 될떄 다음과 같이 출력 되도록 하세요.
	 * 
	 * */
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		
		for(int i = 0; i < count ; i++) {
			jump();
		}
		turn();
	}
	
}
