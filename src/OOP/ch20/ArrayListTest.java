package OOP.ch20;

import java.util.ArrayList;

import OOP.ch18.Book;

public class ArrayListTest {
	public static void main(String[] args) {
		
		/* java.util ��Ű���� �����Ǵ� ArrayList
		 * ������ �迭 ����� ��� ����� ������ ���̸� ���ϰ� ����� ������ �迭�� ���̺��� Ŀ���� �迭�� ���Ҵ��ϰ� �����ؾ�����
		 * �迭�� ��Ҹ� �߰��ϰų� �����ϸ� �ٸ� ��ҵ��� �̵��� ���� ������ �ؾ���
		 * ArrayList�� ��ü �迭�� �� �� ȿ�������� �����ϱ� ���� �ڹٿ��� �������ִ� Ŭ����
		 * �̹� ���� �޼������ ������ �˰������� �����Ǿ� �־� �� �޼����� ��� ����� ������ �����ϰ� ����� �� ����
		 *
		 * �ֿ� �޼���
		 * boolean add(E e) ��� �ϳ��� �迭�� �߰��մϴ� E�� ����� �ڷ����� �ǹ��մϴ�.
		 * int size() �迭�� �߰��� ��� ��ü ������ ��ȯ�մϴ�.
		 * E get(int index) �迭�� index ��ġ�� �ִ� ��� ���� ��ȯ�մϴ�.
		 * E remove(int index) �迭�� index ��ġ�� �ִ� ��� ���� �����ϰ� �� ���� ��ȯ�մϴ�.
		 * boolean isEmpty() �迭�� ������� Ȯ���մϴ�.
		 * 
		 * 
		 * */
		
		ArrayList<Book> library = new ArrayList<>() ; 
		
		library.add(new Book("�¹���1", "������"));
		library.add(new Book("�¹���2", "������"));
		library.add(new Book("�¹���3", "������"));
		library.add(new Book("�¹���4", "������"));
		library.add(new Book("�¹���5", "������"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		
		
	}
}
