package design.adapter;

public class HairDryer implements Electronic110V{
	
	@Override
	public void powerOn() {
		System.out.println("��� ����̱� 110V on");
		
	}
	
	
}
