package etc.music.dao.android;

public interface IShowAlb {

	public String getAlbums();
	
	public String SearchMediaById(final int id);
	
	public int getAlbumIdByName(final String name);
	
	public String getAlbumNameById(final int id);
	public String getAlbumArtById(final int id);
	public String getAlbumIntroById(final int id);
	public String getAlbumPathById(final int id);
}
