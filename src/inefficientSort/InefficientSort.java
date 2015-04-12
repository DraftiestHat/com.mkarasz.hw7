package inefficientSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Class InefficientSort.
 * @author Matt
 */
public class InefficientSort {
	
	/**
	 * Sort the array list of integers inefficiently.
	 *
	 * @param list the list
	 * @return the array list
	 */
	public static ArrayList<Integer> sort(ArrayList<Integer> list) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int i = 0, size = list.size();
		
		for(;i < size; i++){
			int minIndex = list.indexOf(Collections.min(list));
			ret.add(list.get(minIndex).intValue());
			list.remove(list.get(minIndex));
		}
		
		
		return ret;
	}
	
	
}
