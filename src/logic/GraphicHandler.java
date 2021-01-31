package logic;

import controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GraphicHandler {

    private static Controller loadedController;

    public static Scene getScene( int screen ) {

        String path = ResourcesHandler.getPath( screen );
        Parent root = null;
        try {
            FileInputStream inputStream = new FileInputStream( path );
            FXMLLoader loader = new FXMLLoader();

            root = loader.load( inputStream );
            loadedController = loader.getController();
            if ( loadedController == null ) System.out.println( "GraphicHandler: Controller not saved for path -> " + path );

            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println( "GraphicHandler: Error loading given screen path -> " + path );
        }

        return new Scene( root );
    }

    public static Controller getLoadedController () {
        return loadedController;
    }
}
