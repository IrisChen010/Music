package etc.music.dao;

import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Genre;

public class GenreDao {
	public Genre getGenreById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Genre g=(Genre) session.get(Genre.class, id);
			session.getTransaction().commit();
			return g;
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
