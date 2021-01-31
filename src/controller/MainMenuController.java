package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import logic.Game;

public class MainMenuController implements Controller {

    @FXML
    void startNewGame(ActionEvent event) {
        Game.newGame();
    }

    @FXML
    void openGlossary(ActionEvent event) {
        Game.openGlossary();
    }

    @FXML
    void openSetting(ActionEvent event) {
        Game.openSetting();
    }

}
