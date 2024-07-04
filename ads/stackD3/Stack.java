package pgdac.ads.stackD3;

public interface Stack {
	void push(int element);
	int pop();
	int peek();
	boolean isEmpty();
	boolean isFull();
}
