package day11.practice;

public class DAOException1 extends Exception {


	private static final long serialVersionUID = 2L;

	public DAOException1(String msg) {
		super(msg);
	}

	public DAOException1(Throwable te) {
		super(te);
	}

	public DAOException1(String msg, Throwable te) {
		super(msg, te);
	}
}