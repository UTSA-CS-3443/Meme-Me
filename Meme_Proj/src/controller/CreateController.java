package controller;

import java.awt.Graphics2D;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.effect.Light.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Popup;

public class CreateController implements EventHandler<ActionEvent>{

	//TODO: ToolPane EDIT
	 @FXML
	 private Button clear;
	 
	 @FXML
	 private ColorPicker color;
	@FXML
	private Button undo;
	 @FXML 
	 private Button redo;
	 @FXML
	 private Button done;
	 
	 
	 @FXML
	 private Button text;
	 
	//TODO: FILE 
	private Image original;
	
	private Image saved;
	
	
	
	

	@Override
	public void handle(ActionEvent event) {
		
		
	}
	
	
	//File Menu
	
	@FXML
	public void openFunction(ActionEvent event) throws MalformedURLException {
//		FileChooser choice = new FileChooser();
//		choice.setTitle("Open File");
//		@SuppressWarnings("unused")
//		File file = choice.showOpenDialog(new Stage());		
		
		javafx.stage.FileChooser choice = new javafx.stage.FileChooser();
		choice.getExtensionFilters().addAll(new 
				ExtensionFilter("Images Files", "*.png", "*.jpg", "*gif"));
		File selected = choice.showOpenDialog(null);
		if(selected != null) {
			String location = (selected.toURI().toURL().toString());
			
			//javafx code open a image from file and view controller google it 
					
			javafx.scene.layout.BorderPane pane = new javafx.scene.layout.BorderPane();
			pane.setPrefSize(750, 600);
			javafx.scene.image.ImageView imageView = new javafx.scene.image.ImageView(location);
			pane.setCenter(imageView);
			
			javafx.scene.Scene scene= new javafx.scene.Scene(pane);
			javafx.stage.Stage stage = new javafx.stage.Stage();
			stage.setTitle("Create Meme");
			stage.setScene(scene);
			stage.show();
			
		}
	}
	
	
	public void saveFunction(ActionEvent event) {
		//https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm
				//Scroll down to saving files and read
		
	}
	
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	//Edit Menu
	
	public void undoFunction() {	}
	
	public void redofunction(){}
	
	public void clearFunction() {} 
	
	
	//Tools
	public void textFunction() {
	
		
	}
	
	
	
	
	


	
	
	
	
	
	
	
	
}
