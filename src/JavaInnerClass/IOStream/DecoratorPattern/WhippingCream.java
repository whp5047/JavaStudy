package JavaInnerClass.IOStream.DecoratorPattern;

public class WhippingCream extends Decorator{

	public WhippingCream(Coffee coffee) {
		super(coffee);
		
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Whipping Cream");
	}
	

}
