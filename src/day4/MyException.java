package day4;

class CustomException extends Exception {

	public CustomException(String message) {

		super(message);

	}
}

public class MyException {
	public static void main(String[] args) {
		try {
			throw new CustomException("This is a custom exception.");
		} catch (CustomException e) {
			System.out.print(e.getMessage());

		}

	}

}
