package OOP.ch06;

public class UserInfo {
	
	/* 생성자를 따로 구현하면 기본생성자는 제공되지 않음 
	 * 생성자를 호출하는 코드가 여러개라면 필요에 따라 호출하여 사용이 가능 
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
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은" + userName + "입니다.."; 
	}
	
}
