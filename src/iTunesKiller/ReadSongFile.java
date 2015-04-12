/*
 * 
 */
package iTunesKiller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;


/**
 * For reading in a song text file.
 */
public class ReadSongFile {
	
	/**
	 * Read song file.
	 *
	 * @param fileName the file name
	 * @return the array deque
	 */
	public static ArrayDeque<ITunesKiller> readSongFile(String fileName){
		ArrayList<ITunesKiller> al = new ArrayList<ITunesKiller>();
		
	    try{
	    	
	       //Create object of FileReader
	       FileReader inputFile = new FileReader(fileName);
	
	       //Instantiate the BufferedReader Class
	       BufferedReader bufferReader = new BufferedReader(inputFile);
	
	       String line = null;
	       String[] tokens;
	       
	       //get actual information
	       while((line = bufferReader.readLine()) != null) {	    	   
	    	   tokens = line.split(" - ");
	    	   if(tokens.length == 2) {
	    		   al.add(new ITunesKiller(tokens[1], tokens[0]));
	    	   }	    	   
	       }
	       
	       //Close the buffer reader
	       bufferReader.close();
	       
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line: " + e.getMessage());
	       e.printStackTrace();
	       System.exit(-1);
	    }
	    
	    return makeFuckingWeirdPlaylist(al);
	}
	
	/**
	 * Make fucking weird playlist.
	 *
	 * @param e the e
	 * @return the array deque
	 */
	private static ArrayDeque<ITunesKiller> makeFuckingWeirdPlaylist(ArrayList<ITunesKiller> e) {
		if(e.size() < 10){
			System.out.println("Not enough elements.");
			return null;
		}
		int mp = e.size()/2;
		int up = mp + 1, down = mp - 1; 
		
		ArrayDeque<ITunesKiller> ret = new ArrayDeque<ITunesKiller>();
		ret.add(e.get(mp));
		
		while(up - 10 != down){			
			ret.add(e.get(up));
			ret.add(e.get(down));
			up++;
			down--;
		}
		
		return ret;
	}
}
