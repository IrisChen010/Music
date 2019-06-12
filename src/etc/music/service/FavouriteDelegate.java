package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.IFavouriteDao;
import etc.music.dao.impl.FavouriteDaoImpl;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "FavouriteService", portName = "FavouritePort")
public class FavouriteDelegate {

	etc.music.service.Favourite favourite = new etc.music.service.Favourite();

	public String getFavouriteData(int userId) {
		return favourite.getFavouriteData(userId);
	}

}