package etc.music.dao;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.ShopCart;
import etc.music.pojo.ShopHistory;
import etc.music.pojo.UserInfo;

public class ShopCartDao {
	
	public List<ShopCart> getShopCarts() {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery("from ShopCart");
			List list = query.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateSessionFactory.closeSession(session);
		}
		return null;
	}

	
	//µÃµ½shopCart
	public ShopCart getShopCartById(int id){
		
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			ShopCart shopcart = (ShopCart) session.get(ShopCart.class, id);
			session.getTransaction().commit();
			return shopcart;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally {
			HibernateSessionFactory.closeSession(session);
		}
		return null;		
	}
	
	
	//É¾³ýshopCart
	public void deleteShopCartById(int id){
		
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			ShopCart shopcart = (ShopCart) session.get(ShopCart.class, id);
			session.delete(shopcart);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally {
			HibernateSessionFactory.closeSession(session);
		}
		
	}
	
	
	public void reduceNumById(int id) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			String hql = "update ShopCart sc set sc.number = sc.number-1 where sc.id=?";
			Query query = session.createQuery(hql);
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
	
	public void addNumById(int id) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			String hql = "update ShopCart sc set sc.number = sc.number+1 where sc.id=?";
			Query query = session.createQuery(hql);
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
	
	public void changeNumById(int id, int num) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			String hql = "update ShopCart sc set sc.number=? where sc.id=?";
			Query query = session.createQuery(hql);
			query.setInteger(0, num);
			query.setInteger(1, id);
			query.executeUpdate();
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateSessionFactory.closeSession(session);
		}
	}
	public void deleteShopCartsByUserId(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			UserInfo user=(UserInfo) session.get(UserInfo.class, id);
			Query query=session.createQuery("from ShopCart where userInfo=?");
			query.setParameter(0, user);
			List<ShopCart> list=query.list();
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				ShopCart shopCart = (ShopCart) it.next();
				ShopHistory shopHistory=new ShopHistory();
				shopHistory.setAlbum(shopCart.getAlbum());
				shopHistory.setNumber(shopCart.getNumber());
				shopHistory.setStatus(0);
				Timestamp time=new Timestamp(System.currentTimeMillis());
				shopHistory.setTradeBegin(time);
				shopHistory.setUserInfo(shopCart.getUserInfo());
				session.save(shopHistory);
				int scId = shopCart.getId();
				ShopCart shopcart = (ShopCart) session.get(ShopCart.class, scId);
				session.delete(shopcart);
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public void saveShopCart(ShopCart sc)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(sc);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public boolean checkSameShopCart(UserInfo user, Album album) {
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			String hql = "from ShopCart where userInfo=? and album=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, user);
			query.setParameter(1, album);
			ShopCart shopCart = (ShopCart) query.uniqueResult();
			session.getTransaction().commit();
			if(shopCart == null) {
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
