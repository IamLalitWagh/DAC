package pgdac.ads.queueD1;

public class QueueOverflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueOverflowException(String errorMessage) {
		super(errorMessage);
	}
}
