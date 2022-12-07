package design.singleton;

public class Main {

	public static void main(String[] args) {
		
		Aclazz aClazz = new Aclazz();
		Bclazz bClazz = new Bclazz();
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("�ΰ��� ��ü�� �����Ѱ�?");
		System.out.println(aClient.equals(bClient));
		
	}

}
