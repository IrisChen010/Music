package etc.music.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.UserInfo;

public class UserInfoDao {
	public void saveUser(UserInfo user)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			HibernateSessionFactory.closeSession(session);
		}
		
	}
	public List<UserInfo> getUsers()
	{
  		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo");
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
	public UserInfo checkUser(String nickName,String pwd)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo where nickName=? and pwd=?");
			query.setString(0, nickName);
			query.setString(1, pwd);
			UserInfo user=(UserInfo) query.uniqueResult();
			session.getTransaction().commit();
			if(user!=null) return user;
			else return null;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		return null;
	}
	public boolean checkUser(String email,String pwd,boolean flag)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo where email=? and pwd=?");
			query.setString(0, email);
			query.setString(1, pwd);
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
	public UserInfo getUserById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo) session.get(UserInfo.class, id);
			session.getTransaction().commit();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		return null;
	}
	public void modifyUserInfo(UserInfo user)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo old=(UserInfo) session.get(UserInfo.class, user.getId());
			old.setCity(user.getCity());
			old.setEmail(user.getEmail());
			old.setGender(user.getGender());
			old.setLevel(user.getLevel());
			old.setNickName(user.getNickName());
			old.setProvince(user.getProvince());
			old.setPwd(user.getPwd());
			old.setPath(user.getPath());
			old.setRealName(user.getRealName());
			old.setAge(user.getAge());
			old.setBlog(user.getBlog());
			session.save(old);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
	}
	public void removeUserById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo)session.get(UserInfo.class, id);
			session.delete(user);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
	}
	public boolean checkUserName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo where nickName=?");
			query.setString(0, name);
			UserInfo user=(UserInfo) query.uniqueResult();
			session.getTransaction().commit();
			if(user!=null) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return true;
	}
	public int countUsers()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from UserInfo");
			List list=query.list();
			session.getTransaction().commit();
			return list.size();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		finally{
			HibernateSessionFactory.closeSession(session);
		}
		return -1;
	}
	
	

}
