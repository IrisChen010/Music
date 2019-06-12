package etc.music.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.UserInfoDao;
import etc.music.pojo.UserInfo;

public class LoginAction extends ActionSupport implements ModelDriven<UserInfo> {
	private UserInfo user = new UserInfo();
	private String checkCode;
	
	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	
	public UserInfo getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public String loginNoCookie() {
		String nickName = user.getNickName();
		String pwd = user.getPwd();

		String[] auto = ServletActionContext.getRequest().getParameterValues("auto");
		HttpSession session = ServletActionContext.getRequest().getSession();
		String rand = (String)session.getAttribute("rand");
		String a = (String)session.getAttribute("a");
		//String rand = (String) ActionContext.getContext().getSession().get("rand");
		
		if(auto != null) {
			//创建一个cookie    
			Cookie cookie = new Cookie("user_cookie", nickName +"," +pwd);
			ServletActionContext.getResponse().addCookie(cookie);
			return login(nickName, pwd);
		} else {
			return login(nickName, pwd);
		}
	}

	public String login(String nickName, String pwd) {
		UserInfoDao userDao = new UserInfoDao();
		UserInfo user_log = userDao.checkUser(nickName, pwd);

		ActionContext context = ActionContext.getContext();
		String rand = (String) context.getSession().get("rand");
		context.getSession().put("user", user_log);
		
		if(user_log != null) {
			return "loginOK";
		} else {
			return "login";
		}
	}
	
	public String loginByCookie() {
		Cookie[] cookies = ServletActionContext.getRequest().getCookies();
		if(cookies == null)
			return "login";
		
		String nickName = null;
		String pwd = null;
		
		for (Cookie cookie : cookies) {
			if("user_cookie".equals(cookie.getName())) {
				String[] user = cookie.getValue().split(",");
				nickName = user[0];
				pwd = user[1];
				break;
			}
		}
	
		if(nickName != null && pwd != null)
			return login(nickName, pwd);
		return "login";
	}
	
	public String logout() {
		ActionContext.getContext().getSession().clear();
		return "logout";
	}
	
	public String backToHome() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		ActionContext.getContext().getSession().put("user", user);
		return "backToHome";
	}
	
	public String about() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		ActionContext.getContext().getSession().put("user", user);
		return "about";
	}
	
	public String gallery() {
		int userId = Integer.parseInt(ServletActionContext.getRequest().getParameter("userId"));
		UserInfo user = new UserInfoDao().getUserById(userId);
		ActionContext.getContext().getSession().put("user", user);
		return "gallery";
	}
}
