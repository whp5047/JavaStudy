package JavaDataStructure.LinkedList;

public class MyListNode {
	// 자료가 추가될때 노드 만큼의 메모리를 할당받고 이전 노드의 링크로 연결함(정해진 크기가 없다는 뜻)
	
	private String data;
	public MyListNode next;
	
	public MyListNode() {
		data = null;
		next = null;
		
	}
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
		
	}

	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	
	public String getData() {
		return data;
	}
	
	
	
}
