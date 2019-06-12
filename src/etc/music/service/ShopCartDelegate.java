package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.IShopCartDao;
import etc.music.dao.impl.ShopCartDaoImpl;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "ShopCartService", portName = "ShopCartPort")
public class ShopCartDelegate {

	etc.music.service.ShopCart shopCart = new etc.music.service.ShopCart();

	public String getData(int userId) {
		return shopCart.getData(userId);
	}

}