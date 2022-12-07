package design.proxy;

public class BrowserProxy implements IBrowser {
	/*
	 * proxy는 대리인이라는 뜻으로 뭔가를 대신 처리
	 * 대신 전달하는 형태로 설계되며, 실제 client는 Proxy로 부터 결과를 받음
	 * Cache의 기능으로도 활용이 가능
	 * SOLID 중에 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)를 따른다.
	 * */
	
	private String url;
	private Html html;
	
	public BrowserProxy(String url) {
		this.url = url;
		
	}
	
	@Override
	public Html show() {
		if(html == null) {
			this.html = new Html(url);
			System.out.println("BrowserProxy loading html from : " + url);
		}
		
		System.out.println("BrowserProxy use cache html : " + url);
		
		return html;
	}
	
	
	
	
}
