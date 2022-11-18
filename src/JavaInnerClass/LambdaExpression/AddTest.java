package JavaInnerClass.LambdaExpression;

public class AddTest {

	public static void main(String[] args) {
		
		Add add = (x, y) -> {return x+y;}; 
		Add add2 = (x, y) ->  x+y; 
		int result = add.add(1, 2);
		System.out.println(result);
		System.out.println(add2.add(1, 2));
		
	}

}
