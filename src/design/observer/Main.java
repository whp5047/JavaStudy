package design.observer;

public class Main {

	public static void main(String[] args) {
		
		Button button = new Button("��ư");
		
		button.addListener(new IButtonListener() {
			@Override
			public void clickEvent(String event) {
				System.out.println(event); 
			}
		});
		
		button.click("�޼��� ���� :  click1");
		button.click("�޼��� ���� :  click2");
		button.click("�޼��� ���� :  click3");
		button.click("�޼��� ���� :  click4");
	}
}
