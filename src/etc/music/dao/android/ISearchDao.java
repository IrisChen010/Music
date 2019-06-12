package etc.music.dao.android;

public interface ISearchDao {

	public String SearchByArtist(final String keyWord);
	public String SearchByAlbum(final String keyWord);
	public String AlbumPath(final String keyWord);
	public String SearchByChar(final String keyword);
}
