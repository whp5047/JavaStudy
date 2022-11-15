package JavaDataStructure.Stack;

import java.lang.reflect.Array;

import JavaDataStructure.Array.MyArray;

public class MyArrayStack {
	
	/* top에서만 삭제, 삽입 가능
	 * 가장 최근의 자료를 찾아오거나 게임에서 히스토리 유지하고 롤백시 사용
	 * 함수의 메모리는 호출순서에 따른 stack구조
	 * */
	
	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
		
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
		
	}
	
	public void push(int data) {
		
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
		
	}
	
	public boolean isFull() {
		
		if( top == arrayStack.ARRAY_SIZE) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public int pop() {
		if( isEmpty() ) {
			System.out.println(isEmpty());
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
		
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
		
	}
	
	public boolean isEmpty() {
		
		if( top == 0 ) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	
}
