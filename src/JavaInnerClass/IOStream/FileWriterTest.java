package JavaInnerClass.IOStream;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'F', 'G'};
			
			fw.write(buf); // �迭���
			fw.write("�ȳ��ϼ���. �� �����׿�."); //��Ʈ�� ���
			fw.write(buf, 1, 2); // ���ڹ迭�� �Ϻ� ���
			fw.write("65");// ���� �״�� ��� 
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		
	}

}
