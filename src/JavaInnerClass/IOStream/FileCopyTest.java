package JavaInnerClass.IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) {

		/*
		 * 보조 스트림
		 * 실제 읽고 쓰는 스트림이 아닌 보조 기능을 제공하는 스트림
		 * FilterInputStream, FilterOutputStream 이 보조 스트림의 상위 클래스들
		 * 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐
		 * Decorator Pattern으로 구현됨
		 * 상위 클래스 생성자
		 * 
		 * protected FilterInputStream (InputStream in) : 생성자의 매개변수로 InPutStream을 받습니다.
		 * public FilterOutputStream (OutputStream out) : 생성자의 매개변수로 OutputStream을 받습니다.
		 * 
		 * InputStreamReader : 읽을 때 바이트를 문자로 변환해주는 보조 스트림
		 * OutputStreamWriter : 쓸 때 바이트를 문자로 변환해주는 보조 스트림
		 * 
		 * BufferedInputStream : 읽어들일때 약 8K의 배열이 제공되어 버퍼링 - > 읽는 속도의 증가 
		 * BufferedOutputStream : 쓸 때 버퍼링 -> 쓰는 속도의 증가
		 * 
		 * 
		 * DataInputStream : 데이터 자체를 그대로 읽는 스트림
		 * DataOutputStream : 데이터 자체를 그대로 쓰는 스트림
		 * 
		 * DataInputStream 메서드
		 * 
		 * byte readByte() : 1바이트를 읽어 반환합니다.
		 * boolean readBoolean() : 읽는 자료가 0이 아니면 true를, 0 이면 false를 반환합니다
		 * char readChar() : 한 문자를 읽어 반환합니다
		 * short readShort() : 2바이트를 읽어 정수 값을 반환합니다.
		 * int readInt() : 4바이트를 읽어 정수 값을 반환합니다.
		 * long readLong() : 8바이트를 읽어 정수 값을 반환합니다.
		 * float readFloat() : 4바이트를 읽어 실수 값을 반환합니다.
		 * double readDouble() : 8바이트를 읽어 실수 값을 반환합니다.
		 * String readUTF() : 수정된 UTF-8 인코딩 기반으로 문자열을 읽어 반환합니다.
		 * 
		 * */
		
		long millisecond = 0;
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip0"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1 ) {
				bos.write(i);
				
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + "초 소요되었습니다.");
		
		Socket socket = new Socket();
		
		BufferedReader br  =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.readLine(); // 웹문서 같은 것을 한줄 씩 읽을 때 사용
		
		
	}

}
