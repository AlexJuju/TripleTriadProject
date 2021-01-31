package application;

import config.Screen;
import controller.Controller;
import controller.MainMenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.GraphicHandler;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
        primaryStage.setTitle("Triple Triad");
        primaryStage.setScene( GraphicHandler.getScene( Screen.MAIN_MENU ) );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
