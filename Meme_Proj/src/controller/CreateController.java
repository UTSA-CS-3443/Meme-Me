package controller;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.effect.Light.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;

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
	public Image original;
	
	public Image saved;
	
	public ImageView imgView;

	private Window stage;
	
	

	@Override
	public void handle(ActionEvent event) {
		//For implements leave alone
	}
	
	//File Menu
	
	@FXML
	public void openFunction(ActionEvent event) throws IOException {		
		FileChooser choice = new FileChooser();
		choice.getExtensionFilters().addAll(new 
				ExtensionFilter("Images Files", "*.png", "*.jpg", "*gif"));
		File selected = choice.showOpenDialog(null);
	
		if(selected != null) {
			String location = selected.toURI().toURL().toString();
			System.out.println("file: " + location);
			Image img = new Image(location);
			System.out.println("height: " +img.getHeight() + "\nWidth: " + img.getWidth());
			imgView.setImage(img);
		
		}
	}	
	
	public void saveFunction(ActionEvent event) {
		//https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm
				//Scroll down to saving files and read
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image");
        System.out.println(imgView.getId());
        
		File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(imgView.getImage(),
                    null), "jpg", file);
                System.out.println("Image has been successfully saved");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }			
	}
	
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	//Edit Menu
	
	public void undoFunction() {}
	
	public void redofunction(){}
	
	public void clearFunction() {
		
		
	} 
	
	//Tools
	public void textFunction(Point point) {
	
		
	}
	
	
	
}
