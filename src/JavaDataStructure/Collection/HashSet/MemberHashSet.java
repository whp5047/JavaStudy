package JavaDataStructure.Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import JavaDataStructure.Collection.HashSet.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
		
	}
	
	public void showAllMember() {
		
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	/* ��� ��ȸ
	 * �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��
	 * ������ �ִ� List �������̽��� ��� Iterator�� ������� �ʰ� get(i)�޼��带 Ȱ�� �� �� ����
	 * Set �������̽��� ��� get(i)�� ���������ʾ� iterator Ȱ���� ���� ��ü ��ȸ
	 * 
	 * Iterator ���
	 * boolean hasNext() : ���Ŀ� ��Ұ� �� �ִ��� üũ�ϴ� �޼��� �ִٸ� true
	 * E next() : ������ �ִ� ��Ҹ� ��ȯ
	 * 
	 * */
	public boolean removeMemberThroughIterator(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
			
		}
		
		System.out.println(memberId + " �� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
}
