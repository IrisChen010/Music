package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.IRegisterDao;
import etc.music.dao.impl.RegisterDaoImpl;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "RegisterService", portName = "RegisterPort")
public class RegisterDelegate {

	etc.music.service.Register register = new etc.music.service.Register();

	public boolean checkName(String nickName) {
		return register.checkName(nickName);
	}

	public void addUser(String nickName, String password, String email) {
		register.addUser(nickName, password, email);
	}

}