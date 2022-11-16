package JavaDataStructure.Generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		// <> 다이아몬드 연산자 안에 원래는 명시해줘야 했으나, 이제 컴파일러가 자동으로 해줌
		// 자바 10부터 ArrayList list = new ArrayList() -> var list = new ArrayList(); 가능
		
		powderPrinter.setMaterial(powder);

		Powder powder2 = powderPrinter.getMaterial(); // 형변환을 컴파일러가 해줘서 따로 명시적 형변환이 필요없음 Object와 다른점
		System.out.println(powderPrinter.toString());
		
		// 플라스틱클래스로
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); 
		
		plasticPrinter.setMaterial(plastic);
		
		Powder plastic2 = powderPrinter.getMaterial(); 
		System.out.println(plasticPrinter.toString());
		
		// Object로 잘 사용x
		Plastic p = new Plastic();
		GenericPrinter objectPrinter = new GenericPrinter<>(); // 다이아몬드 연산자 생략
		
		objectPrinter.setMaterial(p);
		
		Plastic p2 = (Plastic)objectPrinter.getMaterial(); // 다이아몬드 연산자를 생략하게되면 Object로 받게됨 따라서 명시적 형변환이 필요
		System.out.println(objectPrinter.toString());
		
		
	}

}
