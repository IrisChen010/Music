package etc.music.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.Language;
import etc.music.pojo.Media;

public class AlbumDao {
	public int getAlbumNum()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			 Query query=session.createQuery("from Album");
			 List list=query.list();
			 session.getTransaction().commit();
			 return list.size();
		}  catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
	return -1;	
	}
	public List<Album> getAlbums()
	{ 
		Session session=HibernateSessionFactory.getSession();
		try {
		 session.beginTransaction();
		 Query query=session.createQuery("from Album");
		 List list=query.list();
		 session.getTransaction().commit();
		return list;	
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
	public List<Album> getChoosedPageAlbums(int currentPage,int pageSize)
	{
		Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("select a from Album a order by a.id");
			query.setFirstResult((currentPage - 1) * pageSize);
			query.setMaxResults(pageSize);
              List list=query.list();
              Iterator it = list.iterator();
         	 
         	 while(it.hasNext()) {
         		 Album album = (Album) it.next();
         		 Artist artist = new ArtistDao().getArtistById(album.getArtist().getId());
       		 Language language=new LanguageDao().getLanguageById(album.getLanguage().getId());
         		 album.setArtist(artist);
            	 album.setLanguage(language);

         	 }
			return list;
	}
	//获取热门专辑
	public List<Album> getHottestAlbums()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album order by album.clicked desc");
			query.setFirstResult(0);
			query.setMaxResults(7);
			List list=query.list();
			session.getTransaction().commit();
			return list;
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
	public Album getAlbumByMedia(Media m)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album where ? in medias");
			query.setParameter(0, m);
			Album album=(Album) query.uniqueResult();
			session.getTransaction().commit();
			return album;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return null;
	}
	public void saveAlbum(Album album)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(album);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
	
	
	}
	public List<Album> getAlbumsByName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album where name=?");
			query.setString(0, name);
			List list=query.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
		return null;
	}
	public Album getAlbumByName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album where name=?");
			query.setString(0, name);
			Album album=(Album) query.uniqueResult();
			session.getTransaction().commit();
			return album;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
		return null;
	}
	public List<Album> getAlbumsByNameChar(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album where name like ?");
			query.setString(0,"%"+name+"%" );
			List<Album> album=query.list();
			session.getTransaction().commit();
			return album;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
		return null;
	}
	public List<Album> getAlbumByArtist(Artist artist)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Album where artist=?");
			query.setParameter(0, artist);
			List list=query.list();
			
			session.getTransaction().commit();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{HibernateSessionFactory.closeSession(session);}
		return null;
	}
	public List<Album> getAlbumsByArtistId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Artist artist=(Artist) session.get(Artist.class, id);
			Query query=session.createQuery("from Album where artist=?");
			query.setParameter(0, artist);
			List list=query.list();
			session.getTransaction().commit();
			return list;
			
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
	public List<Album> getAlbumsByArtistName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try{
			session.beginTransaction();
			Artist artist=new ArtistDao().getArtistByName(name);
			Query query=session.createQuery("from Album where artist=?");
			query.setParameter(0, artist);
			List list=query.list();
			
			
			session.getTransaction().commit();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
		
		return null;

	
			
	}
	public List<Album> getAlbumsByArtistNameChar(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		List<Artist> artists=new ArtistDao().getArtistByNameChar(name);
		List albums=new ArrayList();
		while(artists.iterator().hasNext())
		{
			Artist art=artists.iterator().next();
			if(art!=null)
			{
			Query query=session.createQuery("from Album where artist=?");
			query.setParameter(0, artists.iterator().next());
			List list=query.list();
			albums.add(list);
			}
			else break;
		}
		
		
		return albums;
	}
	public Album getAlbumById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Album album=(Album) session.get(Album.class, id);
			session.getTransaction().commit();
			return album;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
			
		}
		return null;
	}
	public Artist getArtistByAlbumId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Album album=(Album) session.get(Album.class, id);
		Artist artist =	album.getArtist();
			session.getTransaction().commit();
			return artist;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
			
		return null;
	}
	
	
	

}
