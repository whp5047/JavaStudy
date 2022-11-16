package JavaDataStructure.Collection.HashMap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		/* HashMap 클래스 활용하기
		 * Map 인터페이스를 구현한클래스
		 * 가장 많이 사용되는 Map 인터페이스 기반 클래스
		 * Key - value를 쌍으로 관리하는 메서드를 구현
		 * 검색을 위한 자료구조
		 * Key를 이용하여 값을 저장하고 Key를 이용하여 값을 꺼내오는 방식 - Hash 알고리즘으로 구현
		 * Key가 되는 객체는 중복될 수 없고 객체의 유일성을 비교를 위한 equals()와 hashCode() 메서드를 구현해야함
		 * 
		 * TreeMap > TreeSet과 HashMap을 더한 것
		 * Key가 되는 클래스에 Comparable 이나 Comparator를 구현하여
		 * Key 값 기준으로 정렬하여 관리 할 수 있음
		 * 
		 * */
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "홍길동");   
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
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
