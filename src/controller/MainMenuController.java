package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import logic.Game;

public class MainMenuController implements Controller {

    @FXML
    void startNewGame(ActionEvent event) {
        Game.newGame();
        System.out.println( "New Game.");
    }

    @FXML
    void openGlossary(ActionEvent event) {
        Game.openGlossary();
    }

    @FXML
    void openSetting(ActionEvent event) {
        Game.openSetting();
    }

    @FXML
    void buttonSelected(MouseEvent event) {
        System.out.println( "Stampa prova.");
    }


}
