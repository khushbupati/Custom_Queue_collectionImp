package CollectionImpl;

import java.util.NoSuchElementException;

public class Itr<E> implements Iterator<E> {
	int cursor=0;
	Object []ar;
	int ct=0;
	
	 
	
	public Itr(Object[]ref, int ct) {
		ar=ref;
		this.ct= ct;
	}
	public E next() {
		if(cursor>=ct) {
			throw new NoSuchElementException("No more Elements");
		}
		else {
			return (E)ar[cursor++];
		}
	}
	
	public boolean hasNext() {
		return cursor<ct;
	}
	
}
