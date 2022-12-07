package design.proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

	public static void main(String[] args) {
//		Browser browser = new Browser("www.naver.com");
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show(); // ������ ȣ�� �� ������ �Ź� �ε�
		
		IBrowser browser = new BrowserProxy("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		
		// AOP > Ư���� �޼ҵ��� ���� �ð�, Ư���� ��Ű���� �����ϴ� �޼����� ��, �ķ� �۾��ϰ� ���� �κ�
		// Ư���� ��û�� ���� ������Ʈ����, �������� ������ ���� �� �ڵ忡 �������� �ƴ϶� �ϰ������� Ư�� ��Ű���� ��� �޼ҵ忡 ���� 
		// �ð� ������ ���� �Ϳ� ���
		// �����ͺ��̽� �۾� �� Ʈ������ �κп� Ȱ��, ���񽺰��� ��Ž� Ȱ��, Ŭ���̾�Ʈ�� http ���
		
		/* ���ü� ���� AtomicLong()
		 * Thread-safe�� �����Ǿ� ��Ƽ�����忡�� synchronized ���� ����� �� �ִ�.
		 * ���� synchronized ���� ���� ���
		 * */
		
		AtomicLong start = new AtomicLong(); // 0���� ����, �Ű������� ���� ���� ��� �ش� ������ �ʱ�ȭ 
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowser("www.naver.com",
				()->{ //���ٽ� Runnable ����
					System.out.println("before");
					start.set(System.currentTimeMillis());
				},
				
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
				}
		);
		
		aopBrowser.show();
		System.out.println("loading time : "+ end.get());
		
		aopBrowser.show();
		System.out.println("loading time : "+ end.get()); // �ι�° Ȱ��� cache�� Ȱ���ϱ� ������ 0���ΰ� Ȯ�� ����
		
		
	}

}
