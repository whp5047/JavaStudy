package OOP2.ch10;

public class UserInfo {
	
	/* �������̽��� �� ���°�
	 * Ŭ������ ���α׷��� �����ϴ� ����� ��������� ����
	 * ������ Ŭ���̾�Ʈ �ڵ���� ���, Ŭ������ ���α׷��� �����ϴ� ��(specification)
	 * Ŭ���̾�Ʈ ���α׷��� �������̽��� ����� �޼��� ���� ���� �̸� ������ Ŭ������ ����� �� ����
	 * � ��ü�� �ϳ��� �������̽� Ÿ���̶�� ���� �� �������̽��� �����ϴ� ��� �޼��带 �����ߴٴ� �ǹ���
	 * �������̽��� ������ �پ��� ��ü�� ����� - ������
	 * 
	 * EX) JDBC �������̽�
	 * */

	private String userId;
	private String password;
	private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
