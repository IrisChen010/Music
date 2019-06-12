package etc.music.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.ShopHistory;

public class ShopHistoryDao {
	public ShopHistory getShopHistoryById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			ShopHistory sh=(ShopHistory) session.get(ShopHistory.class, id);
			
			session.getTransaction().commit();
			return sh;
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
	public void saveShopHistory(ShopHistory sh)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(sh);
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
	public List<ShopHistory> getShopHistorys()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from ShopHistory");
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

}
