package design.facade;

public class Ftp {
	/*
	 * Facade pattern : ���� ���� ��ü�� ���� ����ϴ� ���� ��ü�� ���̿� ������ �������谡 ���� ��,
	 * facade ��� ��ü�� �ΰ�, ���⼭ �����ϴ� interface���� Ȱ���Ͽ� ����� ����Ͽ� �������� ���� ������ �����ϰ� ����
	 * facade�� �ڽ��� ������ �ִ� �� Ŭ������ ����� ��Ȯ�ϰ� �˾ƾ���
	 * 
	 * 
	 * 
	 * */
	private String host;
	private int port;
	private String path;

	public Ftp(String host, int port, String path) {
		this.host = host;
		this.port = port;
		this.path = path;
	}
	
	public void connect(){
		System.out.println("FTP Host : " + host + " Port : " + port +"�� �����մϴ�.");
	}
	 
	public void moveDirectory() {
		System.out.println("path : " + path + "�� �̵��մϴ�.");
	}
	
	public void disConnect() {
		System.out.println("FTP ������ �����մϴ�.");
	}
	
}
