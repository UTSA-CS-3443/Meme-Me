
package controller;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import application.Main;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.PlayerModel;

import java.util.ArrayList;
public class CreateByeController implements EventHandler<ActionEvent>{
	
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
	 /*@FXML
	 private Button top;
	 @FXML 
	 private Button bottom; 
	 @FXML 
	 private Button middle;*/
	 @FXML
	 private TextField tf1;
	 @FXML
	 private TextField tf2;
	 @FXML
	 private TextField tf3;
	 @FXML 
	 private Button viewMemes;
	//TODO: FILE 
	public Image original;
	
	public Image saved;
	
	public ImageView imgView;
	public Image img;
	public int sizeTourn;
	public PlayerModel play1;
	public PlayerModel play2;

	public ArrayList<Image> imagelist = new ArrayList<Image>();
	private ArrayList<PlayerModel> players = new ArrayList<PlayerModel>();
	TournamentRunnerModel2 tourn;
	int iMatch;
	int numRound;
	ArrayList<PlayerModel> winnerList = new ArrayList<PlayerModel>();
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
	public void savefunc(ActionEvent event) {
		Image image = pane.snapshot(new SnapshotParameters(), null);
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image");
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(image,
                    null), "png", file);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
	}
	public void doneHandle(ActionEvent event) {
		System.out.println("done pressed");
		if(this.sizeTourn == 4) {
			try {
				Parent root;
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn4.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn4Controller controller = fxmlLoader.<Tourn4Controller>getController();
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}else if(this.sizeTourn == 8) {
			try {
				Parent root;
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn8.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn8Controller controller = fxmlLoader.<Tourn8Controller>getController();
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}else if(this.sizeTourn == 16) {
			try {
				Parent root;
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/tourn16.fxml")); 
				root = (Parent)fxmlLoader.load(); 
				Tourn16Controller controller = fxmlLoader.<Tourn16Controller>getController();
				controller.setUser4(this.iMatch, 1);
				controller.setUser(this.players, this.numRound);
				controller.setUser6(this.winnerList);
				
				//this.tourn = new TournamentRunnerModel2(this.players, this.iMatch, this.winnerList);
				Main.stage.setScene(new Scene(root, 1000,800));
				Main.stage.show();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void closeFunction(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	//Edit Menu	
	public void undoFunction(ActionEvent event) {	}
	
	public void redoFunction(ActionEvent event){	}
	// this removes references, it needs to reset values
	public void clearFunction(ActionEvent event) {
		imgView.setImage(null);
		tf1.clear();
		tf2.clear();
		tf3.clear();
		//pane.getChildren().clear(); 
		System.out.print("Cleared All");		
	} 
	
	public void insertLine(ActionEvent event) {
		try {
	
		Text text1 = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		text1.textProperty().bind(tf1.textProperty());
		text1.getText();
		text1.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text1.setFill(Color.WHITE);
		text1.setStroke(Color.BLACK);
		text1.setX(50);
		text1.setY(50);
		group.getChildren().add(text1);
		
		text2.textProperty().bind(tf2.textProperty());
		text2.getText();
		text2.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text2.setFill(Color.WHITE);
		text2.setStroke(Color.BLACK);
		text2.setX(50);
		text2.setY(375);
		group.getChildren().add(text2);
		
		text3.textProperty().bind(tf3.textProperty());
		text3.getText();
		text3.setFont(Font.font("Impact",FontWeight.BOLD,70));
		text3.setFill(Color.WHITE);
		text3.setStroke(Color.BLACK);
		text3.setX(50);
		text3.setY(550);
		group.getChildren().add(text3);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	/*public void setUser2(PlayerModel player1, PlayerModel player2) {
		this.play1 = player1;
		this.play2 = player2;
	}*/
	public void setUser3(ArrayList<PlayerModel> playerlist, int matchNum, int size) {
		this.players = playerlist;
		
		this.iMatch = matchNum;
		this.sizeTourn = size;
	}
	public void setUser2(int numRound) {
		this.numRound = numRound;
	}
	public void setUser4(ArrayList<PlayerModel> winners) {
		this.winnerList = winners;
	}
	
	
}
