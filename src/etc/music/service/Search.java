package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.ISearchDao;
import etc.music.dao.impl.SearchDaoImpl;

@WebService
public class Search {

	@WebMethod
	public String searchByAlbum(final String keyWord){
		ISearchDao dao = new SearchDaoImpl();
		return dao.SearchByAlbum(keyWord);
	}
	
	@WebMethod
	public String getAlbumPath(final String keyWord){
		ISearchDao dao = new SearchDaoImpl();
		return dao.AlbumPath(keyWord);
	}
	
	@WebMethod
	public String SearchByChar(String keyword){
		ISearchDao dao = new SearchDaoImpl();
		return dao.SearchByChar(keyword);
	}
}
