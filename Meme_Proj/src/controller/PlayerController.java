package controller;

import model.PlayerModel;
import model.TournamentRunnerModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;

import java.util.ArrayList;

import application.Main;
import javafx.collections.FXCollections;
public class PlayerController implements EventHandler<ActionEvent> {
	@FXML
	private TextField tf;
	@FXML
	private ListView<String> list = new ListView<String>();
	public ArrayList<PlayerModel> playerlist = new ArrayList<PlayerModel>();
	
	public PlayerController() {
		super();
	}
	

	@Override
	public void handle(ActionEvent event) {
		// ignore
	}
	
	public void okButtonHandle(ActionEvent event) {
		PlayerModel player;
		if (!tf.getText().isEmpty()) {
			 player = new PlayerModel(tf.getText());
		}else {
			player = null;
		}
		if (player != null) {
			if (playerlist.size() < 16) {
				playerlist.add(player);
			}
		}
		
		tf.clear();
		System.out.println(player);
		ObservableList<String> items;
		if(playerlist.size() == 1) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString());
		}else if(playerlist.size() == 2) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString());
		}else if(playerlist.size() == 3) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString());
		}else if(playerlist.size() == 4) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString());
		}else if(playerlist.size() == 5) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString());
		}else if(playerlist.size() == 6) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString());
		}else if(playerlist.size() == 7) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString());
		}else if(playerlist.size() == 8) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString());
		}else if(playerlist.size() == 9) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString());
		}else if(playerlist.size() == 10) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString());
		}else if(playerlist.size() == 11) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString());
		}else if(playerlist.size() == 12) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString()
					, playerlist.get(11).toString());
		}else if(playerlist.size() == 13) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString()
					, playerlist.get(11).toString()
					, playerlist.get(12).toString());
		}else if(playerlist.size() == 14) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString()
					, playerlist.get(11).toString()
					, playerlist.get(12).toString()
					, playerlist.get(13).toString());
		}else if(playerlist.size() == 15) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString()
					, playerlist.get(11).toString()
					, playerlist.get(12).toString()
					, playerlist.get(13).toString()
					, playerlist.get(14).toString());
		}else if(playerlist.size() == 16) {
			items = FXCollections.observableArrayList(playerlist.get(0).toString()
					, playerlist.get(1).toString()
					, playerlist.get(2).toString()
					, playerlist.get(3).toString()
					, playerlist.get(4).toString()
					, playerlist.get(5).toString()
					, playerlist.get(6).toString()
					, playerlist.get(7).toString()
					, playerlist.get(8).toString()
					, playerlist.get(9).toString()
					, playerlist.get(10).toString()
					, playerlist.get(11).toString()
					, playerlist.get(12).toString()
					, playerlist.get(13).toString()
					, playerlist.get(14).toString()
					, playerlist.get(15).toString());
		}else {
			items = FXCollections.observableArrayList("");
		}
		list.setItems(items);
	}
	public void playButtonHandle(ActionEvent event) {
		System.out.println("play clicked");
		//TournamentRunnerModel tourn = new TournamentRunnerModel(playerlist);
		try {
			Parent root;
			if (playerlist.size() > 2 && playerlist.size() <= 4) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn4.fxml"));
			}else if(playerlist.size() > 4 && playerlist.size() <= 8) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn8.fxml"));
			}else if(playerlist.size() > 8 && playerlist.size() <= 16) {
				root = FXMLLoader.load(getClass().getResource("../view/tourn16.fxml"));
			}else {
				root = FXMLLoader.load(getClass().getResource("../view/Mode.fxml"));
			}
			Main.stage.setScene(new Scene(root, 1000,800));
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
