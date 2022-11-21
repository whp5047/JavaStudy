package JavaInnerClass.Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		/* 
		 *  try - catch - finally
	     * finally ������ ������ �ݰų� ��Ʈ���� �ݴ� ���� ���ҽ� ���� ��������
	     * try{} ���� ����Ǵ� ���, finally{} ���� �׻� �����
	     * �������� ���� ���� �ִ� ��� �������� ���ҽ��� �������� �ʰ� finally��Ͽ��� �����ϵ��� ������
	     * �����Ϸ��� ���� ���ܰ� ó�� �Ǵ� �� (���� ���� ó��)
	     * 
		 * 
		 * */
		FileInputStream fis = null;
		
		// finally�� ������� �ʴ°�� catch ���ȿ����� ��� try - catch���� ����ؾ���
//		try {
//			fis = new FileInputStream("a.txt"); // ������Ʈ ���ο��� �ش� ������ ���� ã��
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
			
		} catch (IOException e) { // close �� ���� ����
			
			e.printStackTrace();
		}
		
		
		
	}
}
