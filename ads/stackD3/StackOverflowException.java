package pgdac.ads.stackD3;

public class StackOverflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackOverflowException(String errorMessage) {
		super(errorMessage);
	}
}
