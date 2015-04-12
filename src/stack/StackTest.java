package stack;

/**
 * The Class StackTest.
 * @author Matt
 */
public class StackTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Stack<Double> list = new Stack<Double>();
		Stack<Double> minList = new Stack<Double>();
		Stack<Double> maxList = new Stack<Double>();
		double x = 0.0;
		
		for(int i = 0; i < 100; i++) {
			x = ((Double) Math.random() * 1000);
			
			list.push(x);
			minList.pushMin(x);
			maxList.pushMax(x);
		}
		
		System.out.println("Minimum element: " + minList.peek());
		System.out.println("Maximum element: " + maxList.peek());
		
		System.out.println("Minimum list: ");
		minList.printList();
		System.out.println("Maximum list: ");
		maxList.printList();
		System.out.println("Total list: ");
		list.printList();
	}

}
