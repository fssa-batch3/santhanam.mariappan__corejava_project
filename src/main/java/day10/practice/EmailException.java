package day10.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmailException extends RuntimeException {
	/**
	 * 
	 */
//	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public InvalidEmailException(String msg) {
		System.out.println("InValid Email");
	}

}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		// TODO Write your logic valid returns true else throw the above exception
		// Also create the user defined exception mentioned in throws
		if (emailId == null) {
			throw new InvalidEmailException("The email cannot be null");
		}

//		String emailId = "suryafreshworks.com";

		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		boolean isMatch = Pattern.matches(regex, emailId);

		if (!isMatch) {
			throw new InvalidEmailException("Invalided Email Address");
		}

		System.out.println("Valid Email");

		return true;

	}
}

public class EmailException {
	public static void main(String[] args) throws InvalidEmailException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your email");

		String email = scan.nextLine();

		try {
			EmailValidator.isValidEmail(email);
			scan.close();

		} catch (InvalidEmailException ex) {
			 
		}

	}

}