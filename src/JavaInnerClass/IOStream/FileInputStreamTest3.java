package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		
		try (FileInputStream fis =  new FileInputStream("input2.txt")){
			int i;
			
			byte[] bs = new byte[10];
			while( (i = fis.read(bs, 1, 9)) != -1) {
//			while( (i = fis.read(bs)) != -1) {
				
				for(int j = 0; j < i; j++) { //enhanced for ���� �迭�� ���� ���� �̷� ���� �Ϲ� for�� ������ �ذ�
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i +"����Ʈ ����" );
			}
			
		
			
		
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
			
		} catch (IOException e) { //fileNotFound ���� ����
			e.printStackTrace();
			
		}
			
		
		
		
	}

}
