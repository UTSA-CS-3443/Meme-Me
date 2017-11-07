package view;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.CreateModel;

public class CreateView extends Stage {

	private CreateModel model;
	
	
	private GridPane gridPane;

	@FXML private Button Undo;
	@FXML private Button Redo;
	@FXML private Canvas canvas;
	@FXML private Button Clear;
	@FXML private ComboBox fontSize;
	
	
	private static final String[] fontsNames = {"Small",
			"Medium", "Large"};
	
	
	
	public CreateView(CreateModel model) {
		super();
		this.model = model;
		
		
	
	
	}
		
	
	
}
