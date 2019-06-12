package etc.music.pojo;

/**
 * ArtistInfo entity. @author MyEclipse Persistence Tools
 */

public class ArtistInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Artist artist;
	private String name;
	private Integer gender;
	private String firstChar;
	private String birthplace;
	private Integer birthYear;
	private Integer birthMonth;
	private Integer birthDay;
	private String nationality;

	// Constructors

	/** default constructor */
	public ArtistInfo() {
	}

	/** full constructor */
	public ArtistInfo(Artist artist, String name, Integer gender,
			String firstChar, String birthplace, Integer birthYear,
			Integer birthMonth, Integer birthDay, String nationality) {
		this.artist = artist;
		this.name = name;
		this.gender = gender;
		this.firstChar = firstChar;
		this.birthplace = birthplace;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.nationality = nationality;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getFirstChar() {
		return this.firstChar;
	}

	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public Integer getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getBirthMonth() {
		return this.birthMonth;
	}

	public void setBirthMonth(Integer birthMonth) {
		this.birthMonth = birthMonth;
	}

	public Integer getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(Integer birthDay) {
		this.birthDay = birthDay;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}