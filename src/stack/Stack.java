package stack;

import java.util.LinkedList;

/**
 * The Class Stack.
 * @author Matt
 * @param <T> the generic type
 */
public class Stack<T extends Comparable<T>> {
	
	/** The list. */
	private LinkedList<T> list; 
	
	/**
	 * Instantiates a new stack.
	 */
	Stack(){
		this.list = new LinkedList<T>();
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return (this.list.size() == 0);
	}
	
	/**
	 * Peek.
	 *
	 * @return the t
	 */
	public T peek(){
		T t = null;
		try {
			t = list.getFirst();
		}
		catch (Exception e) {
			System.out.println("getFirst issue.");
			e.printStackTrace();
			System.exit(-1);
		}
		return t;
	}
	
	/**
	 * Pop.
	 *
	 * @return the t
	 */
	public T pop(){
		if(this.list.isEmpty()){
			return null;
		}
		T t = null;
		try {
			t = this.list.getFirst();
			this.list.remove(t);
		}
		catch (Exception e) {
			System.out.println("getFirst or remove issue.");
			e.printStackTrace();
			System.exit(-1);
		}				
		return t;
	}
	
	/**
	 * Push.
	 *
	 * @param t the t
	 */
	public void push(T t) {
		list.addFirst(t);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return this.list.size();
	}
	
	/**
	 * Push min.
	 *
	 * @param t the t
	 */
	public void pushMin(T t) {
		if(this.isEmpty() == true){
			this.push(t);
			return;
		}
		T hold = this.peek();
		if(t.compareTo(hold) < 0) {
			this.push(t);
		}
	}
	
	/**
	 * Push max.
	 *
	 * @param t the t
	 */
	public void pushMax(T t) {
		if(this.isEmpty() == true){
			this.push(t);
			return;
		}
		T hold = this.peek();
		if(t.compareTo(hold) > 0) {
			this.push(t);
		}
	}
	
	/**
	 * Prints the list.
	 */
	public void printList(){
		System.out.println(this.list);
	}
}
