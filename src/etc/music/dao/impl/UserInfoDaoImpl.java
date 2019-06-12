package etc.music.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.dao.android.IUserInfoDao;
import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.UserInfo;

public class UserInfoDaoImpl implements IUserInfoDao {

	public boolean checkNickName(String nickName,String password)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo where nickName=? and pwd=?");
			query.setString(0, nickName);
			query.setString(1, password);
			UserInfo user=(UserInfo) query.uniqueResult();
			session.getTransaction().commit();
			if(user!=null) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		return false;
	}
	
	
	public int getUserId(String nickName,String password)
	{
		Session session=HibernateSessionFactory.getSession();

		session.beginTransaction();
		Query query=session.createQuery("from UserInfo where nickName=? and pwd=?");
		query.setString(0, nickName);
		query.setString(1, password);
		UserInfo user=(UserInfo) query.uniqueResult();
		int userId = user.getId();
		session.getTransaction().commit();
		return userId;
	}
}
