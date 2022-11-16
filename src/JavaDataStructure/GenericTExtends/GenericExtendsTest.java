package JavaDataStructure.GenericTExtends;

import JavaDataStructure.Generic.GenericPrinter;
import JavaDataStructure.Generic.Powder;

public class GenericExtendsTest {

	public static void main(String[] args) {
		
		/* T extends 
		 * 상위 클래스의 필요성 : T 자료형의 범위를 제한 가능
		 * 상위클래스에서 선언하거나 정의하는 메서드를 활용
		 * 상속받지 않는경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용
		 * 
		 * T extends 활용 -> 자료형을 상속받아서, 구현 T에 무작위 클래스가 들어갈수 없게 상속받은 클래스로 한정하기
		 * 모든 하위 클래스에서 같이 사용할 코드는 상속하는 상위 클래스에 작성
		 * */
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		
		powderPrinter.setMaterial(powder);

		Powder powder2 = powderPrinter.getMaterial(); 
		System.out.println(powderPrinter.toString());
		
		
		
	}

}
