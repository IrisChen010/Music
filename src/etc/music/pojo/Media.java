package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Media entity. @author MyEclipse Persistence Tools
 */

public class Media implements java.io.Serializable {

	// Fields

	private Integer id;
	private Album album;
	private Genre genre;
	private String title;
	private String length;
	private String composer;
	private String lyricist;
	private Set mediaDatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Media() {
	}

	/** full constructor */
	public Media(Album album, Genre genre, String title, String length,
			String composer, String lyricist, Set mediaDatas) {
		this.album = album;
		this.genre = genre;
		this.title = title;
		this.length = length;
		this.composer = composer;
		this.lyricist = lyricist;
		this.mediaDatas = mediaDatas;
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

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getComposer() {
		return this.composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getLyricist() {
		return this.lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public Set getMediaDatas() {
		return this.mediaDatas;
	}

	public void setMediaDatas(Set mediaDatas) {
		this.mediaDatas = mediaDatas;
	}

}