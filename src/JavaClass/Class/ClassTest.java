package JavaClass.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("JavaClass.Class.Person");
		
		Person person = (Person)c1.newInstance(); //곧 사용안될예정
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance(); //곧 사용안될예정
		System.out.println(p);
		
		
		// Person kim2 = new Persin("Kim"); 을 아래와 같이 할 수 있음 
		// reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고, 인스턴스를 생성하고, 메서드를 호출하는방식
		// 로컬 메모리에 객체가 없는 경우, 원격 프로그래밍 ,객체의 타입을 알수 없는 경우에 사용, 자료형을 알고있을때 일반적으로 사용x
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person personLee = (Person)cons.newInstance(initargs);
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson); 
		System.out.println(personLee); 

	}

}
