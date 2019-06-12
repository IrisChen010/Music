package etc.music.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.Genre;
import etc.music.pojo.Media;

public class MediaDao {
	public void saveMedias(Media media)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(media);
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
	public List<Media> getMedias()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Media");
			List list=query.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		return null;
		
	}
	public List<Media> getMediasByAlbumName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Album album=new AlbumDao().getAlbumByName(name);
			Query query=session.createQuery("from Media where album=?");
			 query.setParameter(0, album);
			 List<Media> list=query.list();			
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
	public List<Media> getMidiasByAlbumId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Album album=(Album) session.get(Album.class,id);
			Query query=session.createQuery("from Media where album=?");
			query.setParameter(0, album);
			List<Media> list=query.list();
			session.getTransaction().commit();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		
		return null;
	}
	public Media getMediaById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Media media=(Media) session.get(Media.class, id);
			session.getTransaction().commit();
			return media;
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
	public List<Media> getMediaByMediaTitle(String title)
	{
		
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Media where title like ?");
			query.setString(0, "%"+title+"%");
			List<Media> media=query.list();
			session.getTransaction().commit();
			return media;
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
	public List<Media> getMediaByGenreId(int id)
	{

		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Genre genre=(Genre) session.get(Genre.class, id);
			Query query=session.createQuery("from Media where  genre=?");
			query.setParameter(0, genre);
			List<Media> media=query.list();
			session.getTransaction().commit();
			return media;
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

	

}
