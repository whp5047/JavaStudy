package design.strategy;

public class Main {

	public static void main(String[] args) {
		Encoder encoder = new Encoder();
		
		//base 64
		EncodingStrategy base64 = new Base64Strategy();
		
		//nomal 
		EncodingStrategy normal = new NormalStrategy();
		
		String messge = "hello java";
		encoder.setEncodingStrategy(base64);
		String base64Result = encoder.getMessage(messge);
		System.out.println(base64Result);
		
		
		encoder.setEncodingStrategy(normal);
		String normalResult = encoder.getMessage(messge);
		System.out.println(normalResult);
		
		encoder.setEncodingStrategy(new AppendStrategy());
		String appendResult = encoder.getMessage(messge);
		System.out.println(appendResult);
		
	}

}
