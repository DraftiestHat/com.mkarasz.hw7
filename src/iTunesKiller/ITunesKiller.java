package iTunesKiller;

import java.util.ArrayDeque;


/**
 * Both a song and a playlist modifying class. Because that makes sense.
 * @author Matt
 *
 */
public class ITunesKiller {
	
	/** The artist. */
	private String artist;
	
	/** The title. */
	private String title;
	
	/**
	 * Default constructor.
	 */
	public ITunesKiller() {		
		this(null, null);
	}
	
	/**
	 * Instantiates a new i tunes killer.
	 *
	 * @param artist the artist
	 * @param title the title
	 */
	public ITunesKiller(String artist, String title){
		this.artist = artist;
		this.title = title;
	}
	
	/**
	 * Gets the artist.
	 *
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * Sets the artist.
	 *
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.artist + "\n\t" + this.title;
	}
	
	/**
	 * Adds the song.
	 *
	 * @param song the song
	 * @param playList the play list
	 */
	public static void addSong(ITunesKiller song, ArrayDeque<ITunesKiller> playList){
		if(song == null){
			System.out.println("song is null. WTF.");
			return;
		}
		try {
			playList.add(song);
		}
		catch (Exception e){
			System.out.println("WTF.");
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * Back.
	 *
	 * @param playList the play list
	 * @param history the history
	 */
	public static void back(ArrayDeque<ITunesKiller> playList, ArrayDeque<ITunesKiller> history){
		if(history.isEmpty()){
			return;
		}
		playList.addFirst(history.pollLast());
		
	}
	
	/**
	 * Play.
	 *
	 * @param playList the play list
	 * @param history the history
	 */
	public static void play(ArrayDeque<ITunesKiller> playList, ArrayDeque<ITunesKiller> history){
		if(playList.isEmpty()){
			System.out.println("No song to play.");
			return;
		}
		ITunesKiller s = playList.pollFirst();
		System.out.println(s.toString());
		history.addLast(s);
	}
	
	/**
	 * Skip song.
	 *
	 * @param playList the play list
	 * @param skipped the skipped
	 */
	public static void skipSong(ArrayDeque<ITunesKiller> playList, ArrayDeque<ITunesKiller> skipped){
		if(playList.isEmpty()){
			System.out.println("No song to skip.");
			return;
		}
		skipped.addFirst(playList.pollFirst());	
	}
	
	/**
	 * Undo skipped song.
	 *
	 * @param playList the play list
	 * @param skipped the skipped
	 */
	public static void undoSkippedSong(ArrayDeque<ITunesKiller> playList, ArrayDeque<ITunesKiller> skipped){
		if(skipped.isEmpty()){
			System.out.println("No song skipped.");
			return;
		}
		playList.addFirst(skipped.pollFirst());
	}
	
	/**
	 * View history.
	 *
	 * @param history the history
	 */
	public static void viewHistory(ArrayDeque<ITunesKiller> history) {
		printDeque(history);
	}
	
	/**
	 * View play list.
	 *
	 * @param playList the play list
	 */
	public static void viewPlayList(ArrayDeque<ITunesKiller> playList){
		printDeque(playList);
		
	}
	
	/**
	 * View skipped.
	 *
	 * @param skipped the skipped
	 */
	public static void viewSkipped(ArrayDeque<ITunesKiller> skipped) {
		printDeque(skipped);
	}
	
	/**
	 * Prints the deque.
	 *
	 * @param e the e
	 */
	private static void printDeque(ArrayDeque<ITunesKiller> e) {
		if(e.isEmpty()){
			System.out.println("Nothing here.");
			return;
		}
		
		for(ITunesKiller s : e){
			System.out.println(s.toString());
		}
	}
}
