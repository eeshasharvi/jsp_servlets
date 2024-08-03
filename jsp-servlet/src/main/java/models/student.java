package models;

public class student {
	private String username;
	private String email;
	private String branch;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String username, String email, String branch) {
		super();
		this.username = username;
		this.email = email;
		this.branch = branch;
	}
	
}
