package controller;

import java.io.File;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class CreateController implements EventHandler<ActionEvent>{
	
	@FXML
	private StackPane pane;
	//TODO: ToolPane EDIT
	 @FXML
	 private Button clear;
	 @FXML
	 private Group group;
	@FXML
	private Button undo;
	 @FXML 
	 private Button redo;
	 @FXML
	 private Button close;	
	 @FXML
	 private Button top;
	 @FXML 
	 private Button bottom; 
	 @FXML
	 private TextField txtFd;
	//TODO: FILE 
	public Image original;
	
	public Image saved;
	
	public ImageView imgView;

	
	@Override
	public void handle(ActionEvent event) {
		//For implements leave alone
		}
	
	//File Menu	
	@FXML
	public void openFunction(ActionEvent event) throws IOException {		
		FileChooser choice = new FileChooser();
		choice.getExtensionFilters().addAll(new 
				ExtensionFilter("Images Files", "*.png", "*.jpg", "*.gif"));
		File selected = choice.showOpenDialog(null);
		if(selected != null) {
			String location = selected.toURI().toURL().toString();
			System.out.println( location);
			Image img = new Image(location);
			System.out.println("height: " +img.getHeight() + "\nWidth: " + img.getWidth());
			imgView.setImage(img);
		}
	}	
	
	public void saveFunction(ActionEvent event) {
	//	https://docs.oracle.com/javase/8/javafx/graphics-tutorial/image_ops.htm#CIHFIEFJ
	}
	
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	//Edit Menu	
	public void undoFunction(ActionEvent event) {	}
	
	public void redoFunction(ActionEvent event){	}
	
	public void clearFunction(ActionEvent event) {
		pane.getChildren().clear(); 
		System.out.print("Cleared All");		
	} 
	
	//Tools			
	
	//button function	
	public void topLine(ActionEvent event) {
		Text text = new Text();
		TextField txtFd  = new TextField();
		txtFd.setText("SAY WHAT");
		text.getText();
		text.textProperty().bind(txtFd.textProperty());
		text.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text.setFill(Color.WHITE);
		text.setStroke(Color.BLACK);
		text.setX(30);
		text.setY(50);
		group.getChildren().add(text);
	}	
	
	public void bottomLine(ActionEvent event) {
		
	
	}
	
}
