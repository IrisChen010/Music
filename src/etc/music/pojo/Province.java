package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set cities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** full constructor */
	public Province(String name, Set cities) {
		this.name = name;
		this.cities = cities;
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

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

}