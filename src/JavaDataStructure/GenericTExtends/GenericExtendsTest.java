package JavaDataStructure.GenericTExtends;

import JavaDataStructure.Generic.GenericPrinter;
import JavaDataStructure.Generic.Powder;

public class GenericExtendsTest {

	public static void main(String[] args) {
		
		/* T extends 
		 * ���� Ŭ������ �ʿ伺 : T �ڷ����� ������ ���� ����
		 * ����Ŭ�������� �����ϰų� �����ϴ� �޼��带 Ȱ��
		 * ��ӹ��� �ʴ°�� T�� Object�� ��ȯ�Ǿ� Object Ŭ������ �⺻���� �����ϴ� �޼��常 ���
		 * 
		 * T extends Ȱ�� -> �ڷ����� ��ӹ޾Ƽ�, ���� T�� ������ Ŭ������ ���� ���� ��ӹ��� Ŭ������ �����ϱ�
		 * ��� ���� Ŭ�������� ���� ����� �ڵ�� ����ϴ� ���� Ŭ������ �ۼ�
		 * */
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		
		powderPrinter.setMaterial(powder);

		Powder powder2 = powderPrinter.getMaterial(); 
		System.out.println(powderPrinter.toString());
		
		
		
	}

}
