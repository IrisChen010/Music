package etc.music.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.dao.UserInfoDao;
import etc.music.dao.android.IRegisterDao;
import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.UserInfo;

public class RegisterDaoImpl implements IRegisterDao {
	
	public boolean checkName(String nickName)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo where nickName=?");
			query.setString(0, nickName);
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
	
	
	public void addUser(String nickName, String password, String email)
	{
		UserInfo user = new UserInfo();
		user.setNickName(nickName);
		user.setPwd(password);
		user.setEmail(email);
		
		UserInfoDao dao=new UserInfoDao();

		dao.saveUser(user);		
	}

}
