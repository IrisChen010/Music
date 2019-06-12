package etc.music.pojo;

/**
 * Favourite entity. @author MyEclipse Persistence Tools
 */

public class Favourite implements java.io.Serializable {

	// Fields

	private Integer id;
	private Album album;
	private UserInfo userInfo;

	// Constructors

	/** default constructor */
	public Favourite() {
	}

	/** full constructor */
	public Favourite(Album album, UserInfo userInfo) {
		this.album = album;
		this.userInfo = userInfo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Album getAlbum() {
		return this.album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}