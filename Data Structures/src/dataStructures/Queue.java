package dataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	//Create an empty queue 
	public Queue() {
		
	}
	
	//Create an empty queue with the first element
	public Queue(T elem) {
		offer(elem);
	}
	
	//Return the size of the queue
	public int size() {
		return list.size();
	}
	
	//Check whether the queue is empty or not
	public boolean isEmpty() {
		return size() == 0; 
	}
	
	//peek the element at the front of the queue
	public T peek() {
		if(isEmpty()) throw new RuntimeException("Queue Empty...");
		return list.peekFirst();
	}
	
	//Removes the first element from the list
	public T poll() {
		if(isEmpty()) throw new RuntimeException("Queue Empty...");
		return list.removeFirst();
	}
	
	//Add an element to the back of the queue
	public void offer(T elem) {
		list.addLast(elem);
	}
	
	//Allows the user to iterate through the queue with the help of an iterator
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}
