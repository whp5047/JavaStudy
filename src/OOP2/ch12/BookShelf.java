package OOP2.ch12;

public class BookShelf extends Shelf implements Queue {

	/*
	 * �������̽��� ���
	 * �������̽� ���̿����� ��� ����� ����
	 * extends Ű���� ���
	 * �������̽��� ���� ����� ���� �����ڵ��� ����� �ƴ϶� Ÿ�� ����̶���
	 * 
	 * */
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
	

}
