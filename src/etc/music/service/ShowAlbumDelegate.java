package etc.music.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import etc.music.dao.android.IShowAlb;
import etc.music.dao.impl.ShowAlbumDao;

@javax.jws.WebService(targetNamespace = "http://service.music.etc/", serviceName = "ShowAlbumService", portName = "ShowAlbumPort")
public class ShowAlbumDelegate {

	etc.music.service.ShowAlbum showAlbum = new etc.music.service.ShowAlbum();

	public String showAlbum() {
		return showAlbum.showAlbum();
	}

	public String getMedia(int id) {
		return showAlbum.getMedia(id);
	}

	public String getAlbumName(int id) {
		return showAlbum.getAlbumName(id);
	}

	public String getAlbumArt(int id) {
		return showAlbum.getAlbumArt(id);
	}

	public String getAlbumIntro(int id) {
		return showAlbum.getAlbumIntro(id);
	}

	public String getAlbumPath(int id) {
		return showAlbum.getAlbumPath(id);
	}

	public int getAlbumIdByName(String name) {
		return showAlbum.getAlbumIdByName(name);
	}

}