package design.facade;

public class Reader {
	
	private String fileName;

	public Reader(String fileName) {
		this.fileName = fileName;
	}
	
	public void fileConnect() {
		String msg = String.format("Reader %s �� �����մϴ�.", fileName); // fileName�� %s�� ��
		System.out.println(msg);
	}
	
	public void fileRead() {
		String msg = String.format("Reader %s �� ������ �о�ɴϴ�.", fileName); 
		System.out.println(msg);
		
	}
	
	public void fileDisconnect() {
		String msg = String.format("Reader %s �� ���� �����մϴ�.", fileName); 
		System.out.println(msg);
	}
	
	
}
