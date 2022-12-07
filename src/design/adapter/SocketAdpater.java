package design.adapter;

public class SocketAdpater implements Electronic110V{
	
	private Electronic220V electronic220V;
	
	public SocketAdpater(Electronic220V electronic220V) {
		this.electronic220V = electronic220V;
	}

	@Override
	public void powerOn() {
		electronic220V.connect();
	}
	
	
	
}
