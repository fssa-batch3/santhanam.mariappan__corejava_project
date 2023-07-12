package day01.practice;

   public class Cat {
	// Attributes
	private int hasDots;
	private String color;
	private String speak;
	 

                 //	 Constructor
	public Cat(int hasDots, String color, String speak) {
		this.hasDots = hasDots;
		this.color = color;
		this.speak = speak;
	}

 
 
	    // Getters and setters
	public int hasDots() {
		return hasDots;
	}

   //	public void setHasDots(int hasDots) {
  //		this.hasDots = hasDots;
 //	}

	public String getColor() {
		return color;
	}

//	public void setColor(String color) {
//		this.color = color;
//	}

	public String getspeak() {
		return speak;
	}

//	public void setSpeak(String speak) {
//		this.speak = speak;
//
//	}
	
 
	
	    // Main method to create Dog objects
	    public static void main(String[] args) {
		// Create two Dog objects
		Cat cat0 = new Cat(0, "black", "hello");
		Cat cat1 = new Cat(1, "purple", "Meow");
		Cat cat2 = new Cat(2, "blue", "Meow");
		 
	     
		
		
//      Cat cat3 =new Cat(true,"Wolf","Meow");
		
		System.out.println("Cat 0:");
		System.out.println("Has Dots: " + cat0.hasDots());
		System.out.println("Color: " + cat0.getColor());
		System.out.println("Speaks: " + cat0.getspeak());

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Has Dots: " + cat1.hasDots());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.getspeak());

		System.out.println("Cat 2:");
		System.out.println("Has Dots: " + cat2.hasDots());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.getspeak());
	}

}