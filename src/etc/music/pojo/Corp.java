package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Corp entity. @author MyEclipse Persistence Tools
 */

public class Corp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String country;
	private Set albums = new HashSet(0);

	// Constructors

	/** default constructor */
	public Corp() {
	}

	/** full constructor */
	public Corp(String name, String country, Set albums) {
		this.name = name;
		this.country = country;
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

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set albums) {
		this.albums = albums;
	}

}