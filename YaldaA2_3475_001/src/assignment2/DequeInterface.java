package assignment2;
/**
 * 
 * Deque interface has all the methods needed to add to back and front, retrieve back and front and remove them
 * it can also check if the deque is empty and clear the whole deque
 */
public interface DequeInterface<T> {

	public void addToFront(T newEntry);
	public void addToBack(T newEntry);
	public T removeBack();
	public T removeFront();
	public T getFront();
	public T getBack();
	public boolean isEmpty();
	public void clear();
	

}
