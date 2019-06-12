package etc.music.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import etc.music.dao.AlbumDao;
import etc.music.dao.ArtistDao;
import etc.music.dao.CorpDao;
import etc.music.dao.LanguageDao;
import etc.music.dao.MediaDao;
import etc.music.dao.PageBeanDao;
import etc.music.dao.UserInfoDao;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.Corp;
import etc.music.pojo.Language;
import etc.music.pojo.Media;
import etc.music.pojo.UserInfo;
import etc.music.util.PageBean;

public class  ShowAlbumAction  extends ActionSupport implements ModelDriven<Album> 

	{
	private Album album=new Album();
	private Media media=new Media();
	private static int userId;
	public Album getModel() {
		return album;
		}
		
		
      public String getAlbum()
      {
    	  HttpServletRequest request=ServletActionContext.getRequest();
    	  int id=Integer.parseInt(request.getParameter("albId"));
    	  String userIdStr = request.getParameter("userId");
    	  if(userIdStr != "" && userIdStr != null) {
    		  int userId = Integer.parseInt(userIdStr);
    		  UserInfo user = new UserInfoDao().getUserById(userId);
    		  ActionContext.getContext().getSession().put("user", user);
    	  }
    	  Album album=new AlbumDao().getAlbumById(id);
    	  Artist artist=new ArtistDao().getArtistById(album.getArtist().getId());
    	  Corp corp=new CorpDao().getCorpById(album.getCorp().getId());
    	  Language language=new LanguageDao().getLanguageById(album.getLanguage().getId());
    	  List<Media> medias=new MediaDao().getMidiasByAlbumId(album.getId());
    	  album.setArtist(artist);
    	 album.setLanguage(language);
    	  album.setCorp(corp);
    	  Timestamp ts = album.getReleaseDate();
    	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	  String date = sdf.format(ts);
    	  ActionContext ac=ActionContext.getContext();
    	  ac.getSession().put("album", album);
    	  ac.getSession().put("medias", medias);
    	  ac.getSession().put("releaseDate", date);
    	  return "showAlbum";
      }
      public String getAllAlbums()
      {
    	  //获得专辑列表
    	 List<Album> albums = new AlbumDao().getAlbums();
    	 HttpServletRequest request=ServletActionContext.getRequest();
    	 String userIdStr = request.getParameter("userId");
    	 if(userIdStr != "" && userIdStr != null) {
    		 int userId = Integer.parseInt(request.getParameter("userId"));
    		 UserInfo user = new UserInfoDao().getUserById(userId);
    		 ActionContext.getContext().getSession().put("user", user);
    	 }
      
    	 Iterator it = albums.iterator();
    	 
    	 while(it.hasNext()) {
    		 Album album = (Album) it.next();
    		 Artist artist = new ArtistDao().getArtistById(album.getArtist().getId());
//    		 Corp corp=new CorpDao().getCorpById(album.getCorp().getId());
   //		 Language language=new LanguageDao().getLanguageById(album.getLanguage().getId());
    		 album.setArtist(artist);
    //		 album.setLanguage(language);
//    		 album.setCorp(corp);
    	 }
    	 ActionContext context= ActionContext.getContext();
    	 context.getSession().put("albums", albums);

    	 return "showAll";
    	  
      }
      public String getAllAlbumsUsePages()
      {
    	 HttpServletRequest request=ServletActionContext.getRequest();
    	 String userIdStr = request.getParameter("userId");
    	 if(userIdStr != "" && userIdStr != null) {
    		 userId = Integer.parseInt(request.getParameter("userId"));
    		 UserInfo user = new UserInfoDao().getUserById(userId);
    		 ActionContext.getContext().getSession().put("user", user);
    	 } else {
    		 UserInfo user = new UserInfoDao().getUserById(userId);
    		 ActionContext.getContext().getSession().put("user", user);
    	 }
      int currentPage=1;
      int pageSize=10;
      if(request.getParameter("pageCode")!=null)
      {
    	  currentPage=Integer.parseInt(request.getParameter("pageCode").toString());
      }
//       if(request.getParameter("pageSize")!=null)
//       {
//    	   pageSize=Integer.parseInt(request.getParameter("pageSize").toString());
//       }
      PageBean pageBean = new PageBeanDao().findByPage(currentPage, pageSize);
    	 ActionContext context= ActionContext.getContext();
//    	 System.out.println("当前页："+currentPage);
//    	 System.out.println("总的行数："+pageBean.getTotalRows());
    	 context.getSession().put("pageBean", pageBean);

    	 return "showAll";
    	  
      }
      public String getAlbumsByGenre()
      {
    	  HttpServletRequest request=ServletActionContext.getRequest();
    	 int id=Integer.parseInt( request.getParameter("genreId"));
    	   List list=new MediaDao().getMediaByGenreId(id);
    	   List<Album> albums=new ArrayList();
    	   Iterator it=list.iterator();
    	   while(it.hasNext())
    	   {
    		   Media media=(Media) it.next();
    		Album album=new AlbumDao().getAlbumByMedia(media);
    		albums.add(album);
    	  
    	   }
    	   ActionContext context= ActionContext.getContext();
    	   context.getSession().put("albums", albums);
    	   return "";
    	 
      }
      
      public String getArtistAlbums() {
    	  int artId = Integer.parseInt(ServletActionContext.getRequest().getParameter("artId"));
    	  List<Album> albums = new AlbumDao().getAlbumsByArtistId(artId);
    	  Iterator it = albums.iterator();
    	  while(it.hasNext()) {
    		  Album album = (Album) it.next();
		    int langId = album.getLanguage().getId();
		    Artist artist = new ArtistDao().getArtistById(artId);
		    Language lang = new LanguageDao().getLanguageById(langId);
		    album.setArtist(artist);
		    album.setLanguage(lang);
    	  }
    	  ActionContext.getContext().getSession().put("albums", albums);
    	  return "showArtistAlbums";
      }
}
