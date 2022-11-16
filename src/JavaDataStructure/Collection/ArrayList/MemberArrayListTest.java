package JavaDataStructure.Collection.ArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
//		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.removeMemberThroughIterator(memberKim.getMemberId());
		
		memberArrayList.showAllMember(); // 순서는 유지되는 것 확인
		
		
	}

}
