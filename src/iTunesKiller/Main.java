package iTunesKiller;

import java.util.ArrayDeque;

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
		ArrayDeque<ITunesKiller> playList;
		ArrayDeque<ITunesKiller> history = new ArrayDeque<ITunesKiller>();
		ArrayDeque<ITunesKiller> skipped = new ArrayDeque<ITunesKiller>();
		
		playList = ReadSongFile.readSongFile("songs.txt");
		ITunesKiller.viewPlayList(playList); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.viewHistory(history); 
		ITunesKiller.skipSong(playList, skipped); 
		ITunesKiller.viewSkipped(skipped); 
		ITunesKiller.undoSkippedSong(playList, skipped); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.back(playList, history); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.viewHistory(history); 
		//add the song "The Letter" by The Boxtops 
		ITunesKiller.addSong(new ITunesKiller("The Letter", "The Boxtops"), playList); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.play(playList, history); 
		ITunesKiller.viewHistory(history); 
		ITunesKiller.skipSong(playList, skipped); 
		ITunesKiller.skipSong(playList, skipped); 
		ITunesKiller.skipSong(playList, skipped); 
		ITunesKiller.viewSkipped(skipped); 
		ITunesKiller.viewPlayList(playList);
	}

}
