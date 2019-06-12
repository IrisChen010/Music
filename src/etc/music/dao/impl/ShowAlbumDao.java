package etc.music.dao.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.dao.AlbumDao;
import etc.music.dao.ArtistDao;
import etc.music.dao.android.IShowAlb;
import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.Media;

public class ShowAlbumDao implements IShowAlb {

	public String getAlbums()
	{ 
		Session session=HibernateSessionFactory.getSession();
		try {
		 session.beginTransaction();
		 Query query=session.createQuery("from Album");
		 query.setFirstResult(0);
		 query.setMaxResults(12);
		 List list=query.list();
		 session.getTransaction().commit();
		 
		 
		 Iterator it = list.iterator();
		 StringBuffer sb = new StringBuffer();
		 while(it.hasNext()){
			 Album alb = (Album) it.next();
			 Timestamp time=alb.getReleaseDate();
			 SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
			 String date=sd.format(time);
			 sb.append(alb.getId() + "," + alb.getName() + "," + alb.getArtist().getArtName() + "," + alb.getCorp().getName() + "," + 
					 date + "," + alb.getDescription() + ";");
		 }
		return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
	return null;	
	}
	
	
	public String SearchMediaById(int id) {
		Album album = new AlbumDao().getAlbumById(id);
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
	
	
	public int getAlbumIdByName(String name){
		Album album = new AlbumDao().getAlbumByName(name);
		return album.getId();
	}
	
	
	
	
	public String getAlbumNameById(int id) {
		Album album = new AlbumDao().getAlbumById(id);
		StringBuffer sb = new StringBuffer();
		sb.append(album.getName() + "," + album.getPath());
		return sb.toString();
	}
	
	public String getAlbumArtById(int id) {
		Album album = new AlbumDao().getAlbumById(id);
		int artId = album.getArtist().getId();
		Artist artist = new ArtistDao().getArtistById(artId);
		String artName = artist.getArtName();
		return artName;
	}
	
	public String getAlbumIntroById(int id) {
		Album album = new AlbumDao().getAlbumById(id);		
		return album.getDescription();
	}
	
	public String getAlbumPathById(int id) {
		Album album = new AlbumDao().getAlbumById(id);
		return album.getPath();
	}
}
