package OOP2.ch10.webUserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import OOP2.ch10.UserInfo;
import OOP2.ch10.dao.UserInfoDao;
import OOP2.ch10.dao.mysql.UserInfoMySqlDao;
import OOP2.ch10.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		
		UserInfoDao userInfoDao = null;
		
		if( dbType.equals("ORACLE") ) {
			userInfoDao = new UserInfoOracleDao();
		 
		}else if( dbType.equals("MYSQL") ){
			userInfoDao = new UserInfoMySqlDao();
			
		}else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
			
	}
}
