package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		// FileInputStream�� �ѱ��� ���� �� ���� > InputSTreamReader() �� �Ű������� �Ѱ� �ѱ��� ���� �� �ְ� ó��
		
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			int i;
			
			while( (i = isr.read()) != -1 ) { // ������Ʈ������ ����
				System.out.print((char)i);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
