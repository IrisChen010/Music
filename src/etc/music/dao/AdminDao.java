package etc.music.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Admin;

public class AdminDao {
	public void saveAdmin(Admin admin)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(admin);
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
	public Admin getAdminById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Admin admin=(Admin) session.get(Admin.class, id);
			session.getTransaction().commit();
			return admin;
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
	public boolean checkAdmin(String name,String pwd)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Admin where name=? and pwd=?");
			query.setString(0, name);
			query.setString(1, pwd);
			Admin admin=(Admin) query.uniqueResult();
			session.getTransaction().commit();
			if(admin==null) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
		return false;
	}
	public boolean checkAdminName(String name)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Admin where name=?");
			query.setString(0, name);
			Admin admin=(Admin) query.uniqueResult();
			session.getTransaction().commit();
			if(admin==null)
				return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
		return true;
	}
	public List<Admin> getAdmins()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
		Query query=session.createQuery("from Admin");
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
	public void modifyAdmin(Admin admin)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Admin old=(Admin) session.get(Admin.class,admin.getId());
			old.setEmail(admin.getEmail());
			old.setName(admin.getName());
			old.setPwd(admin.getPwd());
			session.save(old);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
	         HibernateSessionFactory.closeSession(session);
		}
	}
	
	public void deleteAdmin(Admin admin) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.delete(admin);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally{
	         HibernateSessionFactory.closeSession(session);
		}
	}
	
	public void deleteAdminById(int id) {
		Session session = HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery("delete from Admin where id=?");
			query.setInteger(0, id);
			query.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateSessionFactory.closeSession(session);
		}
	}
	
}
