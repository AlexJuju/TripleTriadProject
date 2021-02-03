package application;

import config.Resource;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.GraphicHandler;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Triple Triad");
        primaryStage.setScene( new Scene( GraphicHandler.loadResource( Resource.MAIN_MENU_SCREEN ) ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
