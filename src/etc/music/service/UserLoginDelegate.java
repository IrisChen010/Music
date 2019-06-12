package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.IUserInfoDao;
import etc.music.dao.impl.UserInfoDaoImpl;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "UserLoginService", portName = "UserLoginPort")
public class UserLoginDelegate {

	etc.music.service.UserLogin userLogin = new etc.music.service.UserLogin();

	public boolean checkNickName(String nickName, String password) {
		return userLogin.checkNickName(nickName, password);
	}

	public int getUserId(String nickName, String password) {
		return userLogin.getUserId(nickName, password);
	}

}