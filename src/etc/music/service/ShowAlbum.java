package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import etc.music.dao.android.IShowAlb;
import etc.music.dao.impl.ShowAlbumDao;

@WebService
public class ShowAlbum {

	@WebMethod
	public String showAlbum(){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbums();
	}
	
	@WebMethod
	public String getMedia(final int id){
		IShowAlb dao = new ShowAlbumDao();
		return dao.SearchMediaById(id);
	}
	
	@WebMethod
	public String getAlbumName(final int id){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbumNameById(id);
	}
	
	@WebMethod
	public String getAlbumArt(final int id){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbumArtById(id);
	}
	
	@WebMethod
	public String getAlbumIntro(final int id){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbumIntroById(id);
	}
	
	@WebMethod
	public String getAlbumPath(final int id){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbumPathById(id);
	}
	
	@WebMethod
	public int getAlbumIdByName(String name){
		IShowAlb dao = new ShowAlbumDao();
		return dao.getAlbumIdByName(name);
	}

}
