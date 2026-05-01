package q03_extra;

public class IllegalInputException extends Exception {

	public IllegalInputException() {
		super();
	}

	public IllegalInputException(String message, Throwable cause, boolean enableSupression,
			boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

	public IllegalInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalInputException(String message) {
		super(message);
	}

	public IllegalInputException(Throwable cause) {
		super(cause);
	}
}
