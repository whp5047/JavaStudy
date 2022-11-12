package OOP2.ch10.dao.mysql;

import OOP2.ch10.UserInfo;
import OOP2.ch10.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userID = " + userInfo.getUserId());
	}

	
}
