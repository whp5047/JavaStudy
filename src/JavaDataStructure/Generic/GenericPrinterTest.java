package JavaDataStructure.Generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		// <> ���̾Ƹ�� ������ �ȿ� ������ �������� ������, ���� �����Ϸ��� �ڵ����� ����
		// �ڹ� 10���� ArrayList list = new ArrayList() -> var list = new ArrayList(); ����
		
		powderPrinter.setMaterial(powder);

		Powder powder2 = powderPrinter.getMaterial(); // ����ȯ�� �����Ϸ��� ���༭ ���� ����� ����ȯ�� �ʿ���� Object�� �ٸ���
		System.out.println(powderPrinter.toString());
		
		// �ö�ƽŬ������
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); 
		
		plasticPrinter.setMaterial(plastic);
		
		Powder plastic2 = powderPrinter.getMaterial(); 
		System.out.println(plasticPrinter.toString());
		
		// Object�� �� ���x
		Plastic p = new Plastic();
		GenericPrinter objectPrinter = new GenericPrinter<>(); // ���̾Ƹ�� ������ ����
		
		objectPrinter.setMaterial(p);
		
		Plastic p2 = (Plastic)objectPrinter.getMaterial(); // ���̾Ƹ�� �����ڸ� �����ϰԵǸ� Object�� �ްԵ� ���� ����� ����ȯ�� �ʿ�
		System.out.println(objectPrinter.toString());
		
		
	}

}
