package OOP.ch18;

public class ObjectCopy {

	public static void main(String[] args) {
		
		/* System.arrayCopy(src, srcPos, dest ,destPos, length) �ڹٿ��� �����Ǵ� �迭 ���� �޼���
		 * ��������
		 * ��ü�� �ּҸ� ����Ǿ� ���� �迭�� ��Ҹ� �����ϸ� ���� ������
		 * ��, �� �迭�� ���� ��ü�� ����Ŵ
		 * 
		 * */
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		Book[] copyLibrary2 = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); // ��������
		
		System.out.println("========= library =========");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("========= copyLibrary =========");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
		System.out.println("========= ���� �� library =========");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("========= ���� �� copyLibrary =========");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		//�Ѵ� ����� ���� �� �� ���� 
		
		copyLibrary2[0] = new Book();
		copyLibrary2[1] = new Book();
		copyLibrary2[2] = new Book();
		copyLibrary2[3] = new Book();
		copyLibrary2[4] = new Book();
		
		for(int i = 0 ; i < library.length; i++) {
			copyLibrary2[i].setAuthor(library[i].getAuthor());
			copyLibrary2[i].setTitle(library[i].getTitle());
		}
		
		System.out.println("========= ���� ���� copyLibrary2 =========");
		for(Book book : copyLibrary2) {
			System.out.println(book);
			book.showInfo();
		}
		// ���ݱ����� �޸𸮻� �ּҰ� ���� ���� �� �� �־����� ���� ���縦 ������ ��� �ּҰ� �ٸ� ���� �� �� ���� 
		
		
		
	}

}
