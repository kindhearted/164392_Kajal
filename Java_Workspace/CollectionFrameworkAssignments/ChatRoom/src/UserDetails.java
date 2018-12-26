
public class UserDetails {

	
	private String userName;
	private String userId;
	private String password;
	
	public UserDetails(String userName,String userId,String password) {
		
		this.userName=userName;
		this.userId=userId;
		this.password=password;
	
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
