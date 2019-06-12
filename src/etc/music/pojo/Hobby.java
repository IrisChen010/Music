package etc.music.pojo;

/**
 * Hobby entity. @author MyEclipse Persistence Tools
 */

public class Hobby implements java.io.Serializable {

	// Fields

	private Integer id;
	private Genre genre;
	private Language language;
	private UserInfo userInfo;
	private Integer artId;

	// Constructors

	/** default constructor */
	public Hobby() {
	}

	/** full constructor */
	public Hobby(Genre genre, Language language, UserInfo userInfo,
			Integer artId) {
		this.genre = genre;
		this.language = language;
		this.userInfo = userInfo;
		this.artId = artId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getArtId() {
		return this.artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

}