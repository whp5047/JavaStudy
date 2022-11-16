package JavaDataStructure.Generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		printer.setMaterial(printer);
		Powder  p = (Powder)printer.getMaterial(); // Object로 만들시 형변환을 거쳐야하는 문제점 발생 
		
	}

}
