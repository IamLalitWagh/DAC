package pgdac.ads.stackD1;

public class StackUnderflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackUnderflowException(String errorMessage) {
		super(errorMessage);
	}
}
