package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		
		/*
		 * Reader : 
		 * ���� ���� �Է� ��Ʈ�� �ֻ��� �߻� Ŭ����
		 * ���� �߻� �޼��尡 ����Ǿ� �ְ� �̸� ���� ��Ʈ���� ��ӹ޾� ������
		 * 
		 * Ŭ���� 
		 * FileReader : ���Ͽ��� ���� ������ �д� ��Ʈ�� Ŭ����
		 * InputStreamReader : ����Ʈ ������ ���� �ڷḦ ���ڷ� ��ȯ���ִ� ���� ��Ʈ�� Ŭ�����Դϴ�.
		 * BufferedReader : ���ڷ� ���� �� �迭�� �����Ͽ� �Ѳ����� ���� �� �ִ� ����� �����ϴ� ���� ��Ʈ���Դϴ�.
		 * 
		 * �ֿ� �޼���
		 * int read() : ���Ϸκ��� �� ���ڸ� �н��ϴ�. ���� ���ڸ� ��ȯ�մϴ�.
		 * int read(char[] buf) : ���Ϸκ��� buf �迭�� ���ڸ� �н��ϴ�.
		 * int read(char[] buf, int off, int len) : ���Ϸκ��� buf �迭�� off ��ġ�κ��� len ������ŭ�� ���ڸ� �н��ϴ�.
		 * void close() : �Է� ��Ʈ���� ����� ��� ���ҽ��� �ݽ��ϴ�.
		 * 
		 * 
		 * Writer : 
		 * ���� ���� ��� ��Ʈ�� �ֻ��� �߻� Ŭ����
		 * ���� �߻� �޼��尡 ����Ǿ� �ְ� �̸� ���� ��Ʈ���� ��ӹ޾� ������
		 * 
		 * �ֿ� ���� Ŭ����
		 * FileWriter : ���Ͽ��� ���� ������ ����ϴ� ��Ʈ�� Ŭ�����Դϴ�.
		 * OutputStreamWriter : ����Ʈ ������ �ڷḦ ���ڷ� ��ȯ�� ������ִ� ���� ��Ʈ�� Ŭ�����Դϴ�.
		 * BufferedWriter : ���ڷ� �� �� �迭�� �����Ͽ� �Ѳ����� �� �� �ִ� ����� �����ϴ� ���� ��Ʈ���Դϴ�.
		 * 
		 * int write(int c) : �ѹ��ڸ� ���Ͽ� ���
		 * int write(char[] buf) : ���� �迭 buf�� ������ ����մϴ�.
		 * int write(char[] buf, int off, int len) : ���� �迭 buff�� off ��ġ���� len ������ ���ڸ� ����մϴ�.
		 * int write(String str) : ���ڿ� str�� ����մϴ�.
		 * 
		 * int write(String str, int off, int len) : ���ڿ� str�� off���� ���ڷκ��� len ������ŭ ����մϴ�.
		 * int flush() : ����ϱ� ���� �ڷᰡ �ִ� ����(��� ����)�� ��� ����ϵ��� �մϴ�.
		 * void close() : ��Ʈ���� ����� ���ҽ��� �ݽ��ϴ�. ��� ���۵� ������ϴ�.
		 * 
		 * 
		 * */
		
		try(FileReader fr = new FileReader("reader.txt")){ //FileReader : ���Ͽ��� ���� ������ �д� ��Ʈ�� Ŭ����
			int i;
			
			while( (i = fr.read()) != -1 ) {
				System.out.print((char)i);
			}
			
		}catch (IOException e) {
			
		}
		
		
		
	}

}
