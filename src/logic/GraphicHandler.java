package logic;

import controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.io.InputStream;

public class GraphicHandler {

    private static Controller loadedController;

    public static Scene getScene( int resource ) {

        String path = ResourcesHandler.getPath( resource );
        Parent root = null;
        try {
            InputStream inputStream = GraphicHandler.class.getResourceAsStream( path );
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
