package com.lifemgr.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	private Stage primaryStage;
    private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("LifeMgr Desktop Client");


        initRootLayout();

        showMirrorMain();
	}
	
    public void showMirrorMain(){
        try{
            // Load Mirror Main
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/MirrorMain.fxml"));

            AnchorPane mirrorMain = (AnchorPane) loader.load();


        } catch (IOException e){
            e.printStackTrace(); 

        }
    }


	public static void main(String[] args) {
		launch(args);
	}
}
