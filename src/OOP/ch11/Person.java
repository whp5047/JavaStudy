package OOP.ch11;

public class Person {
	
	/*	this : 
	 *  인스턴스 자신의 메모리를 가르킴
	 *  생성자에서 또 다른 생성자를 호출 할때 사용
	 *  자신의 주소(참조값)을 반환함
	 *  
	 * 
	 * 
	 * */
	String name;
	int age;
	
	public Person() {
		//여기에 다른 스테이트먼트 불가능하다는 뜻
		this("no name", 1); // 클래스에 생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출가능
	}                       //생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement 를 사용할수없음
	
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
		
		Person person2 = person.getPerson(); //new 키워드가 아닌 this로 person을 다시 호출하고 있기 때문에 동일함
		System.out.println(person2);
		
		
	}
	
}
