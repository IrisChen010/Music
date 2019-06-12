package etc.music.dao.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import etc.music.dao.android.IFavouriteDao;
import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Album;
import etc.music.pojo.Favourite;
import etc.music.pojo.UserInfo;

public class FavouriteDaoImpl implements IFavouriteDao {

	
    public String getFavouriteData(int userId){
    	
    	Session session = HibernateSessionFactory.getSession();
    	session.beginTransaction();
    	UserInfo user = (UserInfo) session.get(UserInfo.class, userId);
    	session.getTransaction().commit();
    	Set<Favourite> favourites = user.getFavourites();
    	Iterator it = favourites.iterator();
    	StringBuffer sf = new StringBuffer();
    	
    	while (it.hasNext()) {
    		Favourite sc = (Favourite) it.next();
    		Album alb = sc.getAlbum();
			Timestamp time = alb.getReleaseDate();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String date=sd.format(time);
			sf.append(alb.getId() + "," + alb.getName() + "," + alb.getArtist().getArtName() + "," + 
					alb.getCorp().getName() + "," + date + ";");
    	}
    	
    	String sc = sf.toString();
    	
    	return sc;
    }
}
