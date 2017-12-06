package controller;
import java.io.File;
import java.io.IOException;
import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * A controller class that directs user to view their meme
 * @author Katie Yarbough: Team Lead
 * @author Danielle Lawrence
 * @author Cheyenne Sanchez
 * @author Paul Swenson
 */
public class ViewMeme implements EventHandler<ActionEvent>{
	public ImageView imgView;
	@Override
	public void handle(ActionEvent event) {
		//For implements leave alone
	}
	/**
	 * A method that opens and views a jpg, png, or gif image file
	 * @param event Event to occur
	 * @throws IOException An exception to be thrown
	 */
	public void fileOpen(ActionEvent event) throws IOException{
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
	/**
	 * An event that will close the application
	 * @param event Event to occur once clicked
	 */
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
	/**
	 * Redirects user to the Welcome page
	 * @param event An event to occur once clicked
	 */
	public void goToWelcome(ActionEvent event) {
		try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource("../view/WelcomeView.fxml"));
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.setTitle("Welcome to MemeMe");
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Redirects user to the mode page 
	 * @param event An event to occur once clicked
	 */
	public void goToMode(ActionEvent event) {
		try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource("../view/Mode.fxml"));
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.setTitle("Choose Your Mode");
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}