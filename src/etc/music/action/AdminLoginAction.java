package etc.music.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.AdminLoginDao;
import etc.music.pojo.Admin;



public class AdminLoginAction extends ActionSupport implements ModelDriven<Admin>{

	Admin admin=new Admin();

	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}
	
	public String login()
	{
		AdminLoginDao dao = new AdminLoginDao();
		Admin admin_log = dao.checkAdmin(admin.getName(), admin.getPwd());
		ActionContext context = ActionContext.getContext();
		context.getSession().put("admin", admin_log);
		
		if (admin_log != null)
			return "adminLoginOK";
		else
			return "adminLogin";
	}

}
