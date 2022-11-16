package JavaDataStructure.Collection.TreeSet;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if (this.memberId == member.memberId ) {
				return true;
				
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + " �Դϴ�. ";
	}

	// Comparable
	//�������� ���Ͽ� �������� ū ��� ���, ������ ����, ������ 0 // �����ϰ��ϸ� return this.memberId - meber.memberId;
	//�������� ū ��� ����, ������ ���, ������ 0 return (this.memberId - meber.memberId) * (-1)
	// �Ϲ������� ���� ���
//	@Override
//	public int compareTo(Member member) {
//
//		if( this.memberId > member.memberId ) {
//			return 1;
//			
//		}else if ( this.memberId < member.memberId ) {
//			return -1;
//			
//		}else {
//			return 0;
//		}
//		
//	}

	// Comparator
	// �׳� ����ϸ� �������� member�� ����Ͽ� �������� TreeSet �κп����� �߰��� ��ø��������, default ������ ������ֱ�
	// ex) treeSet = new TreeSet<Member>(new Member());
	// �̹� Comparable�� ������ ��� , �� �� �ٸ� ����� �̿��ϱ� ���� Comparator ��� ex) String�� ������������ ������ ����
	@Override
	public int compare(Member member1, Member member2) { 
		
		return (member1.memberId - member2.memberId);
	}
	
	

}
