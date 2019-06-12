package etc.music.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nickName;
	private String realName;
	private String pwd;
	private Integer gender;
	private String province;
	private String city;
	private String email;
	private Integer level;
	private String path;
	private Integer age;
	private String blog;
	private Set hobbies = new HashSet(0);
	private Set shopCarts = new HashSet(0);
	private Set shopHistories = new HashSet(0);
	private Set favourites = new HashSet(0);
	private Set userContacts = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(String nickName, String realName, String pwd,
			Integer gender, String province, String city, String email,
			Integer level, String path, Integer age, String blog, Set hobbies,
			Set shopCarts, Set shopHistories, Set favourites, Set userContacts) {
		this.nickName = nickName;
		this.realName = realName;
		this.pwd = pwd;
		this.gender = gender;
		this.province = province;
		this.city = city;
		this.email = email;
		this.level = level;
		this.path = path;
		this.age = age;
		this.blog = blog;
		this.hobbies = hobbies;
		this.shopCarts = shopCarts;
		this.shopHistories = shopHistories;
		this.favourites = favourites;
		this.userContacts = userContacts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBlog() {
		return this.blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public Set getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(Set hobbies) {
		this.hobbies = hobbies;
	}

	public Set getShopCarts() {
		return this.shopCarts;
	}

	public void setShopCarts(Set shopCarts) {
		this.shopCarts = shopCarts;
	}

	public Set getShopHistories() {
		return this.shopHistories;
	}

	public void setShopHistories(Set shopHistories) {
		this.shopHistories = shopHistories;
	}

	public Set getFavourites() {
		return this.favourites;
	}

	public void setFavourites(Set favourites) {
		this.favourites = favourites;
	}

	public Set getUserContacts() {
		return this.userContacts;
	}

	public void setUserContacts(Set userContacts) {
		this.userContacts = userContacts;
	}

}