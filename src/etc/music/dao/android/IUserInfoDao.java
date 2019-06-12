package etc.music.dao.android;


public interface IUserInfoDao {
	
	public boolean checkNickName(final String nickName, final String password);
	public int getUserId(final String nickName,final String password);

}
