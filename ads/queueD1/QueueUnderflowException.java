package pgdac.ads.queueD1;

public class QueueUnderflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueUnderflowException(String errorMessage) {
		super(errorMessage);
	}
}
