package etc.music.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Hobby;
import etc.music.pojo.UserInfo;

public class HobbyDao {
	public Hobby getHobbyById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Hobby hobby=(Hobby) session.get(Hobby.class, id);
			session.getTransaction().commit();
			return hobby;
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
	public List<Hobby> getHobbiesByUserId(int id)
	{
	Session session=HibernateSessionFactory.getSession();
	try {
		session.beginTransaction();
		UserInfo user=(UserInfo) session.get(UserInfo.class, id);
		Query query=session.createQuery("from Hobby where userInfo=?");
		query.setParameter(0, user);
		List<Hobby> list=query.list();
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
	
	

}
