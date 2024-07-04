package pgdac.ads.stackD1;

public interface Stack {
	void push(int element);
	int pop();
	int peek();
	boolean isEmpty();
	boolean isFull();
}
