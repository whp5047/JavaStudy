package JavaInnerClass.IOStream.File;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		/* File 클래스
		 * 파일 개념을 추상화한 클래스
		 * 입출력 기능은 없고, 파일의 이름, 경로, 읽기 전용등의 속성을 알 수 있음
		 * 이를 지원하는 여러 메서드들이 제공됨
		 * */
		
		File file = new File("D:\\workspace\\JavaStudy\\src\\JavaInnerClass\\IOStream\\File\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
		
		
	}

}
