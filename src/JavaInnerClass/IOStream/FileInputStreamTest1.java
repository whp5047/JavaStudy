package JavaInnerClass.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		/* InputStream :
		 * ����Ʈ ���� �Է� ��Ʈ�� �ֻ��� �߻� Ŭ����
		 * ���� �߻� �޼��尡 ����Ǿ� �ְ�, �̸� ���� ��Ʈ���� ��ӹ޾� ������
		 * 
		 * �ֿ� ���� Ŭ����
		 * FileInputStream : ���Ͽ��� ����Ʈ ������ �ڷḦ �н��ϴ�
		 * ByteArrayInputStream : byte �迭 �޸𸮿��� ����Ʈ ������ �ڷḦ �н��ϴ�.
		 * FilterInputStream : ��� ��Ʈ������ �ڷḦ ���� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ����
		 * 
		 * �ֿ� �޼���
		 * int read() : �Է� ��Ʈ�����κ��� �� ����Ʈ�� �ڷḦ �н��ϴ�. ���� �ڷ��� ����Ʈ ���� ��ȯ�մϴ�.
		 * int read(byte b[]) : �Է� ��Ʈ������ ���� b[] ũ���� �ڷḦ b[]�� �н��ϴ�. ���� �ڷ��� ����Ʈ ���� ��ȯ�մϴ�.
		 * int read(byre b[], int off, int len) : �Է� ��Ʈ������ ���� b[] ũ���� �ڷḦ b[]�� off ���� ��ġ���� �����ϸ�,
		 * 										  len��ŭ �н��ϴ�. ���� �ڷ��� ����Ʈ ���� ��ȯ�մϴ�.
		 * void close() : �Է� ��Ʈ���� ����� ��� ���ҽ��� �ݽ��ϴ�.
		 * 
		 * */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
		} catch (IOException e) { //fileNotFound ���� ����
			e.printStackTrace();
			
			try {
				fis.close(); //������ ����µ� close �Ϸ����ؼ� nullPoint 
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
