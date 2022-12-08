package design.facade;

public class Ftp {
	/*
	 * Facade pattern : 여러 개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있을 때,
	 * facade 라는 개체를 두고, 여기서 제공하는 interface만을 활용하여 기능을 사용하여 의존도를 낮춰 수정에 용의하게 만듬
	 * facade는 자신이 가지고 있는 각 클래스의 기능을 명확하게 알아야함
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
		System.out.println("FTP Host : " + host + " Port : " + port +"로 연결합니다.");
	}
	 
	public void moveDirectory() {
		System.out.println("path : " + path + "로 이동합니다.");
	}
	
	public void disConnect() {
		System.out.println("FTP 연결을 종료합니다.");
	}
	
}
