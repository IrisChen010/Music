package etc.music.dao.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import etc.music.dao.AlbumDao;
import etc.music.dao.ArtistDao;
import etc.music.dao.CorpDao;
import etc.music.dao.android.ISearchDao;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.Corp;
import etc.music.pojo.Media;

public class SearchDaoImpl implements ISearchDao {
	
	public String SearchByArtist(String keyWord) {
		List<Album> albums = new AlbumDao().getAlbumsByArtistName(keyWord);
		Iterator it = albums.iterator();
		StringBuffer sf = new StringBuffer();
		
		while(it.hasNext()){
			Album album = (Album) it.next();
			sf.append(album.getName() + "," + album.getLanguage() + "," + album.getCorp() + ";");
		}
		String sc = sf.toString();
		
		return sc;
	}
	
	
	public String SearchByAlbum(String keyWord) {
		Album album = new AlbumDao().getAlbumByName(keyWord);
		Set<Media> medias = album.getMedias();
		Iterator it = medias.iterator();
		StringBuffer sf = new StringBuffer();
		
		while(it.hasNext()){
			Media media = (Media) it.next();
			sf.append(media.getTitle() + "," + media.getLength() + ";");
		}
		String sc = sf.toString();
		
		return sc;
	}
	public String AlbumPath(String keyWord) {
		Album album = new AlbumDao().getAlbumByName(keyWord);
		
		return album.getPath();
	}
	
	
	public String SearchByChar(String keyword) {
		List<Album> albums = new AlbumDao().getAlbumsByNameChar(keyword);
		Iterator it = albums.iterator();
		StringBuffer sb = new StringBuffer();
		while (it.hasNext()) {
			 Album alb = (Album) it.next();
			 Timestamp time=alb.getReleaseDate();
			 SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
			 String date=sd.format(time);
			 
			 int artId = alb.getArtist().getId();
			 Artist artist = new ArtistDao().getArtistById(artId);
			 String artName = artist.getArtName();
			 int corpId = alb.getCorp().getId();
			 Corp corperation = new CorpDao().getCorpById(corpId);
			 String corpName = corperation.getName();
			 sb.append(alb.getId() + "," + alb.getName() + "," + 
					 artName + "," + corpName + "," + date + ";");
		}
		return sb.toString();
	}

}
