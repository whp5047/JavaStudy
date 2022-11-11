package OOP2.ch07;

public abstract class NoteBook extends Computer{
	//두개의 추상메서드를 컴퓨터가 가지고 있는데 한개만 구현하고 싶을때는 클래스를 추상클래스로 지정한다.
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}
	
	
	
}
