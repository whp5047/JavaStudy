package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		// FileInputStream은 한글을 읽을 때 깨짐 > InputSTreamReader() 의 매개변수로 넘겨 한글을 읽을 수 있게 처리
		
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			int i;
			
			while( (i = isr.read()) != -1 ) { // 보조스트림으로 읽음
				System.out.print((char)i);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
