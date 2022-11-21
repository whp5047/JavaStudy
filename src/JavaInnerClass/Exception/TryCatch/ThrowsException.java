package JavaInnerClass.Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	/* ���� ó�� �̷��
	 * ���� ó���� ���ܰ� �߻��ϴ� ���忡�� try - catch ������� ó���ϴ� ����� �̸� ����ϴ� �κп��� ó���ϴ� ��� �ΰ����� ����
	 * throws �� �̿��ϸ� ���ܰ� �߻��� �� �ִ� �κ��� ����ϴ� ���忡�� ���ܸ� ó���� �� ����
	 * 
	 * 
	 * �ϳ��� try{} ��Ͽ��� ���ܰ� ������ �߻��ϴ� ���
	 * �������� ���ܰ� �߻��ϴ� ��� ���ܸ� ��� �ϳ��� ������� ó���� ���� �ְ� ������ ���ܸ� ���� ó���� �� ����
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
			
		} catch (Exception e) { // Exception e �� �ϸ� defaultó�� ��� ����ó���� ��� �ڵ��� �帧�� ���� ���ϸ��� ����ϸ� �ȉ�
			System.out.println(e);
			
		}   
		
	}
	
}
