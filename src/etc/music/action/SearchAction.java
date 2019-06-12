package etc.music.action;

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
import etc.music.dao.LanguageDao;
import etc.music.dao.MediaDao;
import etc.music.pojo.Album;
import etc.music.pojo.Artist;
import etc.music.pojo.Language;
import etc.music.pojo.Media;

public class SearchAction extends ActionSupport implements ModelDriven<Album> {

	private Album album=new Album();
	public Album getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public String showAlbumsBySearch()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		int choice=Integer.parseInt(request.getParameter("choice"));
		String keyWord=request.getParameter("search");
		ActionContext context=ActionContext.getContext();
	//	 System.out.println("select控件的值"+choice); 
		//根据专辑搜索
		 if(choice==1)
		 {
			List<Album> albums=new AlbumDao().getAlbumsByNameChar(keyWord);
			Iterator it = albums.iterator();
			while(it.hasNext()) {
				Album album = (Album) it.next();
				int artId = album.getArtist().getId();
			    int langId = album.getLanguage().getId();
			    Artist artist = new ArtistDao().getArtistById(artId);
			    Language lang = new LanguageDao().getLanguageById(langId);
			    album.setArtist(artist);
			    album.setLanguage(lang);
			}
			context.getSession().put("albums", albums);
		 }
		 //根据歌曲搜索
		 else if(choice==2)
		 {
			 List<Media> media=new MediaDao().getMediaByMediaTitle(keyWord);
		//	 System.out.println(media.size());
			 List<Album> albums=new ArrayList();
			 Iterator it = media.iterator();
			 for(int i=0;i<media.size();i++)
			 {
			    Media m= (Media) it.next();
			    Album album=new AlbumDao().getAlbumById(m.getAlbum().getId());
			    int artId = album.getArtist().getId();
			    int langId = album.getLanguage().getId();
			    Artist artist = new ArtistDao().getArtistById(artId);
			    Language lang = new LanguageDao().getLanguageById(langId);
			    album.setArtist(artist);
			    album.setLanguage(lang);
			    
			    boolean flag=true;
			    Iterator itt = albums.iterator();
			    for(int i1=0;i1<albums.size();)
			    {
			    	if(album.getId()== ( (Album) itt.next()).getId())
			    	{flag=false; break;}
			    	else i1++;
			    	
			    }
			   
			    if(flag==true)
			      albums.add(album);
			 }
			context.getSession().put("albums", albums);
		 }
		 //根据艺术家搜索
		 else if(choice==3)
		 {
			List<Album> albums=new AlbumDao().getAlbumsByArtistName(keyWord);
			Iterator it = albums.iterator();
			while(it.hasNext()) {
				Album album = (Album) it.next();
				int artId = album.getArtist().getId();
			    int langId = album.getLanguage().getId();
			    Artist artist = new ArtistDao().getArtistById(artId);
			    Language lang = new LanguageDao().getLanguageById(langId);
			    album.setArtist(artist);
			    album.setLanguage(lang);
			}
			context.getSession().put("albums", albums);
		 }

		 
		return "search";
	}
  

}