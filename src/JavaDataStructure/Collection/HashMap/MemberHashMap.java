package JavaDataStructure.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	/* boolean ContainsKey(Object key) => �ش� Ű������ ������ ������ �ִ°�
	 * boolean ContainsValue(Object key) => �ش� ��� ���� ������ �ִ°�
	 * boolean isEmpty()
	 * �ٸ� ������ �����Ͱ� ���� Ű�� ���� -> �̷��� ��Ȳ�� �ؽ� �浹(Hash Collision)�̶�� �Ѵ�. 
	 * ���� Ű���� ���� �����Ͱ� ����ٴ� ����, Ư�� Ű�� ���Ͽ� �����Ͱ� ���ߵȴٴ� ���̴�. �ʹ� ���� �ؽ� �浹�� �ؽ����̺��� ������ ����߸���. 
     * �ؽ� �Լ��� �� �����Ͽ� �ؽ� �浹�� �ּ�ȭ �ϴ� ���� ���� ������ ������ �ȴ�.
	 * �ؽ��Լ��� �Է°��� ����������, Ű�� �������� ����( �� Ű�� �������� �ʴٸ� �ؽñ���� ����ϴ� �ǹ̰� ����.)�ϹǷ� �ؽ� �浹�� �ݵ�� �߻��Ѵ�.(��ѱ��� ����)
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
