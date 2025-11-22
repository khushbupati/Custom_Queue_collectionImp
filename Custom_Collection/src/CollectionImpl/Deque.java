package CollectionImpl;

public interface Deque<E> extends Collection<E> {
	void addFirst(E ele);
	void addLast(E ele);
//	boolean contains(E ele);
	E getFirst();
	E getLast();
	boolean offerFirst(E ele);
	boolean offerLast(E ele);
	E pollFirst();
	E pollLast();
	E pop();
	E peekFirst();
	E peekLast();
	void push(E ele);
	E removeFirst();
	E removeLast();
	int size();
}
