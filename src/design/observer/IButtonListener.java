package design.observer;

public interface IButtonListener {
	
	/* Observer pattern : ����������
	 * 
	 * ��ȭ�� �Ͼ�� �� �̸� ��ϵ� �ٸ� Ŭ������ �뺸���ִ� ������ ����
	 * event listener ���� ���� Ȱ��
	 * 
	 * */
	
	void clickEvent(String event);
	
	
}
