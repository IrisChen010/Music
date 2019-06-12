package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.IRegisterDao;
import etc.music.dao.impl.RegisterDaoImpl;

@WebService
public class Register {
	
	@WebMethod
	public boolean checkName(final String nickName){
		IRegisterDao dao = new RegisterDaoImpl();
		return dao.checkName(nickName);
	}
	
	@WebMethod
	public void addUser(final String nickName, final String password, final String email){
		IRegisterDao dao = new RegisterDaoImpl();
		dao.addUser(nickName, password, email);
	}

}