package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.ISearchDao;
import etc.music.dao.impl.SearchDaoImpl;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "SearchService", portName = "SearchPort")
public class SearchDelegate {

	etc.music.service.Search search = new etc.music.service.Search();

	public String searchByAlbum(String keyWord) {
		return search.searchByAlbum(keyWord);
	}

	public String getAlbumPath(String keyWord) {
		return search.getAlbumPath(keyWord);
	}

	public String SearchByChar(String keyword) {
		return search.SearchByChar(keyword);
	}

}