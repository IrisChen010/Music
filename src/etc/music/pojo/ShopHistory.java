package etc.music.pojo;

import java.sql.Timestamp;

/**
 * ShopHistory entity. @author MyEclipse Persistence Tools
 */

public class ShopHistory implements java.io.Serializable {

	// Fields

	private Integer id;
	private Album album;
	private UserInfo userInfo;
	private Integer number;
	private Timestamp tradeBegin;
	private Timestamp tradeEnd;
	private Integer status;

	// Constructors

	/** default constructor */
	public ShopHistory() {
	}

	/** full constructor */
	public ShopHistory(Album album, UserInfo userInfo, Integer number,
			Timestamp tradeBegin, Timestamp tradeEnd, Integer status) {
		this.album = album;
		this.userInfo = userInfo;
		this.number = number;
		this.tradeBegin = tradeBegin;
		this.tradeEnd = tradeEnd;
		this.status = status;
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

	public Timestamp getTradeEnd() {
		return this.tradeEnd;
	}

	public void setTradeEnd(Timestamp tradeEnd) {
		this.tradeEnd = tradeEnd;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}