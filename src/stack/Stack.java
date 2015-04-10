package stack;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> list; 
	
	Stack(){
		this.list = new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		return (this.list.size() == 0);
	}
	
	public T peek(){
		return list.getFirst();
	}
	
	public T pop(){
		T t = list.getFirst();
		list.remove(t);		
		return t;
	}
	
	public void push(T t) {
		list.addFirst(t);
	}
	
	public int size() {
		return this.list.size();
	}
}
