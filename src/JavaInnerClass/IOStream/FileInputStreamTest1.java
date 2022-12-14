package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		/* InputStream :
		 * 바이트 단위 입력 스트림 최상위 추상 클래스
		 * 많은 추상 메서드가 선언되어 있고, 이를 하위 스트림이 상속받아 구현함
		 * 
		 * 주요 하위 클래스
		 * FileInputStream : 파일에서 바이트 단위로 자료를 읽습니다
		 * ByteArrayInputStream : byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.
		 * FilterInputStream : 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
		 * 
		 * 주요 메서드
		 * int read() : 입력 스트림으로부터 한 바이트의 자료를 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
		 * int read(byte b[]) : 입력 스트림으로 부터 b[] 크기의 자료를 b[]에 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
		 * int read(byre b[], int off, int len) : 입력 스트림으로 부터 b[] 크기의 자료를 b[]의 off 변수 위치부터 저장하며,
		 * 										  len만큼 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
		 * void close() : 입력 스트림과 연결된 대상 리소스를 닫습니다.
		 * 
		 * */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
		} catch (IOException e) { //fileNotFound 보다 상위
			e.printStackTrace();
			
			try {
				fis.close(); //파일이 비었는데 close 하려고해서 nullPoint 
			} catch (IOException e2) {
				e2.printStackTrace();
			} catch(Exception e3) {
				e3.printStackTrace();
			}
			
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(Exception e2) {
				e2.printStackTrace();
				System.out.println(e2);
			}
			
		}
		
		System.out.println("end");
		
		
		
	}

}
