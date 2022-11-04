package OOP.ch07;

public class Person {
	
	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public Person() {}

	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	public String personDetail() {
		return "Ű�� " + height +  "�̰�, �����԰� " + weight + " ų���� " + gender + "�� �ֽ��ϴ�."
				+ "\n�̸��� " + name + "�̰� ���̴� "   + age + "�� �Դϴ�.";
	}
	
}
