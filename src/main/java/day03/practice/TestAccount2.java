package day03.practice;

//
//id=1, name=naresh
//
//id=2, name=suresh

class Account2 {
 

	private String name;
	private int id;

	// Default Constructor
	public Account2() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account2(int id, String name) {
		this.id = id;
		this.name = name;
	 
	}


// setting and geting id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 

}

public class TestAccount2 {
	public static void main(String[] args) {

		// create Account using Setter methods and Default constructor
		Account2 acct1 = new Account2();
		 
		acct1.setName("Naresh");
		acct1.setId(1);

		System.out.println("id= "+acct1.getId()+ ",name : "+acct1.getName());

		// Create Account with Overloaded constructor accepting parameters
		Account2 acct2 = new Account2(2,"Suresh");
		System.out.println("id= "+acct2.getId()+ ",name : "+acct2.getName());

	}
}