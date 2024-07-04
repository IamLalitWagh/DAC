package pgdac.ads.stackD3;

public class StackUnderflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackUnderflowException(String errorMessage) {
		super(errorMessage);
	}
}
