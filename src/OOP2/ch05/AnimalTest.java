package OOP2.ch05;

import java.util.ArrayList;

class Animal {
	
	/* ������(Polymorphism)
	 * �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
	 * ���� �ڵ忡�� ���� �ٸ� ���� ����� ����
	 * ��������, ��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ�
	 * �������� �� Ȱ���ϸ� �����ϰ� Ȯ�强�ְ�, ���������� ���� ���α׷��� ���� �� ����
	 * 
	 * ����ϴ� ����
	 * �ٸ������� �߰��ϴ� ���
	 * ��Ӱ� �޼��� �����Ǹ� Ȱ���Ͽ� Ȯ�强 �ִ� ���α׷��� ���� �� ����
	 * �׷��� �ʴ� ��� ���� if- else if ���� �����ǰ� �ڵ��� ���������� �������
	 * ����Ŭ���������� �������� �κ��� �����ϰ� ����Ŭ���������� �� Ŭ������ �´� ��� ����
	 * ���� Ŭ������ �ϳ��� Ÿ��(���� Ŭ����)���� �ڵ鸵 �� �� ����
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
		System.out.println("����� å�� �н��ϴ�..");
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
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
