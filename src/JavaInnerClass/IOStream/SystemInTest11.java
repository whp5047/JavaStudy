package JavaInnerClass.IOStream;

import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		/*
		 * public static PrintStream out;
		 * public static InputStream in;
		 * public static PrintStream err;
		 * static ������ ����Ǿ��־� new ���� ��� ����
		 * 
		 * System Ŭ������ ǥ�� ����� ���
		 * System.out : ǥ�� ���(�����) ��Ʈ��
		 * 
		 * System.in : ǥ�� �Է�(Ű����) ��Ʈ��
		 * int d = System.in.read() // �ѹ���Ʈ �б�
		 * 
		 * System.err : ǥ�� ���� ���(�����) ��Ʈ��
		 * System.err.println("���� �޼���");
		 * 
		 * 
		 * */
		
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
//			while ( (i = System.in.read()) != '\n' ) { 
			while ( (i = irs.read()) != '\n' ) { 
				System.out.print((char)i); //�ѱ��� ���� 1byte�� �б� ���� �ѱ��� 2byte
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
