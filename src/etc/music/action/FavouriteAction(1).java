package etc.music.action;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.AlbumDao;
import etc.music.dao.FavouriteDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.Album;
import etc.music.pojo.Favourite;
import etc.music.pojo.UserInfo;

public class FavouriteAction extends ActionSupport implements
		ModelDriven<Favourite> {
	private Favourite fav = new Favourite();

	public Favourite getModel() {
		// TODO Auto-generated method stub
		return fav;
	}
	
	public String addToFav() {
		int albId = Integer.parseInt(ServletActionContext.getRequest().getParameter("albId"));
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		Album album = new AlbumDao().getAlbumById(albId);
		UserInfo user = new UserInfoDao().getUserById(userId);
		
		boolean flag = new FavouriteDao().checkSameFav(user, album);
		if(flag == true) {
		} else {
			fav.setAlbum(album);
			fav.setUserInfo(user);
			new FavouriteDao().saveFavourite(fav);
		}
		return showFav();
	}
	
	public String showFav() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		
		if(user.getFavourites().size() == 0) {
			return showNullFav();
		} else {
			Set<Favourite> favSet = user.getFavourites();
			Iterator it = favSet.iterator();
			
			while(it.hasNext()) {
				Favourite fav = (Favourite) it.next();
				int albId = fav.getAlbum().getId();
				Album album = new AlbumDao().getAlbumById(albId);
				fav.setAlbum(album);
			}
			user.setFavourites(favSet);
			ActionContext.getContext().getSession().put("user", user);
			
			return "showFav";
		}
	}
	
	public String showNullFav() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		return "nullFav";
	}
	
	public String deleteFav() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		Favourite fav = new FavouriteDao().getFavouriteById(id);
		new FavouriteDao().deleteFav(fav);
		
		return showFav();
	}
}
