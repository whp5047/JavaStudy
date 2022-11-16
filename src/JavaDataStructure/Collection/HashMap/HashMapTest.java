package JavaDataStructure.Collection.HashMap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		/* HashMap Ŭ���� Ȱ���ϱ�
		 * Map �������̽��� ������Ŭ����
		 * ���� ���� ���Ǵ� Map �������̽� ��� Ŭ����
		 * Key - value�� ������ �����ϴ� �޼��带 ����
		 * �˻��� ���� �ڷᱸ��
		 * Key�� �̿��Ͽ� ���� �����ϰ� Key�� �̿��Ͽ� ���� �������� ��� - Hash �˰������� ����
		 * Key�� �Ǵ� ��ü�� �ߺ��� �� ���� ��ü�� ���ϼ��� �񱳸� ���� equals()�� hashCode() �޼��带 �����ؾ���
		 * 
		 * TreeMap > TreeSet�� HashMap�� ���� ��
		 * Key�� �Ǵ� Ŭ������ Comparable �̳� Comparator�� �����Ͽ�
		 * Key �� �������� �����Ͽ� ���� �� �� ����
		 * 
		 * */
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "ȫ�浿");   
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		System.out.println(hashMap.toString());
		
	}

}
