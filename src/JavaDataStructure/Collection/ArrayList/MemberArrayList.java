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
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	/* 요소 순회
	 * 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
	 * 순서가 있는 List 인터페이스의 경우 Iterator를 사용하지 않고 get(i)메서드를 활용 할 수 있음
	 * Set 인터페이스의 경우 get(i)가 제공되지않아 iterator 활용을 통해 객체 순회
	 * 
	 * Iterator 사용
	 * boolean hasNext() : 이후에 요소가 더 있는지 체크하는 메서드 있다면 true
	 * E next() : 다음에 있는 요소를 반환
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
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
		
	}
	
}
