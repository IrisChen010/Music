package etc.music.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.UserContact;
import etc.music.pojo.UserInfo;

public class UserContactDao {
	public void saveUserContact(UserContact userContact)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(userContact);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
		
	}
	public UserContact getUserContactById(int id)
	{
       Session session=HibernateSessionFactory.getSession();
       try {
    	   session.beginTransaction();
    	   UserContact userContact=(UserContact) session.get(UserContact.class, id);
    	   session.getTransaction().commit();
		 return userContact;
	} catch (Exception e) {
		e.printStackTrace();
		session.getTransaction().rollback();
	}
	finally{HibernateSessionFactory.closeSession(session);}
	return null;
	}
	public UserInfo getUserInfoById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserContact userContact=(UserContact) session.get(UserContact.class, id);
			session.getTransaction().commit();
			return userContact.getUserInfo();
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
	public List<UserContact> getUserContactsByUserId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo) session.get(UserInfo.class, id);
			Query query=session.createQuery("from UserContact where userInfo=?");
			query.setParameter(0, user);
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
	public UserContact getUserContactByUserId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo) session.get(UserInfo.class, id);
			Query query=session.createQuery("from UserContact where userInfo=?");
			query.setParameter(0, user);
			UserContact user1=(UserContact) query.uniqueResult();
			session.getTransaction().commit();
			return user1;
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
	
	public void deleteUserContactByUserId(int id) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo) session.get(UserInfo.class, id);
			Query query= session.createQuery("delete from UserContact where userInfo = ?");
			query.setParameter(0, user);
			query.executeUpdate();
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
}
