package data;

public class UserBean {
	private String userName;
	private String passWord;
	private String oldpassWord;
	public String getOldpassWord() {
		return oldpassWord;
	}
	public void setOldpassWord(String oldpassWord) {
		this.oldpassWord = oldpassWord;
	}
	public UserBean() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

}
