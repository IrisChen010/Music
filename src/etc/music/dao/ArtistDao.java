package etc.music.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Artist;

public class ArtistDao {

	public List<Artist> getArtistsByFirstChar(String firstChar)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Artist where firstChar=?");
			query.setString(0, firstChar);
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
	public List<Artist> getArtistByNameChar(String artName)
	{
		Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Artist where artName like ?");
			query.setString(0, "%"+artName+"%");
			List<Artist> artist=query.list();
		
			return artist;
		
	}
	public Artist getArtistByName(String artName)
	{
		Session session=HibernateSessionFactory.getSession();
	
		
			Query query=session.createQuery("from Artist where artName=?");
			query.setString(0,artName);
			Artist artist=(Artist) query.uniqueResult();
		
			return artist;
		
	}
	
	public Artist getArtistById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Artist artist=(Artist) session.get(Artist.class, id);
			session.getTransaction().commit();
			return artist;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}finally{
			HibernateSessionFactory.closeSession(session);
		}
		return null;
	}
	public void saveArtist(Artist artist)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(artist);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		
	}
	public List<Artist> getArtists()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Artist");
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
	
}
