package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.IShopCartDao;
import etc.music.dao.impl.ShopCartDaoImpl;

@WebService
public class ShopCart {
	
	@WebMethod
	public String getData(final int userId){
		IShopCartDao dao = new ShopCartDaoImpl();
		return dao.getData(userId);
	}

}
