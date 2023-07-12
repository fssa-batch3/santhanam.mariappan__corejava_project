package day05.misc;

interface ShapeInf {
	public void draw();
}

interface Boundary {
	public void calculateBoundary();
}

class Rectangle3 implements ShapeInf, Boundary {
	
	public void draw() {
		System.out.println("Drawing a Rectangle by implementing inf");
	}

	public void calculateBoundary() {                                          
		System.out.println("Calculating Rectangle Boundary");
		
	}
}

class Square2 implements ShapeInf {
	public void draw() {
		System.out.println("Drawing a square by implementing inf");
	}
}

public class ShapeInterfaceDemo {
	public static void main(String[] args) {
		
		Rectangle3 rectangle = new Rectangle3();
		ShapeInf shape1 = rectangle;
		shape1.draw();
		Boundary shape2 = rectangle;
		shape2.calculateBoundary();
		
		
		ShapeInf square = new Square2();
		square.draw();
	}
}