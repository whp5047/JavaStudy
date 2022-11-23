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
		 * ���� ��Ʈ��
		 * ���� �а� ���� ��Ʈ���� �ƴ� ���� ����� �����ϴ� ��Ʈ��
		 * FilterInputStream, FilterOutputStream �� ���� ��Ʈ���� ���� Ŭ������
		 * �������� �Ű������� �� �ٸ� ��Ʈ��(��� ��Ʈ���̳� �ٸ� ���� ��Ʈ��)�� ����
		 * Decorator Pattern���� ������
		 * ���� Ŭ���� ������
		 * 
		 * protected FilterInputStream (InputStream in) : �������� �Ű������� InPutStream�� �޽��ϴ�.
		 * public FilterOutputStream (OutputStream out) : �������� �Ű������� OutputStream�� �޽��ϴ�.
		 * 
		 * InputStreamReader : ���� �� ����Ʈ�� ���ڷ� ��ȯ���ִ� ���� ��Ʈ��
		 * OutputStreamWriter : �� �� ����Ʈ�� ���ڷ� ��ȯ���ִ� ���� ��Ʈ��
		 * 
		 * BufferedInputStream : �о���϶� �� 8K�� �迭�� �����Ǿ� ���۸� - > �д� �ӵ��� ���� 
		 * BufferedOutputStream : �� �� ���۸� -> ���� �ӵ��� ����
		 * 
		 * 
		 * DataInputStream : ������ ��ü�� �״�� �д� ��Ʈ��
		 * DataOutputStream : ������ ��ü�� �״�� ���� ��Ʈ��
		 * 
		 * DataInputStream �޼���
		 * 
		 * byte readByte() : 1����Ʈ�� �о� ��ȯ�մϴ�.
		 * boolean readBoolean() : �д� �ڷᰡ 0�� �ƴϸ� true��, 0 �̸� false�� ��ȯ�մϴ�
		 * char readChar() : �� ���ڸ� �о� ��ȯ�մϴ�
		 * short readShort() : 2����Ʈ�� �о� ���� ���� ��ȯ�մϴ�.
		 * int readInt() : 4����Ʈ�� �о� ���� ���� ��ȯ�մϴ�.
		 * long readLong() : 8����Ʈ�� �о� ���� ���� ��ȯ�մϴ�.
		 * float readFloat() : 4����Ʈ�� �о� �Ǽ� ���� ��ȯ�մϴ�.
		 * double readDouble() : 8����Ʈ�� �о� �Ǽ� ���� ��ȯ�մϴ�.
		 * String readUTF() : ������ UTF-8 ���ڵ� ������� ���ڿ��� �о� ��ȯ�մϴ�.
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
		
		System.out.println(millisecond + "�� �ҿ�Ǿ����ϴ�.");
		
		Socket socket = new Socket();
		
		BufferedReader br  =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.readLine(); // ������ ���� ���� ���� �� ���� �� ���
		
		
	}

}
