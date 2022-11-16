package JavaDataStructure.Collection.HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		/* HashSet
		 * Set 인터페이스를 구현한 클래스와
		 * 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야함
		 * 동일성 구현을 위해 필요에 따라 equals()와 hashCode()메서드를 재정의함
		 * 
		 * */
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}
	
}


