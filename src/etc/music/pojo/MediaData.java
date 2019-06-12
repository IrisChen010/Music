package etc.music.pojo;

/**
 * MediaData entity. @author MyEclipse Persistence Tools
 */

public class MediaData implements java.io.Serializable {

	// Fields

	private Integer id;
	private Media media;
	private String path;
	private Integer clicked;

	// Constructors

	/** default constructor */
	public MediaData() {
	}

	/** full constructor */
	public MediaData(Media media, String path, Integer clicked) {
		this.media = media;
		this.path = path;
		this.clicked = clicked;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getClicked() {
		return this.clicked;
	}

	public void setClicked(Integer clicked) {
		this.clicked = clicked;
	}

}