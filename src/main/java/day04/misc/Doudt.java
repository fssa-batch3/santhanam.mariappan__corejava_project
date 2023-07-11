package day04.misc;

class Hare {

	public void init() {

		System.out.println("init-");

	}

	protected void race() {

		System.out.println("hare-");

	}

}

// Tortoise.java Assume the below code is a separate Tortoise.java file

public class Doudt extends Hare {

	protected void race(Hare hare) {

		hare.init(); // x1

		hare.race(); // x2

		System.out.print("tortoise-");

	}

	public static void main(String[] args) {

		Doudt tortoise = new Doudt();

		Hare hare = new Hare();

		tortoise.race(hare);

	}

}