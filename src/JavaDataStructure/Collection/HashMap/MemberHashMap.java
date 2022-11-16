package JavaDataStructure.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	/* boolean ContainsKey(Object key) => 해당 키값으로 정보를 가지고 있는가
	 * boolean ContainsValue(Object key) => 해당 밸류 값을 가지고 있는가
	 * boolean isEmpty()
	 * 다른 내용의 데이터가 같은 키를 갖음 -> 이러한 상황을 해시 충돌(Hash Collision)이라고 한다. 
	 * 같은 키값을 갖는 데이터가 생긴다는 것은, 특정 키의 버켓에 데이터가 집중된다는 뜻이다. 너무 많은 해시 충돌은 해시테이블의 성능을 떨어뜨린다. 
     * 해시 함수를 잘 정의하여 해시 충돌을 최소화 하는 것이 성능 개선에 도움이 된다.
	 * 해시함수의 입력값은 무한하지만, 키의 가짓수는 유한( 즉 키가 유한하지 않다면 해시기법을 사용하는 의미가 없다.)하므로 해시 충돌은 반드시 발생한다.(비둘기집 원리)
	 * */
	
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) { //put
		 hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if( hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		
		System.out.println("no elelment");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while( ir.hasNext()) {
			
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
	}
	
	
}
