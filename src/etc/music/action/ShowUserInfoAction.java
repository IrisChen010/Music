package etc.music.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.ArtistDao;
import etc.music.dao.GenreDao;
import etc.music.dao.HobbyDao;
import etc.music.dao.LanguageDao;
import etc.music.dao.ShopCartDao;
import etc.music.dao.UserContactDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.Artist;
import etc.music.pojo.Genre;
import etc.music.pojo.Hobby;
import etc.music.pojo.Language;
import etc.music.pojo.UserContact;
import etc.music.pojo.UserInfo;



public class ShowUserInfoAction extends ActionSupport implements ModelDriven<UserInfo>{
	private UserInfo user=new UserInfo();
	private Hobby hobby=new Hobby();
   	private File upload;
	 private String uploadFileName;
	 //get model
	public UserInfo getModel() {
		
		return user;
	}
	//get set ����
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

//	public String changeImg() throws Exception {
//
//		// ���浽Tomcat�ľ���·��
//		String serverRealPath = ServletActionContext.getServletContext()
//				.getRealPath("/upload") + "\\" + uploadFileName;
//		File imageFile = new File(serverRealPath);
//		// ���浽���ݿ�����·��
//		String dateBasepath = ServletActionContext.getRequest()
//				.getContextPath() + "/upload/" + uploadFileName;
//		// ���ص��������ˣ� -> apache commons-io.jar
//		FileUtils.copyFile(upload, imageFile);
//		HttpServletRequest request = ServletActionContext.getRequest();
//		int id = Integer.parseInt(request.getParameter("userId"));
//		UserInfo user = new UserInfoDao().getUserById(id);
//		user.setPath(dateBasepath);
//		// ��������ͼƬ���û��滻���浽���ݿ���
//		new UserInfoDao().saveUser(user);
//		return showUser(id);
//	}
	public String showUserInfo()throws Exception
 {
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("userId"));
		UserInfo u = new UserInfoDao().getUserById(id);
		List<UserContact> uc = new UserContactDao().getUserContactsByUserId(id);
		List<Hobby> hobbies = new HobbyDao().getHobbiesByUserId(id);
		List<Artist> artists = new ArrayList<Artist>();
		// while (hobbies.iterator().hasNext()) {
		Hobby hobby;
		Artist artist = new Artist();
		if(hobbies.size()!=0){
		 hobby = hobbies.iterator().next();
		
		Language lan = new LanguageDao().getLanguageById(hobby.getLanguage().getId());
		Genre genre = new GenreDao().getGenreById(hobby.getGenre().getId());
		 artist = new ArtistDao().getArtistById(hobby.getArtId());
		hobby.setGenre(genre);
		hobby.setLanguage(lan);   
		artists.add(artist);
		}
		else {
			hobby=new Hobby();
			artist.setArtName("δ��д");
			Language lan=new Language();
			lan.setName("δ��д");
			Genre genre=new Genre();
			genre.setName("δ��д");
			hobby.setGenre(genre);
			hobby.setLanguage(lan); 
		}
		ActionContext context = ActionContext.getContext();
		context.getSession().put("user", u);
		context.getSession().put("usercontact", uc);
		context.getSession().put("hobby", hobby);
		
		context.getSession().put("art", artist);
		return "userInfo";
	}
	
	public String addHistory() throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("userId"));
		 new ShopCartDao().deleteShopCartsByUserId(id);
		return "suc";
	}
 
}
