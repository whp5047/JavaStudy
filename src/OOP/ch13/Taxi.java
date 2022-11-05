package OOP.ch13;

public class Taxi {
	
	String companyName;
	int money;
	
	public Taxi() {}

	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + " 수입은 " + money + "원 입니다." );
		
	}
	
	
}
