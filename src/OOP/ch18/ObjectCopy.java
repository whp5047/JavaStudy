package OOP.ch18;

public class ObjectCopy {

	public static void main(String[] args) {
		
		/* System.arrayCopy(src, srcPos, dest ,destPos, length) 자바에서 제공되는 배열 복사 메서드
		 * 얕은복사
		 * 객체의 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됌
		 * 즉, 두 배열이 같은 객체를 가르킴
		 * 
		 * */
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		Book[] copyLibrary2 = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); // 얕은복사
		
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
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("========= 변경 후 library =========");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("========= 변경 후 copyLibrary =========");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		//둘다 변경된 것을 볼 수 있음 
		
		copyLibrary2[0] = new Book();
		copyLibrary2[1] = new Book();
		copyLibrary2[2] = new Book();
		copyLibrary2[3] = new Book();
		copyLibrary2[4] = new Book();
		
		for(int i = 0 ; i < library.length; i++) {
			copyLibrary2[i].setAuthor(library[i].getAuthor());
			copyLibrary2[i].setTitle(library[i].getTitle());
		}
		
		System.out.println("========= 깊은 복사 copyLibrary2 =========");
		for(Book book : copyLibrary2) {
			System.out.println(book);
			book.showInfo();
		}
		// 지금까지는 메모리상 주소가 같은 것을 볼 수 있었지만 깊은 복사를 실행한 결과 주소가 다른 것을 알 수 있음 
		
		
		
	}

}
