package JavaDataStructure.Queue;

public class MyListQueueTest {

	public static void main(String[] args) {
		
		MyLinkedListQueue listQueue = new MyLinkedListQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		
		listQueue.printAll();
	}

}
