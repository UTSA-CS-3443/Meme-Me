package model;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class CreateModel<E> {

	private String topLine;
	
	private String bottomLine;
	
	private ArrayList<E> memes;
	
	private String creator;
	
	
	/**
	 * Constructs a an arrayList of memes
	 */
	public CreateModel() {
		this.memes = new ArrayList<E>();
	}
	
	/**
	 * Returns the top line of this meme
	 * @return
	 */
	public String getTopLine() {
		return this.topLine;
	}
	
	/**
	 * Adds a generic type of line to the top of the meme
	 * @param meme
	 */
	public void addTopLine(E meme) {
		this.memes.add(meme);
	}
	
	/**
	 * Deletes a generic type of line to the top of the meme 
	 * @param meme
	 */
	public void removeTopLine(E meme) {
		this.memes.remove(meme);
	}
	
	/**
	 * Returns a String type of the bottom line of the meme
	 * @return
	 */
	public String getBottomLine() {
		return this.bottomLine;
	}
	
	/**
	 * Inserts a generic type of a bottom line of the meme
	 * @param meme
	 */
	public void addBottomLine(E meme) {
		this.memes.add(meme);
	}
	
	/**
	 * Deletes a generic type of a bottom line ot the meme
	 * @param meme
	 */
	public void removeBottomLine(E meme) {
		this.memes.remove(meme);
	}
	
	
	public String getCreator() {
		return this.creator;
	}
		
}
