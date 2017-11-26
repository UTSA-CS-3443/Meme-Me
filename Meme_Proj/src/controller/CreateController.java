package controller;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class CreateController implements EventHandler<ActionEvent>{
	
	@FXML
	public Canvas canvas;
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
	
	public ImageView imgView;
	

	
	@Override
	public void handle(ActionEvent event) {		}
		
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
			pane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		}
	}	
	
	public void saveFunction(ActionEvent event) {
		FileChooser choice = new FileChooser();
		choice.getExtensionFilters().addAll(new 
				ExtensionFilter("Images Files", "*.png", "*.jpg", "*.gif"));
		File selected = choice.showSaveDialog(null);
		if(selected != null) {
			try {
				WritableImage wi = new WritableImage((int)imgView.getFitWidth(),(int)imgView.getFitHeight());
				group.snapshot(null,wi);
				ImageIO.write(SwingFXUtils.fromFXImage(wi,null ),"png", selected);				
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	//Edit Menu	
	@SuppressWarnings("rawtypes")
	@FXML
	public void undoFunction(ActionEvent event) {
		UndoRedoStack stack = new UndoRedoStack();
		stack.undo();
		
	}
	@SuppressWarnings("rawtypes")
	@FXML
	public void redoFunction(ActionEvent event){
		UndoRedoStack stack = new UndoRedoStack();
		stack.redo();
	}
	
	public void clearFunction(ActionEvent event) {
		pane.getChildren().clear(); 	
	} 
	
	//Tools				
	@FXML
	public void topLine(ActionEvent event) {
		try {
		TextField txtFd  = new TextField();
		Text text = new Text();
		txtFd.setText("Default Text");		
		text.textProperty().bind(txtFd.textProperty());
		text.getText();
		text.setFont(Font.font("Impact",FontWeight.BOLD,50));
		text.setFill(Color.WHITE);
		text.setStroke(Color.BLACK);
		text.setX(30);
		text.setY(70);
		group.getChildren().add(text);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
	
	//public void bottomLine(ActionEvent event) {}
	
}
