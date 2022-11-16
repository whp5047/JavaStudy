package JavaDataStructure.Collection.TreeSet;

import java.util.TreeSet;

import JavaDataStructure.Collection.TreeSet.Member;

public class TreeSetTest {

	public static void main(String[] args) {
		
		/* TreeSet 
		 * 객체의 정렬에 사용하는 클래스
		 * Set 인터페이스를 구현하여 중복허용x 오름차순, 내림차순으로 객체를 정렬 가능
		 * 내부적으로 이진검색트리(binary search tree)로 구현
		 * 이진검색 트리에 저장하기 위해 각 객체를 비교해야함
		 * 비교 대상이 되는 객체에 Comparable 이나 Comparator 인터페이스를 구현해야 TreeSet에 추가 될 수 있음
		 * String, Integer 등 JDK의 많은 클래스 들이 Comparable을 구현
		 * 
		 * Exception in thread "main" java.lang.ClassCastException: comparable 구현을 안해서 뜨는 에러
		 * */

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("홍길동");
//		set.add("감강찬");
//		set.add("이순신");
//		
//		System.out.println(set); // 정렬되는 모습 <String>에 Comparable이 구현되어있어 가능
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1003, "홍길동");   
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
		
	}

}
