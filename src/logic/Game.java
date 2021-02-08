package logic;

import config.Resource;
import javafx.scene.Scene;

public class Game {

    public static Scene getScene () {
        return GameStatus.getInstance().getMainScene();
    }

    public static void newGame() {
    }

    public static void duel() {
    }

    public static void openGlossary() {
        GameStatus.getInstance().setScreen( Resource.GLOSSARY_SCREEN );
    }

    public static void openGuide() {
    }

    public static void openSetting() {
    }

    public static void backToMainMenu() {
        GameStatus.getInstance().setScreen( Resource.MAIN_MENU_SCREEN );
    }

    public static boolean isDuelAvailable() {
        return false;
    }


}
