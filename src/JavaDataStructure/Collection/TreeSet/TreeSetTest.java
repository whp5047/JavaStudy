package JavaDataStructure.Collection.TreeSet;

import java.util.TreeSet;

import JavaDataStructure.Collection.TreeSet.Member;

public class TreeSetTest {

	public static void main(String[] args) {
		
		/* TreeSet 
		 * ��ü�� ���Ŀ� ����ϴ� Ŭ����
		 * Set �������̽��� �����Ͽ� �ߺ����x ��������, ������������ ��ü�� ���� ����
		 * ���������� �����˻�Ʈ��(binary search tree)�� ����
		 * �����˻� Ʈ���� �����ϱ� ���� �� ��ü�� ���ؾ���
		 * �� ����� �Ǵ� ��ü�� Comparable �̳� Comparator �������̽��� �����ؾ� TreeSet�� �߰� �� �� ����
		 * String, Integer �� JDK�� ���� Ŭ���� ���� Comparable�� ����
		 * 
		 * Exception in thread "main" java.lang.ClassCastException: comparable ������ ���ؼ� �ߴ� ����
		 * */

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("�̼���");
//		
//		System.out.println(set); // ���ĵǴ� ��� <String>�� Comparable�� �����Ǿ��־� ����
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1003, "ȫ�浿");   
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
		
	}

}
