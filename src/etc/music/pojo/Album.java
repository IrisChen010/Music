package etc.music.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Album entity. @author MyEclipse Persistence Tools
 */

public class Album implements java.io.Serializable {

	// Fields

	private Integer id;
	private Corp corp;
	private Language language;
	private Artist artist;
	private String name;
	private Timestamp releaseDate;
	private Integer tracksNum;
	private Integer clicked;
	private String description;
	private String path;
	private Double price;
	private Integer stockNum;
	private Set shopHistories = new HashSet(0);
	private Set medias = new HashSet(0);
	private Set shopCarts = new HashSet(0);
	private Set favourites = new HashSet(0);

	// Constructors

	/** default constructor */
	public Album() {
	}

	/** full constructor */
	public Album(Corp corp, Language language, Artist artist, String name,
			Timestamp releaseDate, Integer tracksNum, Integer clicked,
			String description, String path, Double price, Integer stockNum,
			Set shopHistories, Set medias, Set shopCarts, Set favourites) {
		this.corp = corp;
		this.language = language;
		this.artist = artist;
		this.name = name;
		this.releaseDate = releaseDate;
		this.tracksNum = tracksNum;
		this.clicked = clicked;
		this.description = description;
		this.path = path;
		this.price = price;
		this.stockNum = stockNum;
		this.shopHistories = shopHistories;
		this.medias = medias;
		this.shopCarts = shopCarts;
		this.favourites = favourites;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Corp getCorp() {
		return this.corp;
	}

	public void setCorp(Corp corp) {
		this.corp = corp;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Timestamp releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getTracksNum() {
		return this.tracksNum;
	}

	public void setTracksNum(Integer tracksNum) {
		this.tracksNum = tracksNum;
	}

	public Integer getClicked() {
		return this.clicked;
	}

	public void setClicked(Integer clicked) {
		this.clicked = clicked;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStockNum() {
		return this.stockNum;
	}

	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	public Set getShopHistories() {
		return this.shopHistories;
	}

	public void setShopHistories(Set shopHistories) {
		this.shopHistories = shopHistories;
	}

	public Set getMedias() {
		return this.medias;
	}

	public void setMedias(Set medias) {
		this.medias = medias;
	}

	public Set getShopCarts() {
		return this.shopCarts;
	}

	public void setShopCarts(Set shopCarts) {
		this.shopCarts = shopCarts;
	}

	public Set getFavourites() {
		return this.favourites;
	}

	public void setFavourites(Set favourites) {
		this.favourites = favourites;
	}

}