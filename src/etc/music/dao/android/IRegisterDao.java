package etc.music.dao.android;

public interface IRegisterDao {
	
	public boolean checkName(final String nickName);
	
	public void addUser(final String nickName, final String password, final String email);

}
