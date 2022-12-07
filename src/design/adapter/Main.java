package design.adapter;

public class Main {

	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
		//connect(cleaner);
		Electronic110V adapter = new SocketAdpater(cleaner); 
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		Electronic110V airAdapter = new SocketAdpater(airConditioner);
		connect(airAdapter);
		
	}
	
	public static void connect(Electronic110V electronic110v) {
		electronic110v.powerOn();
	}
	
}
