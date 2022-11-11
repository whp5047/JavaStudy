package OOP2.ch06;

import java.util.ArrayList;

class Animal {
	
	/* ����� ��� �Ҷ�
	 * 
	 * IS - A ���� (is a relationship ; inheritance)
	 * �Ϲ�����(general)����� ��ü����(specific)����� ����
	 * ���� Ŭ���� : ���� Ŭ�������� �Ϲ����� ����(�� :Employee)
	 * ���� Ŭ���� : ���� Ŭ�������� ��ü���� ������� ������ (�� : Engineer, Manager)
	 * ����� Ŭ�������� ���յ��� ���� ����
	 * ���� Ŭ������ ������ ���� ���� Ŭ������ ������ ��ĥ �� ����
	 * ���� ������ �����ϰų� hierarchy�� ������ ���� ����
	 * 
	 * HAS-A ����(Composition)
	 * Ŭ������ �ٸ� Ŭ������ �����ϴ� ����(������ ����)
	 * �ڵ� ������ ���� �Ϲ����� ���
	 * Student�� Subject�� �����ϴ� Library�� ������ �� ArrayList �����Ͽ� ���
	 * ������� ����
	 * 
	 * �ٿ� ĳ���ð� instanceof
	 * �ٿ� ĳ���� (downcasting)
	 * ��ĳ���õ� Ŭ������ �ٽ� ������ Ÿ������ ����ȯ
	 * ���� Ŭ�������� �� ��ȯ�� ��������� �ؾ���
	 * ex)
	 * Customer vc = new VIPCustomer(); //������ ����ȯ
	 * VIPCustomer vCustomer = (VIPCustomer)vc; //����� ����ȯ
	 * 
	 * */
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
		
	}
	
	public void eating() {
		
	}
}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	};
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	};
	
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	};
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	};
	
}


class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�.");
	};
	
	public void flying() {
		System.out.println("�������� �� ������ �� ��� ���ƴٴմϴ�.");
	};
	
}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal =new Human();
		Animal tAnimal =new Tiger();
		Animal eAnimal =new Eagle();
		
		AnimalTest test =new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
//		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
		test.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			Animal animal = list.get(i);
			
			if( animal instanceof Human) {
				
				Human human = (Human)animal;
				human.readBook();
				
			}else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			}else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("unsupported type");
			}
		}
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
