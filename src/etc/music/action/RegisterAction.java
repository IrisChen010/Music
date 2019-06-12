package etc.music.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.UserContactDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.UserContact;
import etc.music.pojo.UserInfo;

public class RegisterAction extends ActionSupport implements ModelDriven<UserInfo> {

	private UserInfo user=new UserInfo();
    private UserContact userContact=new UserContact();
	private File upload;
	 private String uploadFileName;
    public UserInfo getModel() {
		// TODO Auto-generated method stub
		return user;
	}
    
    public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public String addUser() throws Exception
	{
		
		UserInfoDao userDao=new UserInfoDao();
		boolean flag=userDao.checkUserName(user.getNickName());
		HttpServletRequest request=ServletActionContext.getRequest();
		if(!flag)
		{
			request.setAttribute("check", true);
			if(uploadFileName!=null){
			System.out.println(uploadFileName);
			String serverRealPath = ServletActionContext.getServletContext().getRealPath("/upload") + "\\" + uploadFileName;
			File imageFile = new File(serverRealPath);
//			String dateBasepath = ServletActionContext.getRequest().getContextPath() + "/upload/" + uploadFileName;
			String dateBasepath = "" + "upload/" + uploadFileName;
			
			FileUtils.copyFile(upload, imageFile);
			user.setPath(dateBasepath);
			}
			else user.setPath(null);
			request.setAttribute("user", user);
			userDao.saveUser(user);
			String mail=request.getParameter("email");
			sendEmail(mail);
			String phone=request.getParameter("phone");
			String address=request.getParameter("address");
			String postNum=request.getParameter("postNum");
			userContact.setAddress(address);
			userContact.setPhone(phone);
			userContact.setPostNum(postNum);
			userContact.setUserInfo(user);
			new UserContactDao().saveUserContact(userContact);
			return "registerOK";
		}
		else
		{
			request.setAttribute("check", false);
			return "register";
		}
		
	}
	
	
	public String sendEmail( String mail)
	
	{
		
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		
		Email smail = new SimpleEmail();
		
		smail.setCharset("utf-8");
		//设置pop/smtp协议服务器 
		smail.setHostName("smtp.qq.com"); 
		 //设置发送账户  name , pwd
		smail.setAuthentication("396367738@qq.com", "167003T");  
	
		//////////  发送设置
		try {
			
			smail.setFrom("396367738@qq.com");  //发送地址。
			
			smail.addTo(mail);  //设置收件人。

			//mail.addBcc("ajaxjm@yahoo.cn"); 
			
			//邮件的 题目
			smail.setSubject("欢迎您注册Music++网站");   
			
			smail.setMsg("欢迎您注册Music++网站，如果是您本人注册，请点击以下链接去往主页，http://localhost:8080/Music/jsp/homepage.jsp ,如果不是您本人，请忽略本邮件。");   //邮件的内容。
			
			smail.send();  //发送
		
		
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

		





		
		
		
		
	}
	




	
