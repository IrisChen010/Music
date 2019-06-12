package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Genre entity. @author MyEclipse Persistence Tools
 */

public class Genre implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set hobbies = new HashSet(0);
	private Set medias = new HashSet(0);

	// Constructors

	/** default constructor */
	public Genre() {
	}

	/** full constructor */
	public Genre(String name, Set hobbies, Set medias) {
		this.name = name;
		this.hobbies = hobbies;
		this.medias = medias;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(Set hobbies) {
		this.hobbies = hobbies;
	}

	public Set getMedias() {
		return this.medias;
	}

	public void setMedias(Set medias) {
		this.medias = medias;
	}

}