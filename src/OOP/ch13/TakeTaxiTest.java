package OOP.ch13;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Person edward = new Person("Edward", 20000);
		Taxi taxi = new Taxi("�߳����� ���");
		
		edward.takeTaxi(taxi, 10000);
		
		edward.showPersonInfo();
		taxi.showTaxiInfo();
		
	}

}
