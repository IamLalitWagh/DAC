package pgdac.ads.stackD3;

import pgdac.ads.listD3.List;
import pgdac.ads.listD3.SinglyList;

public class StackUsingList implements Stack {
	List list;
	
	public StackUsingList() {
		list = new SinglyList();
	}

	@Override
	public void push(int element) {
		list.addAtFront(element);
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			throw new StackUnderflowException("Stack is empty. Failed to pop element.");
		}

		return list.deleteFirstNode();
	}

	@Override
	public int peek() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
