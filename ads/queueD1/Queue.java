package pgdac.ads.queueD1;

public interface Queue {
	void enqueue(String element);
	String dequeue();
	boolean isEmpty();
	boolean isFull();
}
