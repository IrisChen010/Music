package etc.music.dao.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import etc.music.dao.android.IShopCartDao;
import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.ShopCart;
import etc.music.pojo.UserInfo;

public class ShopCartDaoImpl implements IShopCartDao {
    
    public String getData(int userId){
    	Set lstData = new HashSet();
    	
    	Session session = HibernateSessionFactory.getSession();
    	session.beginTransaction();
    	UserInfo user = (UserInfo) session.get(UserInfo.class, userId);
    	session.getTransaction().commit();
    	Set<ShopCart> shopcarts = user.getShopCarts();
    	Iterator it = shopcarts.iterator();
    	StringBuffer sf = new StringBuffer();
    	
    	while (it.hasNext()) {
    		ShopCart sc = (ShopCart) it.next();
    		sf.append(sc.getAlbum().getName() + "," + sc.getAlbum().getPrice() + "," + sc.getNumber() + "," + sc.getAlbum().getPath() + "," + sc.getAlbum().getId() + ";");
    	}
    	
    	String sc = sf.toString();
    	
    	return sc;
    }

}
