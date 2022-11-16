package JavaDataStructure.Queue;

import JavaDataStructure.LinkedList.MyLinkedList;
import JavaDataStructure.LinkedList.MyListNode;

interface Queue{
	
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
	
	
}

public class MyLinkedListQueue extends MyLinkedList implements Queue{

	/* 맨 앞(front)에서 자료를 꺼내고 삭제 , 맨 뒤(rear)에서 자료를 추가
	 * 일열로 줄 서있는 모양,  콜센터 문의전화, 메세지 큐 등에 활용 
	 * */
	
	MyListNode front;
	MyListNode rear;
	
	
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		
		if( isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
			
		}else {
			newNode = addElement(data);
			rear = newNode;
			
		}
		System.out.println(newNode.getData() + "added");
		
	}

	@Override
	public String deQueue() {
		if( isEmpty()) {
			return null;
		}
		
		String data = front.getData();
		front = front.next;
		
		if( front == null) {
			rear = null;
		}
		
		return data;
		
	}

	@Override
	public void printQueue() {
		printAll();
	}

	
	
	 
	
	
	
}
