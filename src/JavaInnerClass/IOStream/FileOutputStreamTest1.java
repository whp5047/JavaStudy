package JavaInnerClass.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	
	/* OutputStream
	 * ����Ʈ ���� ��� ��Ʈ�� �ֻ��� �߻� Ŭ����
	 * ���� �߻� �޼��尡 ����Ǿ� �ְ� �̸� ���� ��Ʈ���� ��ӹ޾� ������
	 * 
	 * �ֿ� ����Ŭ����
	 * FileOutputStream : ���Ͽ��� ����Ʈ ������ �ڷḦ ���ϴ�.
	 * ByteArrayOutputStream : byte �迭 �޸𸮿��� ����Ʈ ������ �ڷḦ ���ϴ�.
	 * FilterOutputStream : ��� ��Ʈ������ �ڷḦ �� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ����
	 * 
	 * �ֿ� �޼���
	 * int write() : �ѹ���Ʈ�� ����մϴ�
	 * int write(byte b[]) : b[] ũ���� �ڷḦ ����մϴ�.
	 * int write(byte b[], int off, int len) : b[] �迭�� �ִ� �ڷ��� off ��ġ���� len ������ŭ �ڷḦ ����մϴ�.
	 * void flush() : ����� ���� ��� �ڷᰡ �ӹ����� ��� ���۸� ������ ��� �ڷḦ ����մϴ�.
	 * void close() : ��� ��Ʈ���� ����� ��� ���ҽ��� �ݽ��ϴ�. ��� ���۰� ������ϴ�.
	 * 
	 * append�� ������ true  default�� false�� �Ǿ�����
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		try( FileOutputStream fos = new FileOutputStream("output.txt")){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(IOException e) {
			System.out.println(e);
			
		}
		System.out.println("end");
		
	}
	
}
