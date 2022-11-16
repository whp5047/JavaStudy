package JavaDataStructure.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
		
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			
			if( tempId == memberId ) {
				arrayList.remove(i);
				return true;
			}
			
		}
		System.out.println(memberId + " �� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		
		for(Member member : arrayList) {
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
		
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
			
		}
		
		System.out.println(memberId + " �� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
}
