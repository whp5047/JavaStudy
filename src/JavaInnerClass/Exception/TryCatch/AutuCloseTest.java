package JavaInnerClass.Exception.TryCatch;



public class AutuCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj) { // �ȿ� �ڵ尡 ������ �ڵ����� close�޼��尡 ȣ��Ǵ� ���
			throw new Exception(); // ������ Exception���� �ѱ�
			
		}catch (Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
		
		
	}

}
