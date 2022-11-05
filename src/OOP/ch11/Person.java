package OOP.ch11;

public class Person {
	
	/*	this : 
	 *  �ν��Ͻ� �ڽ��� �޸𸮸� ����Ŵ
	 *  �����ڿ��� �� �ٸ� �����ڸ� ȣ�� �Ҷ� ���
	 *  �ڽ��� �ּ�(������)�� ��ȯ��
	 *  
	 * 
	 * 
	 * */
	String name;
	int age;
	
	public Person() {
		//���⿡ �ٸ� ������Ʈ��Ʈ �Ұ����ϴٴ� ��
		this("no name", 1); // Ŭ������ �����ڰ� ���� �� �ΰ��, this�� �̿��Ͽ� �����ڿ��� �ٸ� �����ڸ� ȣ�Ⱑ��
	}                       //�����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ���, �ν��Ͻ��� ������ �������� ���� �����̹Ƿ� this() statement ������ �ٸ� statement �� ����Ҽ�����
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
				
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age );
	}
	
	public Person getPerson() {
		return this;
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		System.out.println(person); //
		
		Person person2 = person.getPerson(); //new Ű���尡 �ƴ� this�� person�� �ٽ� ȣ���ϰ� �ֱ� ������ ������
		System.out.println(person2);
		
		
	}
	
}
