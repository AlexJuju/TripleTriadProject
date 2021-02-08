package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;
import logic.Game;

public class GlossaryController implements Controller {

    @FXML
    private FlowPane card_list;

    @FXML
    void previousScreen(ActionEvent event) {
        Game.backToMainMenu();
    }

}