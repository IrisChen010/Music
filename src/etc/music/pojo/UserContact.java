package etc.music.pojo;

/**
 * UserContact entity. @author MyEclipse Persistence Tools
 */

public class UserContact implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private String address;
	private String postNum;
	private String phone;

	// Constructors

	/** default constructor */
	public UserContact() {
	}

	/** full constructor */
	public UserContact(UserInfo userInfo, String address, String postNum,
			String phone) {
		this.userInfo = userInfo;
		this.address = address;
		this.postNum = postNum;
		this.phone = phone;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostNum() {
		return this.postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}