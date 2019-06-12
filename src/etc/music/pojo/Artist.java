package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Artist entity. @author MyEclipse Persistence Tools
 */

public class Artist implements java.io.Serializable {

	// Fields

	private Integer id;
	private String artName;
	private Integer flag;
	private Integer corpId;
	private String country;
	private String firstChar;
	private String intro;
	private String path;
	private Set artistInfos = new HashSet(0);
	private Set albums = new HashSet(0);

	// Constructors

	/** default constructor */
	public Artist() {
	}

	/** full constructor */
	public Artist(String artName, Integer flag, Integer corpId, String country,
			String firstChar, String intro, String path, Set artistInfos,
			Set albums) {
		this.artName = artName;
		this.flag = flag;
		this.corpId = corpId;
		this.country = country;
		this.firstChar = firstChar;
		this.intro = intro;
		this.path = path;
		this.artistInfos = artistInfos;
		this.albums = albums;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArtName() {
		return this.artName;
	}

	public void setArtName(String artName) {
		this.artName = artName;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getCorpId() {
		return this.corpId;
	}

	public void setCorpId(Integer corpId) {
		this.corpId = corpId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstChar() {
		return this.firstChar;
	}

	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set getArtistInfos() {
		return this.artistInfos;
	}

	public void setArtistInfos(Set artistInfos) {
		this.artistInfos = artistInfos;
	}

	public Set getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set albums) {
		this.albums = albums;
	}

}