package JavaClass.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("JavaClass.Class.Person");
		
		Person person = (Person)c1.newInstance(); //�� ���ȵɿ���
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance(); //�� ���ȵɿ���
		System.out.println(p);
		
		
		// Person kim2 = new Persin("Kim"); �� �Ʒ��� ���� �� �� ���� 
		// reflection ���α׷��� : Class Ŭ������ ����Ͽ� Ŭ������ ����(������, ����, �޼���)���� �� �� �ְ�, �ν��Ͻ��� �����ϰ�, �޼��带 ȣ���ϴ¹��
		// ���� �޸𸮿� ��ü�� ���� ���, ���� ���α׷��� ,��ü�� Ÿ���� �˼� ���� ��쿡 ���, �ڷ����� �˰������� �Ϲ������� ���x
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person personLee = (Person)cons.newInstance(initargs);
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson); 
		System.out.println(personLee); 

	}

}
