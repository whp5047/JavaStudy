package OOP.ch18;

public class Book {
	
	/* �⺻ �ڷ��� �迭�� ����� ���ÿ� �迭�� ũ�⸸ŭ �޸𸮰� �Ҵ������, ��ü �迭�� ��� ��Ұ� �Ǵ� ��ü�� �ּҰ� ��(4����Ʈ, 8����Ʈ)
	 * �޸𸮸� �Ҵ�ǰ�(null) �� ��� ��ü�� �����Ͽ� �����ؾ���
	 * 
	 * */
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title +", " + author);
		
	}
	
}
