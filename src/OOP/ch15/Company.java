package OOP.ch15;

public class Company {
	
	/* �̱��� ���� > ���α׷����� �ν��Ͻ��� �� �� ���� �����Ǿ�� �ϴ� ��� ����ϴ� ������ ����
	 * static ����, �޼��带 Ȱ���Ͽ� ���� �� �� ����
	 * 
	 * 
	 * 
	 * 
	 * */
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		
		if( instance == null ) {
			instance = new Company();
		}
		
		return instance;
		
	}
	
}
