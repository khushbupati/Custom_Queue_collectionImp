package CollectionImpl;

import java.util.Arrays;
import java.util.NoSuchElementException;

public  class ArrayDeque<E> implements Deque<E> {
	    private int ct=0;
	    
	    private Object[]ar;
	    private int initialCap=16;
	    
	    public ArrayDeque() {
	    	ar=new Object[initialCap];
	    	
	    }
	    public ArrayDeque(int initial) {
	    	ar=new Object[initial];
	    }
	    
	    public void addFirst(E ele) {
	    	if(ele==null) {
	    		throw new NullPointerException() ;
	    	}
	    	else if(ct<0.75*ar.length) {
	    		if(ct==0) {
	    			ar[0]=ele;
	    			ct++;
	    		}
	    		else {
	    			for(int i=ct;i>0;i--){
	    				ar[i]=ar[i-1];
	    			}
	    			ar[0]=ele;
	    			ct++;
	    		}
	    	}
	    	else {
	    		grow();
	    		for(int i=ct; i>0;i--) {
	    			ar[i]=ar[i-1];
	    			
	    		}
	    		ar[0]=ele;
	    		ct++;
	    	}
	    }
	    public void addLast(E ele) {
	    	if(ele==null) {
	    		throw new NullPointerException();
	    	}
	    	else if(ct<0.75*ar.length) {
	    		ar[ct]=ele;
	    		ct++;
	    	}
	    	else {
	    		grow();
	    		ar[ct]=ele;
	    		ct++;
	    		
	    	}
	    }
	    
	    public E removeLast() {
	    	if(ct>0) {
	    		ct--;
	    		return (E) ar[ct];
	    	}
	    	throw new NoSuchElementException("Queue is empty");
	    	
	    }
	//  .............................................................
	    public E removeFirst()
	    {
	    	 E ele=(E)ar[0];
	    	if(ct>0) {
	  		  for(int i=0;i<ct;i++) {
	  			  ar[i]=ar[i+1];
	  		  }
	  		  ct--;
	  		
	  		  return ele;
	  	  }
	  	  throw new NoSuchElementException("Queue is empty");
	    }
//	    ...............................................................
		@Override
		public E getFirst() {
			if(ct==0) {
				throw new NoSuchElementException("Query is empty");
				
			}
			else {
				return (E)ar[0];
			}
		}
	//..................................................................
		public E getLast() {
			if(ct==0) {
				throw new NoSuchElementException("Query is empty");
			}
			else 
				return (E) ar[ct-1];
			
		}
		
	//..................................................................
		public boolean offerFirst(E ele) {
			addFirst(ele);
			return true;
		}
	//...................................................................
		public boolean offerLast(E ele) {
			addLast(ele);
			return true;
		}
	//..................................................................
		public E pollFirst() {
			try {
				return removeFirst();
			}catch(NoSuchElementException e) {
				return null;
			}
		}
	//.................................................................
		
			
		
		public E pollLast() {
			try {
				return removeLast();
			}catch(NoSuchElementException e) {
				return null;
			}
		}
	//...................................................................
		public E peek() {
			try {
				return getFirst();
			}catch(NoSuchElementException e) {
				return null;
			}
		}
	//......................................................................
		public E peekFirst() {
			return peek();
		}
	//......................................................................
		public E peekLast() {
			try {
				return getLast();
			}catch(NoSuchElementException e) {
				return null;
			}
		}
	//......................................................................
		public boolean add(E ele) {
			addLast(ele);
			return true;
		}
	//......................................................................
		public E element() {
			return getFirst();
		}
	//......................................................................
		public boolean offer(E ele) {
			return offerLast(ele);
		}
	//......................................................................
		public E poll() {
			return pollFirst();
			
		}
	//......................................................................
		public void push(E ele) {
			addFirst(ele);
		}
	//......................................................................
		public E pop() {
			return removeFirst();
		}
	//......................................................................
		public int size() {
			return ct;
		}
	//......................................................................
		public E remove() {
			return removeFirst();
			
		}
	//......................................................................
		public boolean contains(E ele) {
			for(int i=0;i<ct;i++) {
				if(ar[i].equals(ele)) {
					return true;
				}
			}
			return false;
		}
	//......................................................................
		public void grow() {
			Object[]temp=new Object[ar.length* 2];
			for(int i=0;i<ct;i++) {
				temp[i]=ar[i];
			}
			ar=temp;
		}
	//......................................................................
		
		 
	 
	//.................................................................
		@Override
		public String toString() {
			return Arrays.toString(ar) ;
		}
		
	    public boolean isEmpty() {
	    	return ct>0?false:true;
	    }
		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean addAll(Collection<? extends E> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
	}



