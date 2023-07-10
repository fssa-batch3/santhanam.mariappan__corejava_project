package day03.practice;
//Create a User class with 2 constructors.
//the second overloaded constructor User(name, password, emailId)

public class UserCons {

	private String name;
	private String password;
	private String emailId;
	
	
	public UserCons(String emailId, String name, String password) {
		this.name=name;
		this.password=password;
		this.emailId=emailId;
	}
	
	
	public UserCons() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name=name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public static void main(String[] args) {
		UserCons acct1 = new UserCons();
		acct1.SetName("Santta");
		acct1.setPassword("204qw");
		acct1.setEmailId("Santhu@gmail.com");
		UserCons acct2 = new UserCons("Santta@123gmail.com","bliss","fgg");	
		System.out.println("Name :"+acct1.getName()+", Password :"+acct1.getPassword()+", Email :"+acct1.getEmailId());
		System.out.println("Name :"+acct2.getName()+", Password :"+acct2.getPassword()+", Email :"+acct2.getEmailId());
	}
	
}
