package JavaInnerClass.IOStream.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // 마크인터페이스
	
	private static final long serialVersionUID = -150325240544036183L;
	// transient 직렬화방지 null로 나오게 됨
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
class Person implements Externalizable{ // writerExternal()과 readExternal() 메서드를 구현해야함 -> 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 가능
	
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
		
		/* serialization (직렬화)
		 * 인스턴스의 상태를 그대로 파일 저장하거나 네트웍으로 전송하고(serialization) 이를 다시 복원(deserialization)
		 * 자바에서는 보조 스트림을 활용하여 직렬화를 제공함
		 * ObjectInputStream , ObjectOutputStream
		 * 
		 * ObjectInputStream(InputStream i) : InputStream을 생성자 매개변수로 받아 ObjectInputStream을 생성합니다.
		 * ObjectOutputStream(OutputStream out) : OutputStream을 생성자 매개 변수로 받아 ObjectOutputStream을 생성합니다
		 * 
		 * 인터페이스
		 * 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
		 * 구현 코드가 없는 marker interface
		 * transient : 직렬화 하지 않으려는 맴버 변수에 사용함(Socket 등 직렬화 할 수 없는 객체)
		 * 
		 * */
		
		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
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
