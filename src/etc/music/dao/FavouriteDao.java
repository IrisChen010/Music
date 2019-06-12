package etc.music.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.Favourite;
import etc.music.pojo.ShopCart;
import etc.music.pojo.UserInfo;

public class FavouriteDao {

	public void saveFavourite(Favourite fav)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(fav);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally
		{
			HibernateSessionFactory.closeSession(session);
		}
		
	}
	public Favourite getFavouriteById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Favourite fav=(Favourite) session.get(Favourite.class, id);
			session.getTransaction().commit();
			return fav;
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
	public List<Favourite> getFavourites()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Favourite");
			List favs=query.list();
			session.getTransaction().commit();
			return favs;
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
	
	public void deleteFav(Favourite fav) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.delete(fav);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally
		{
			HibernateSessionFactory.closeSession(session);
		}
	}
	
	public boolean checkSameFav(UserInfo user, Album album) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			String hql = "from Favourite where userInfo=? and album=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, user);
			query.setParameter(1, album);
			Favourite fav = (Favourite) query.uniqueResult();
			session.getTransaction().commit();
			if(fav == null) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateSessionFactory.closeSession(session);
		}
		return true;
	}
	
}
