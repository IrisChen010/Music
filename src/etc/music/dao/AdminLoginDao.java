package etc.music.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Admin;

public class AdminLoginDao {
	 public Admin checkAdmin(String name, String pwd){
		 Session session=HibernateSessionFactory.getSession();
		 try{
			session.beginTransaction();
			Query query = session.createQuery("from Admin where name=? and pwd=?");
			query.setString(0, name);
			query.setString(1, pwd);
			Admin admin = (Admin) query.uniqueResult();
			
			if(admin!=null)
				 return admin;
		 } catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally{
			HibernateSessionFactory.closeSession(session);
		}
		return null;
	}
}
