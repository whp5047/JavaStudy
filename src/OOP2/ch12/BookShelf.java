package OOP2.ch12;

public class BookShelf extends Shelf implements Queue {

	/*
	 * 인터페이스의 상속
	 * 인터페이스 사이에서도 상속 사용이 가능
	 * extends 키워드 사용
	 * 인터페이스는 다중 상속이 가능 구현코드의 상속이 아니라서 타입 상속이라함
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
