package application;
	
import controller.CreateControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			//FXMLLoader createLoader = new FXMLLoader(getClass().getResource("Welcome"));
			//root.setCenter(createLoader.load());
			//CreateControl createController = createController.getController();
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			primaryStage.show();
			Canvas canvas = new Canvas();
			canvas.setWidth(800);
			canvas.setHeight(500);
			
			//GraphicsContext gc = canvas.getGraphicsContext2D();
		
			
			root.getChildren().add(canvas);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
