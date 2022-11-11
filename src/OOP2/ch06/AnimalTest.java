package OOP2.ch06;

import java.util.ArrayList;

class Animal {
	
	/* 상속을 사용 할때
	 * 
	 * IS - A 관계 (is a relationship ; inheritance)
	 * 일반적인(general)개념과 구체적인(specific)개념과 관계
	 * 상위 클래스 : 하위 클래스보다 일반적인 개념(예 :Employee)
	 * 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 (예 : Engineer, Manager)
	 * 상속은 클래스간의 결합도가 높은 설계
	 * 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
	 * 계층 구조가 복잡하거나 hierarchy가 높으면 좋지 않음
	 * 
	 * HAS-A 관계(Composition)
	 * 클래스가 다른 클래스를 포함하는 관계(변수로 선언)
	 * 코드 재사용의 가장 일반적인 방법
	 * Student가 Subject를 포함하는 Library를 구현할 때 ArrayList 생성하여 사용
	 * 상속하지 않음
	 * 
	 * 다운 캐스팅과 instanceof
	 * 다운 캐스팅 (downcasting)
	 * 업캐스팅된 클래스를 다시 원래의 타입으로 형변환
	 * 하위 클래스로의 형 변환은 명시적으로 해야함
	 * ex)
	 * Customer vc = new VIPCustomer(); //묵시적 형변환
	 * VIPCustomer vCustomer = (VIPCustomer)vc; //명시적 형변환
	 * 
	 * */
	
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}
	
	public void eating() {
		
	}
}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	};
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	};
	
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	};
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	};
	
}


class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	};
	
	public void flying() {
		System.out.println("독수리가 양 날개를 쭉 펴고 날아다닙니다.");
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
