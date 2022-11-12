package OOP2.ch10.dao.oracle;

import OOP2.ch10.UserInfo;
import OOP2.ch10.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
	
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from ORACLE DB userID = " + userInfo.getUserId());
	}

	
}
