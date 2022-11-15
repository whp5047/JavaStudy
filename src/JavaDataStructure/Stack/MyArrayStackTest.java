package JavaDataStructure.Stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40); // size = 3이여서 못담음

		stack.printAll();
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
