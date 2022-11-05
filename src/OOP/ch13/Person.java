package OOP.ch13;

public class Person {
		
	String name;
	int money;
	
	public Person() {}

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int money) {
		taxi.take(money);
		this.money -= money;
	}
	
	public void showPersonInfo() {
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
	
}
