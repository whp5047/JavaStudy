package JavaDataStructure.Collection.HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		/* HashSet
		 * Set �������̽��� ������ Ŭ������
		 * ����� �ߺ� ���θ� üũ�ϱ� ���� �ν��Ͻ��� ���ϼ��� Ȯ���ؾ���
		 * ���ϼ� ������ ���� �ʿ信 ���� equals()�� hashCode()�޼��带 ��������
		 * 
		 * */
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");  //1003 ���̵� �ߺ� 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}
	
}


