package pgdac.ads.listD11;

import java.util.Iterator;

public interface IterableList extends Iterable<Integer> {
	void insert(int element);
	void delete(int element);
	boolean isEmpty();
	
	Iterator<Integer> iterator();
}
