package JavaInnerClass.Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	/* 예외 처리 미루기
	 * 예외 처리는 예외가 발생하는 문장에서 try - catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두가지가 있음
	 * throws 를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음
	 * 
	 * 
	 * 하나의 try{} 블록에서 예외가 여러개 발생하는 경우
	 * 여러개의 예외가 발생하는 경우 예외를 묶어서 하나의 방법으로 처리할 수도 있고 각각의 예외를 따로 처리할 수 있음
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "abc");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			
		} catch (FileNotFoundException e) { //
			System.out.println(e);
			
		} catch (Exception e) { // Exception e 를 하면 default처리 모든 예외처리를 담당 코드의 흐름에 의해 제일먼저 사용하면 안됌
			System.out.println(e);
			
		}   
		
	}
	
}
