package dataStructures;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

//Stack with the help of doubly linked list provided by java.util
public class Stack<T> implements Iterable<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	//Create an empty stack
	public Stack() {
		
	}
	
	//Create an stack with the initial element
	public Stack(T firstElem) {
		push(firstElem);
	}
	
	//Return the number of elements in the stack
	public int size() {
		return list.size();
	}
	
	//Check if the stackmis empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	//Push an element onto the stack
	public void push(T elem) {
		list.addLast(elem);
	}
	
	//Pop an element from the stack
	public T pop() {
		if(isEmpty()) throw new EmptyStackException();
		return list.removeLast();
	}
	
	//Peek the top of the stack without removing an element
	public T peek() {
		if(isEmpty()) throw new EmptyStackException();
		return list.peekLast();
	}
	
	//Allows users to iterate through stack with iterator
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
