package Algorithm;

public class Heap {
	
	/* Heap의 삽입, 삭제의 연산은 평균 수행 시간이 O(logN)
	 * 
	 * 연산속도가 O(NlogN)인 *정렬 알고리즘은 퀵 정렬(Quick Sort), 병렬 정렬(Merge Sort), 힙 정렬(Heap Sort)이 해당
	 * 퀵 정렬 이외의 다른 알고리즘은 추가적인 메모리가 필요함
	 * 
	 * 우선순위 큐(Priority Queue)를 구현 시 힙(heap)을 사용
	 * */

	private int SIZE;
	private int heapArr[];
	
	public Heap()
	{
		SIZE = 0;
		heapArr = new int [50];
	}
	
	public void insertHeap(int input)
	{
		int i = ++SIZE;
		//while(( i != 1) && ( input > heapArr[i/2])){ //max heap
		while(( i != 1) && ( input < heapArr[i/2])){ //min heap
			heapArr[i] = heapArr[i/2];
			i = i/2;
		}
		heapArr[i] = input;
	}
	
	public int getHeapSize()
	{
		return SIZE;
	}
	
	public int deleteHeap()
	{
		int parent, child;
		int data, temp;
		data = heapArr[1]; 
		
		temp = heapArr[SIZE]; 
		SIZE -= 1; 
		parent =1; child = 2;
		
		while(child <= SIZE){
			//if((child < HEAP_SIZE) && (heapArr[child] < heapArr[child+1])){ //max heap
			if((child < SIZE) && (heapArr[child] > heapArr[child+1])){ //min heap
				child++;
			}
			//if(temp >= heapArr[child]) break; //max heap
			if(temp <= heapArr[child]) break;   //min heap
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		
		heapArr[parent] = temp;
		return data;
	}
	
	public void printHeap(){
		//System.out.printf("\n Max Heap : ");
		System.out.printf("\n Min Heap : ");
		for(int i=1; i<=SIZE; i++)
			System.out.printf("[%d] ", heapArr[i]);
	}
	public static void main(String[] args) {
		Heap h = new Heap();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
	
		int n, data;
		n = h.getHeapSize();
		for(int i=1; i<=n; i++){    
			data = h.deleteHeap();  
			System.out.printf("\n 출력 : [%d]", data);
		}
	}


}
