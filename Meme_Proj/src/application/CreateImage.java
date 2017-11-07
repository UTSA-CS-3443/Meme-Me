package application;

import javafx.scene.image.Image;



public class CreateImage {
	

// http://code.makery.ch/library/javafx-8-tutorial/part2/
	// this is a guide to help
	
	private String topLine;
	
	private String bottomLine;
	
	private Image image;
	
	/**
	 * Default Constructor
	 */
	public CreateImage() {
		this(null);
	}
	
	
	public CreateImage(Image image) {
		
		this.image = image;		
	}


	/**
	 * @return the topLine
	 */
	public String getTopLine() {
		return topLine;
	}


	/**
	 * @param topLine the topLine to set
	 */
	public void setTopLine(String topLine) {
		this.topLine = topLine;
	}


	/**
	 * @return the bottomLine
	 */
	public String getBottomLine() {
		return bottomLine;
	}


	/**
	 * @param bottomLine the bottomLine to set
	 */
	public void setBottomLine(String bottomLine) {
		this.bottomLine = bottomLine;
	}


	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}


	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}	

}
