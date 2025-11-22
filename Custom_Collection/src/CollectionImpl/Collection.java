package CollectionImpl;

public interface Collection<E> extends Iterable<E> {
	int size();

    boolean isEmpty();

    

    Iterator<E> iterator();

    Object[] toArray();


    boolean add(E e);

    boolean remove(Object o);

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

    boolean equals(Object o);

    int hashCode();
}
