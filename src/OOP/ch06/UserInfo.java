package OOP.ch06;

public class UserInfo {
	
	/* �����ڸ� ���� �����ϸ� �⺻�����ڴ� �������� ���� 
	 * �����ڸ� ȣ���ϴ� �ڵ尡 ��������� �ʿ信 ���� ȣ���Ͽ� ����� ���� 
	 * 
	 * 
	 * */
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {}

	public UserInfo(String userId, String userPassword, String userName) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, ��ϵ� �̸���" + userName + "�Դϴ�.."; 
	}
	
}
