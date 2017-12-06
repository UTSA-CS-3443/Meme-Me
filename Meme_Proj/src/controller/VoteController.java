package controller;
import application.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import model.VoteModel;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
/**
 * A class that controller the vote window
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
	public class VoteController {	
		VoteModel model = new VoteModel(1, 2);
	    @FXML
	    private Slider mySlider;
	    @FXML
	    private TextField textField;
	    /**
	     * Initializes a slider and text field into the vote page
	     */
	    public void initialize() {
	        mySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
	            textField.setText(Double.toString(newValue.intValue()));
	        });	    
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Vote.fxml"));
			Main.stage.setScene(new Scene(root, 1000, 800));
			Main.stage.setTitle("Vote");
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	    }	
	}
	


 
