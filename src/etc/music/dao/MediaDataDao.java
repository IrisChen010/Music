package etc.music.dao;

import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.MediaData;

public class MediaDataDao {
    public void saveMediaData(MediaData mediaData)
   {
    	Session session=HibernateSessionFactory.getSession();
    	try {
    		session.beginTransaction();
    		session.save(mediaData);
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
    public MediaData getMediaDateById(int id)
    {
    	Session session=HibernateSessionFactory.getSession();
    	try {
    		session.beginTransaction();
    		MediaData mediaData=(MediaData) session.get(MediaData.class, id);
    		session.getTransaction().commit();
			return mediaData;
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
