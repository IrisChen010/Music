package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.IUserInfoDao;
import etc.music.dao.impl.UserInfoDaoImpl;

@WebService
public class UserLogin {
	
	@WebMethod
	public boolean checkNickName (final String nickName, final String password){
		IUserInfoDao dao = new UserInfoDaoImpl();
		return dao.checkNickName(nickName, password);
	}
	
	@WebMethod
	public int getUserId(final String nickName,final String password){
		IUserInfoDao dao = new UserInfoDaoImpl();
		return dao.getUserId(nickName, password);
	}

}
