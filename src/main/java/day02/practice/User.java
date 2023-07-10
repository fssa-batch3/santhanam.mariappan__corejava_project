package day02.practice;
//Question#1 (For Encapsulation): Create a User class with attribute 

//id, name, password, emailId and create setters and getters for the same. 
//Please note no attribute should be available publicly 
//they should be only be accessible via the access modifiers.

public class User {
	private int id;

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
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

	private String password;
	private String emailId;

	public static void main(String[] args) {
		User obj = new User();
		obj.setId(20);
		obj.setPassword("Santhu@203");
		obj.setEmailId("SanthanamMariappan@gmail.com");
		System.out.println(obj.getId());
		System.out.println(obj.getEmailId());
		System.out.println(obj.getPassword());
	}

}
