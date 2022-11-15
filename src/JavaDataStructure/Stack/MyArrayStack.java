package JavaDataStructure.Stack;

import java.lang.reflect.Array;

import JavaDataStructure.Array.MyArray;

public class MyArrayStack {
	
	/* top������ ����, ���� ����
	 * ���� �ֱ��� �ڷḦ ã�ƿ��ų� ���ӿ��� �����丮 �����ϰ� �ѹ�� ���
	 * �Լ��� �޸𸮴� ȣ������� ���� stack����
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
