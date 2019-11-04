package library.javabean.hq;

public class User {
	private String user_name;	
	private String user_pwd;					
	private String user_role;
	
	public User() {
		super();
	}
	public User(String user_name) {
		super();
		this.user_name = user_name;
	}
	public User(String user_name, String user_pwd, String user_role) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_role = user_role;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_role=" + user_role + "]";
	}						

}
