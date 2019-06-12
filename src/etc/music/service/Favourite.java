package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.IFavouriteDao;
import etc.music.dao.impl.FavouriteDaoImpl;

@WebService
public class Favourite {

	@WebMethod
	public String getFavouriteData(final int userId){
		IFavouriteDao dao = new FavouriteDaoImpl();
		return dao.getFavouriteData(userId);
	}

}
