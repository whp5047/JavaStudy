package JavaInnerClass.IOStream.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // ��ũ�������̽�
	
	private static final long serialVersionUID = -150325240544036183L;
	// transient ����ȭ���� null�� ������ ��
	String name;
	String job; 
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

}
/*
class Person implements Externalizable{ // writerExternal()�� readExternal() �޼��带 �����ؾ��� -> ���α׷��Ӱ� ���� ��ü�� �а� ���� �ڵ带 ���� ����
	
	String name;
	String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString(){
		return name + "," + job;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
		 * }
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		//job = in.readUTF();
	}
	
}
*/

public class SerializationTest {

	public static void main(String[] args) {
		
		/* serialization (����ȭ)
		 * �ν��Ͻ��� ���¸� �״�� ���� �����ϰų� ��Ʈ������ �����ϰ�(serialization) �̸� �ٽ� ����(deserialization)
		 * �ڹٿ����� ���� ��Ʈ���� Ȱ���Ͽ� ����ȭ�� ������
		 * ObjectInputStream , ObjectOutputStream
		 * 
		 * ObjectInputStream(InputStream i) : InputStream�� ������ �Ű������� �޾� ObjectInputStream�� �����մϴ�.
		 * ObjectOutputStream(OutputStream out) : OutputStream�� ������ �Ű� ������ �޾� ObjectOutputStream�� �����մϴ�
		 * 
		 * �������̽�
		 * ����ȭ�� �ν��Ͻ��� ������ �ܺη� ����Ǵ� ���̹Ƿ� ���α׷��Ӱ� �ش� ��ü�� ���� ����ȭ �ǵ��� ǥ���ؾ� ��
		 * ���� �ڵ尡 ���� marker interface
		 * transient : ����ȭ ���� �������� �ɹ� ������ �����(Socket �� ����ȭ �� �� ���� ��ü)
		 * 
		 * */
		
		Person personLee = new Person("�̼���", "��ǥ�̻�");
		Person personKim = new Person("������", "���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream  oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream  ois = new ObjectInputStream(fis)){
			
			Person  pLee = (Person)ois.readObject();
			Person  pKim = (Person)ois.readObject();
			
			System.out.println(pLee.toString());
			System.out.println(pKim.toString());
		}catch (IOException e) {
			e.printStackTrace();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
