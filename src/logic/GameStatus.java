package logic;

import config.Resource;
import javafx.scene.Scene;

public class GameStatus {

    private static GameStatus instance;
    private static Scene mainScene;


    private GameStatus () {
        mainScene = new Scene( GraphicHandler.loadResource( Resource.MAIN_MENU_SCREEN ) );

    }

    public static GameStatus getInstance () {
        if( instance == null ) instance = new GameStatus();

        return instance;
    }

    public void setScreen ( int screen ) {
        mainScene.setRoot( GraphicHandler.loadResource( screen ));
    }

    public Scene getMainScene () {
        return mainScene;
    }
}
