package application;

import javafx.application.Application;
import javafx.stage.Stage;
import logic.Game;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Triple Triad");
        primaryStage.setScene( Game.getScene() );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
