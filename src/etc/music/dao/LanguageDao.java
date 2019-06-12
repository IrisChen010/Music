package etc.music.dao;

import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Language;

public class LanguageDao {

	public Language getLanguageById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Language language=(Language)session.get(Language.class, id);
			
			session.getTransaction().commit();
			return language;
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
