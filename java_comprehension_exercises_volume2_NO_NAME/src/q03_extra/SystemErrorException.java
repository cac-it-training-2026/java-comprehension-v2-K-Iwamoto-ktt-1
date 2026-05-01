package q03_extra;

public class SystemErrorException extends Exception {

	public SystemErrorException() {
		super();
	}

	public SystemErrorException(String message, Throwable cause, boolean enableSupression,
			boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

	public SystemErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemErrorException(String message) {
		super(message);
	}

	public SystemErrorException(Throwable cause) {
		super(cause);
	}

}
