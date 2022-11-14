package JavaClass.Object;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override // ������
	public String toString() {
		return title + ", " + author;
	}
	
	
	
}

public class BookTest {
	public static void main(String[] args) {
		/* Object Class : ��� Ŭ������ �ֻ��� Ŭ����
		 * 
		 * java.lang ��Ű��
		 * ���α׷��ֽ� �ڵ� import // import.java.lang.*;
		 * ���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
		 * String, integer, System
		 * 
		 * Java.lang.Object Ŭ����
		 * ��� Ŭ������ Object���� ��ӹް�, Object Ŭ������ �޼��� �� �Ϻδ� �������ؼ� ��� ����
		 * �����Ϸ��� extends Object�� �߰��� class Student => class Student extends Object
		 * 
		 * toString() �޼���
		 * ��ü�� ������ String���� �ٲ㼭 ����� �� ����
		 * String�̳� Integer Ŭ������ �̹� ������ �Ǿ� ����
		 * 
		 * */
		Book book = new Book("���̾�", "�츣�� �㼼");
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str.toString());
		
		
		
		
	}

	
}
