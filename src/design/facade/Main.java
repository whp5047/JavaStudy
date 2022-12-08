package design.facade;

public class Main {

	public static void main(String[] args) {
		// facade��ü ���� ����Ұ��
		Ftp ftpClient = new Ftp("www.foo.co.kr", 22 , "/home/etc");
		ftpClient.connect();
		ftpClient.moveDirectory();
		
		Writer writer = new Writer("text.tmp");
		writer.fileConnect();
		writer.write();
		
		Reader reader = new Reader("text.tmp");
		reader.fileConnect();
		reader.fileRead();
		
		reader.fileDisconnect();
		writer.fileDisconnect();
		ftpClient.disConnect();
		
		
		//facade�� �����Ͽ� ȣ��
		SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22 , "/home/etc", "text.tmp");
		sftpClient.connect();
		sftpClient.write();
		sftpClient.read();
		sftpClient.disConnect();
		
	}

}
