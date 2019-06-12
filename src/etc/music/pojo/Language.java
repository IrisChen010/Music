package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Language entity. @author MyEclipse Persistence Tools
 */

public class Language implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set hobbies = new HashSet(0);
	private Set albums = new HashSet(0);

	// Constructors

	/** default constructor */
	public Language() {
	}

	/** full constructor */
	public Language(String name, Set hobbies, Set albums) {
		this.name = name;
		this.hobbies = hobbies;
		this.albums = albums;
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

	public Set getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set albums) {
		this.albums = albums;
	}

}