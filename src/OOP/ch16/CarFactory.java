package OOP.ch16;

public class CarFactory {
	public static CarFactory instance = new CarFactory();
	private int serialNum= 10000;
	
	public CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) new CarFactory();
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		serialNum++;
		car.setCarNum(serialNum);
		return car;
	}
	
}
