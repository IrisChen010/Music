package etc.music.dao;

import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Corp;

public class CorpDao {
	public Corp getCorpById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			
			Corp corp=(Corp) session.get(Corp.class, id);
			session.getTransaction().commit();
			return corp;
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
