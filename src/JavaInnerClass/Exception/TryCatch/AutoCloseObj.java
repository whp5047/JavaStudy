package JavaInnerClass.Exception.TryCatch;

public class AutoCloseObj  implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("closing...");
		
	}
	
	/* try - with - resources ��
	 * 
	 * ���ҽ� ����ϴ� ��� close() ���� �ʾƵ� �ڵ����� ���� �ǵ��� ��
	 * �ڹ� 7���� �����Ǵ� ����
	 * ���ҽ��� try() ���ο��� �����ؾ��� // �ڹ� 7����
	 * close()�� ��������� ȣ������ �ʾƵ� try{} ��Ͽ��� ���� ���ҽ��� �������� ��쳪 ���ܰ� �߻��� ��� ��� �ڵ����� ������
	 * �ش� ���ҽ� Ŭ������ AutoClaseable �������̽��� �����ؾ���
	 * FileInputStream�� ��쿡�� AutoClaseAble �� �����ϰ� ����
	 * 
	 * �ڹ� 9���� ���ҽ� try{} �ܺο� �����ϰ� �������� try(obj)�� ���� ��� �� �� ����
	 * 
	 * */
	
}
