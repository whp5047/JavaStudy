package JavaInnerClass.Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		/* 
		 *  try - catch - finally
	     * finally 블럭에서 파일을 닫거나 네트웍을 닫는 등의 리소스 해제 구현을함
	     * try{} 블럭이 수행되는 경우, finally{} 블럭은 항상 수행됨
	     * 여러개의 예외 블럭이 있는 경우 각각에서 리소스를 해제하지 않고 finally블록에서 해제하도록 구현함
	     * 컴파일러에 의해 예외가 처리 되는 예 (파일 에러 처리)
	     * 
		 * 
		 * */
		FileInputStream fis = null;
		
		// finally를 사용하지 않는경우 catch 문안에서도 계속 try - catch문을 사용해야함
//		try {
//			fis = new FileInputStream("a.txt"); // 프로젝트 내부에서 해당 파일을 먼저 찾음
//			
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//				
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			
//			try {
//				fis.close();
//			} catch (IOException e1) {
//				
//			}
//			
//		}
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (Exception e) {
			System.out.println(e);
			
		} finally {
			
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
					
				}
			}
			System.out.println("finally");
			
		}
		
		System.out.println("end");
		
		try(FileInputStream fis2 = new FileInputStream("a.txt")){ // try - with - resources
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) { // close 시 나는 에러
			
			e.printStackTrace();
		}
		
		
		
	}
}
