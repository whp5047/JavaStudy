package JavaInnerClass.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true); // true -> 이어쓰기 false가 기본값으로 덮어쓰기
		
		try(fos){ // java9 부터 제공되는 기능
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
//			fos.write(bs);
			fos.write(bs, 2, 10);
			
		}catch(IOException e) {
			System.out.println(e);
			
		}
		System.out.println("end");
		
	}
	
}
