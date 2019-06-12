package etc.music.action;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.AlbumDao;
import etc.music.dao.FavouriteDao;
import etc.music.dao.ShopCartDao;
import etc.music.dao.UserContactDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.Album;
import etc.music.pojo.Favourite;
import etc.music.pojo.ShopCart;
import etc.music.pojo.UserContact;
import etc.music.pojo.UserInfo;

public class ShopCartAction extends ActionSupport implements ModelDriven<ShopCart>{

	private ShopCart shopCart = new ShopCart();

	public ShopCart getModel() {
		// TODO Auto-generated method stub
		return shopCart;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public void reduceNum() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("scId"));
		new ShopCartDao().reduceNumById(id);
//		int num = new ShopCartDao().getShopCartById(id).getNumber();
//		JSONArray array = JSONArray.fromObject(num);
//		String json = array.toString();
//		try {
//			PrintWriter out = ServletActionContext.getResponse().getWriter();
//			out.print(json);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void addNum() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("scId"));
		new ShopCartDao().addNumById(id);
//		int num = new ShopCartDao().getShopCartById(id).getNumber();
//		JSONArray array = JSONArray.fromObject(num);
//		String json = array.toString();
//		try {
//			PrintWriter out = ServletActionContext.getResponse().getWriter();
//			out.print(json);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void changeNum() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("scId"));
		int num = Integer.parseInt(ServletActionContext.getRequest().getParameter("num"));
		new ShopCartDao().changeNumById(id, num);
	}

	
	public String showShopCart() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		
		if (user.getShopCarts().size() == 0) {
			return showNullShopCart();
		} else {
			UserInfo userInfo = new UserInfoDao().getUserById(user.getId());
			Set<ShopCart> scSet = userInfo.getShopCarts();
			double totalPrice = 0;
			
			Iterator it = scSet.iterator();
			while(it.hasNext()) {
				ShopCart shopCart = (ShopCart) it.next();
				int num = shopCart.getNumber();
				int id = shopCart.getAlbum().getId();
				Album album = new AlbumDao().getAlbumById(id);

				double price = album.getPrice();
				totalPrice += price * (double)num;
				shopCart.setAlbum(album);
			}
			userInfo.setShopCarts(scSet);
			
			ActionContext.getContext().getSession().put("totalPrice", totalPrice);
			ActionContext.getContext().getSession().put("user", userInfo);
			return "shopCart";
		}
		
	}
	
	public String showNullShopCart() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		ActionContext.getContext().getSession().put("user", user);
		return "nullShopCart";
	}
	
	
	public String deleteShopCart() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String scStr = request.getParameter("id");

		int scId = Integer.parseInt(scStr);
			
		ShopCartDao dao = new ShopCartDao();
		dao.deleteShopCartById(scId);
				
		return showShopCart();
	}
	
	
	public String deleteAllShopCart() {
		
		ActionContext context = ActionContext.getContext();
		UserInfo user = (UserInfo) context.getSession().get("user");
		
		UserInfo userInfo = new UserInfoDao().getUserById(user.getId());
		Set<ShopCart> scSet = userInfo.getShopCarts();
		Iterator it = scSet.iterator();
		while(it.hasNext()) {
			ShopCart shopCart = (ShopCart) it.next();
			int id = shopCart.getId();
			ShopCartDao dao = new ShopCartDao();
			dao.deleteShopCartById(id);
		}
		userInfo.setShopCarts(scSet);

		return showShopCart();
	}
	
	public String continueShop() {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(id);
		ActionContext.getContext().getSession().put("user", user);
		return "continueShop";
	}

	public String addToShopCart()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		int userId = Integer.parseInt(request.getParameter("userId"));
		int albumId=Integer.parseInt(request.getParameter("albId"));
//		int num=Integer.parseInt(request.getParameter("amount"));
		int num = 1;
		UserInfo user = new UserInfoDao().getUserById(userId);
		Album album = new AlbumDao().getAlbumById(albumId);
		boolean flag = new ShopCartDao().checkSameShopCart(user, album);
		if(flag == true) {
		} else {
			ShopCart shopCart=new ShopCart();
			shopCart.setAlbum(album);
			shopCart.setNumber(num);
			shopCart.setUserInfo(user);
			Timestamp time=new Timestamp(System.currentTimeMillis());
			shopCart.setTradeBegin(time);
			new ShopCartDao().saveShopCart(shopCart);
		}
		
		return showShopCart();
	}
	
	public String showUserOrder()throws Exception
	 {
			HttpServletRequest request = ServletActionContext.getRequest();
			int userId = Integer.parseInt(request.getParameter("userId"));
			UserInfo user = new UserInfoDao().getUserById(userId);
			UserContact uc = new UserContactDao().getUserContactByUserId(userId);		
			Set<ShopCart> scSet = user.getShopCarts();
			double totalPrice = 0;
			
			Iterator it = scSet.iterator();
			while(it.hasNext()) {
				ShopCart shopCart = (ShopCart) it.next();
				int num = shopCart.getNumber();
				int id = shopCart.getAlbum().getId();
				Album album = new AlbumDao().getAlbumById(id);

				double price = album.getPrice();
				totalPrice += price * (double)num;
				shopCart.setAlbum(album);
			}
			user.setShopCarts(scSet);
			
			ActionContext.getContext().getSession().put("totalPrice", totalPrice);
			ActionContext.getContext().getSession().put("user", user);
			ActionContext.getContext().getSession().put("usercontact", uc);
			
			return "showUserOrder";
		}
}
