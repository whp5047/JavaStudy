package JavaDataStructure.Generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		printer.setMaterial(printer);
		Powder  p = (Powder)printer.getMaterial(); // Object�� ����� ����ȯ�� ���ľ��ϴ� ������ �߻� 
		
	}

}
