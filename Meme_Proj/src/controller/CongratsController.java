package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Creates controller for Congratulations window
 */
public class CongratsController implements EventHandler<ActionEvent> {

	/**
	 * Button to exit 
	 */
	@FXML
	private Button exit;

	/**
	 * Method to exit application once button is clicked
	 */
	@Override
	public void handle(ActionEvent arg0) {
		Platform.exit();
		System.exit(0);
	}	
}
