package etc.music.action;

import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.AdminDao;
import etc.music.dao.AlbumDao;
import etc.music.dao.ArtistDao;
import etc.music.dao.ShopCartDao;
import etc.music.dao.UserContactDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.Admin;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.ShopCart;
import etc.music.pojo.UserInfo;

public class AdminManipulationAction extends ActionSupport implements
		ModelDriven<Admin> {
	private Admin admin = new Admin();

	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}
	
	public String addAdmin() {
		new AdminDao().saveAdmin(admin);
		ActionContext.getContext().getSession().put("choice", "addAdmin");
		List<Admin> admins = new AdminDao().getAdmins();
		ActionContext.getContext().getSession().put("admins", admins);
		return showAdmin();
	}
	
	public String showDeleteAdmin() {
		List<Admin> admins = new AdminDao().getAdmins();
		ActionContext.getContext().getSession().put("admins", admins);
		return "deleteAdmin";
	}
	
	public String deleteAdminById() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("adminId"));
		new AdminDao().deleteAdminById(id);
		List<Admin> admins = new AdminDao().getAdmins();
		ActionContext.getContext().getSession().put("admins", admins);
		return "deleteAdmin";
	}
	
	public String showAdmin() {
		List<Admin> admins = new AdminDao().getAdmins();
		ActionContext.getContext().getSession().put("admins", admins);
		return "showAdmin";
	}
	
	public String showUser() {
		List<UserInfo> users = new UserInfoDao().getUsers();
		ActionContext.getContext().getSession().put("users", users);
		return "showUser";
	}
	
	public String showDeleteUser() {
		List<UserInfo> users = new UserInfoDao().getUsers();
		ActionContext.getContext().getSession().put("users", users);
		return "deleteUser";
	}
	
	public String deleteUserById() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		new UserContactDao().deleteUserContactByUserId(id);
		new UserInfoDao().removeUserById(id);
		List<UserInfo> users = new UserInfoDao().getUsers();
		ActionContext.getContext().getSession().put("users", users); 
		return "deleteUser";
	}
	
	public String addAlbum() {
		return "showAlbum";
	}
	
	public String showOrder() {
		List<ShopCart> shopCarts = new ShopCartDao().getShopCarts();
		
		Iterator it = shopCarts.iterator();
		while(it.hasNext()) {
			ShopCart shopCart = (ShopCart) it.next();
			int albumId = shopCart.getAlbum().getId();
			int userId = shopCart.getUserInfo().getId();
			Album album = new AlbumDao().getAlbumById(albumId);
			UserInfo user = new UserInfoDao().getUserById(userId);
			shopCart.setAlbum(album);
			shopCart.setUserInfo(user);
		}

		ActionContext.getContext().getSession().put("orders", shopCarts);
		return "showOrder";
	}
	
	public String showDeleteOrder() {
		List<ShopCart> shopCarts = new ShopCartDao().getShopCarts();
		
		Iterator it = shopCarts.iterator();
		while(it.hasNext()) {
			ShopCart shopCart = (ShopCart) it.next();
			int albumId = shopCart.getAlbum().getId();
			int userId = shopCart.getUserInfo().getId();
			Album album = new AlbumDao().getAlbumById(albumId);
			UserInfo user = new UserInfoDao().getUserById(userId);
			shopCart.setAlbum(album);
			shopCart.setUserInfo(user);
		}

		ActionContext.getContext().getSession().put("orders", shopCarts);
		return "deleteOrder";
	}
	
	public String deleteOrderById() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("orderId"));
		new ShopCartDao().deleteShopCartById(id);
		List<ShopCart> shopCarts = new ShopCartDao().getShopCarts();
		
		Iterator it = shopCarts.iterator();
		while(it.hasNext()) {
			ShopCart shopCart = (ShopCart) it.next();
			int albumId = shopCart.getAlbum().getId();
			int userId = shopCart.getUserInfo().getId();
			Album album = new AlbumDao().getAlbumById(albumId);
			UserInfo user = new UserInfoDao().getUserById(userId);
			shopCart.setAlbum(album);
			shopCart.setUserInfo(user);
		}

		ActionContext.getContext().getSession().put("orders", shopCarts);
		return "deleteOrder";
	}
	
	public String showDeleteAlbum() {
		List<Album> albums = new AlbumDao().getAlbums();
		Iterator it = albums.iterator();
		while(it.hasNext()) {
			Album album = (Album) it.next();
			int artId = album.getArtist().getId();
			Artist artist = new ArtistDao().getArtistById(artId);
			album.setArtist(artist);
		}
		ActionContext.getContext().getSession().put("albums", albums);
		return "deleteAlbum";
	}
	
	public String deleteAlbum() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("albId"));
		Album album = new AlbumDao().getAlbumById(id);
		
//		ActionContext.getContext().getSession().put("album", value);
		return "deleteAlbum";
	}

}
