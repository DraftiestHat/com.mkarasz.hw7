package inefficientSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * The Class Main.
 * @author Matt
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10000; i++){
			list.add((int) Math.floor(Math.random() * 1000000));
		}
		
		list = InefficientSort.sort(list);
		
		textWrite(list, "sorted.obj");
		list = textGet("sorted.obj");
		for(int j: list)
			System.out.print(j + " ");
		System.out.println();
	}
	
	/**
	 * Write the text to a file.
	 *
	 * @param list the list
	 * @param fileName the file name
	 */
	protected static void textWrite(ArrayList<Integer> list, String fileName) {
		BufferedWriter buf = null;
		
		try {
			buf = new BufferedWriter(new FileWriter(new File(fileName)));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.exit(-1);
		}
		
		try {
			for(Integer i : list) {
				buf.write(i + "\n");	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		try {
			buf.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//System.out.println(fileName + " printed.");
	}
	
	/**
	 *  Reads the elements from a text file of the form given to me.
	 *
	 * @param fileName the file to read
	 * @return the arrayList of elements from the text file
	 */
	protected static ArrayList<Integer> textGet(String fileName) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		String line;
	    try{
	
	       //Create object of FileReader
	       FileReader inputFile = new FileReader(fileName);
	
	       //Instantiate the BufferedReader Class
	       BufferedReader bufferReader = new BufferedReader(inputFile);
	
	              
	       while((line = bufferReader.readLine()) != null) {
	    	   list.add(Integer.parseInt(line));
	       }
	       
	       //Close the buffer reader
	       bufferReader.close();
	       
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line:" + e.getMessage());
	       e.printStackTrace();
	       System.exit(-1);
	    }
	    
	    int size = list.size();
	    for(int i = 0; i < 10; i++) {
	    	ret.add(list.get(i));
	    }
	    for(int i = size - 11; i < size; i++)
	    	ret.add(list.get(i));
	    
	    
	    return ret;
	}

}


