package application;

import config.Resource;
import javafx.application.Application;
import javafx.stage.Stage;
import logic.GraphicHandler;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Triple Triad");
        primaryStage.setScene( GraphicHandler.getScene( Resource.MAIN_MENU_SCREEN ) );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
