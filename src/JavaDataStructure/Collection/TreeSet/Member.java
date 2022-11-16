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
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다. ";
	}

	// Comparable
	//오름차순 비교하여 가진것이 큰 경우 양수, 작으면 음수, 같으면 0 // 간략하게하면 return this.memberId - meber.memberId;
	//내림차순 큰 경우 음수, 작으면 양수, 같으면 0 return (this.memberId - meber.memberId) * (-1)
	// 일반적으로 자주 사용
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
	// 그냥 사용하면 에러생김 member를 사용하여 만들어놓은 TreeSet 부분에가서 추가로 명시를해줘야함, default 생성자 만들어주기
	// ex) treeSet = new TreeSet<Member>(new Member());
	// 이미 Comparable이 구현된 경우 , 비교 시 다른 방식을 이용하기 위해 Comparator 사용 ex) String의 내림차순으로 정렬을 위해
	@Override
	public int compare(Member member1, Member member2) { 
		
		return (member1.memberId - member2.memberId);
	}
	
	

}
