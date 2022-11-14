package JavaClass.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
	
	/* forName(String className) : class�� interface�� �������ִ� (�����ε�, �������ε�)�޼���
	 * Class c = Class.forName("java.lang.String");
	 * 
	 * Class Ŭ����
	 * �ڹ��� ��� Ŭ������ �������̽��� ������ �� class ������ ������
	 * class Ŭ������ ������ �� class ������ �ε��Ͽ� ��ü�� ���� �ε��ϰ�, ������ �������� �޼��尡 ����
	 * 
	 * Ŭ���� �̸����� ���� Class ��������
	 * Class c = String.class;
	 * 
	 * ������ �ν��Ͻ����� Class Ŭ���� ��������
	 * String s = new String();
	 * Class c = s.getClass(); // Object�޼���
	 * 
	 * �����ε�
	 * ������ �ÿ� ������ Ÿ���� binding�� �Ǵ� ���� �ƴ�, ����(runtime)�߿� ������ Ÿ���� binding�ϴ� ���
	 * ���α׷��� �ÿ��� ���ڿ� ������ ó���ߴٰ� ��Ÿ�ӽÿ��� ���ϴ� Ŭ������ �ε��Ͽ� binding �� �� �ִٴ� ����
	 * ������ �ÿ� Ÿ���� �������� �����Ƿ� ���� �ε��� ������ �߻��ϸ� ���α׷��� �ɰ��� ��ְ� �߻��� ���Ѥ���
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String"); // �Ҵ빮�� ��Ÿ�ÿ� �����߻�
		
		Constructor[] cons = c.getConstructors(); //java.lang.reflect.Constructor�� ����
		
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		
		for(Method mth :m) {
			System.out.println(mth);
		}
		
		
		
	}

}
