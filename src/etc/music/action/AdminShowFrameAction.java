package etc.music.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import etc.music.dao.AdminDao;
import etc.music.pojo.Admin;

public class AdminShowFrameAction {
	public String showFrame() {
		String sort = ServletActionContext.getRequest().getParameter("sort");
		ActionContext.getContext().getSession().put("sort", sort);
		return "showResult";
	}
}
