package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Double> list = new Stack<Double>();
		for(int i = 0; i < 100; i++) {
			list.push((double) Math.random() * 1000);
		}
		
		

	}

}
