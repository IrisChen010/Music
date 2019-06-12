package etc.music.pojo;

import java.sql.Timestamp;

/**
 * ShopCart entity. @author MyEclipse Persistence Tools
 */

public class ShopCart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Album album;
	private UserInfo userInfo;
	private Integer number;
	private Timestamp tradeBegin;

	// Constructors

	/** default constructor */
	public ShopCart() {
	}

	/** full constructor */
	public ShopCart(Album album, UserInfo userInfo, Integer number,
			Timestamp tradeBegin) {
		this.album = album;
		this.userInfo = userInfo;
		this.number = number;
		this.tradeBegin = tradeBegin;
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

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Timestamp getTradeBegin() {
		return this.tradeBegin;
	}

	public void setTradeBegin(Timestamp tradeBegin) {
		this.tradeBegin = tradeBegin;
	}

}