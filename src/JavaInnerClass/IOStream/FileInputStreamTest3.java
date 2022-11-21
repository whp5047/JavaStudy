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
				
				for(int j = 0; j < i; j++) { //enhanced for 사용시 배열에 값이 남음 이럴 때는 일반 for로 돌려서 해결
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i +"바이트 읽음" );
			}
			
		
			
		
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
			
		} catch (IOException e) { //fileNotFound 보다 상위
			e.printStackTrace();
			
		}
			
		
		
		
	}

}
