package OOP2.ch13.gameLevel;

public abstract class PlayerLevel {
	
	/* Player�� �ְ� Player�� GameLevel �Ӽ��� �����Ѵ�. �� GameLevel �ܰ� ���� run(), jump(), turn() ������ ����� ���׷��̵� �˴ϴ�.
	 * �ʺ��� ���� : õõ�� �޸��ϴ�. run()������
	 * �߱��� ���� : ���� �޸���, ������ �� �ֽ��ϴ�. run(), jump()����
	 * ����� ���� : ��û�����޸��� ,���� �����ϰ�, �� �Ҽ� �ֽ��ϴ�. run(), jump(), turn(); ����
	 * Player�� �ѹ��� �ϳ��� ���� ���¸��� ���� �� �ֽ��ϴ�.
	 * Player�� Play() �߿� ������ �ִ� go(int count)��� �޼��带 ȣ���ϸ� run() count Ƚ����ŭ jump()�ϰ� turn()�մϴ�. ���� Ŭ����
	 * ���̾�׷��� �����Ͽ� �� �������� go()�� ȣ�� �ɋ� ������ ���� ��� �ǵ��� �ϼ���.
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
