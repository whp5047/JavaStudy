package JavaInnerClass.IOStream.File;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		/* File Ŭ����
		 * ���� ������ �߻�ȭ�� Ŭ����
		 * ����� ����� ����, ������ �̸�, ���, �б� ������� �Ӽ��� �� �� ����
		 * �̸� �����ϴ� ���� �޼������ ������
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
