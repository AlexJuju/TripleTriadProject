package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import logic.Game;
import model.Card;

import java.io.File;

public class GlossaryController implements Controller {

    @FXML
    private FlowPane card_list;

    public void initialize() {

        File file = new File("resources/seed.jpg");
        Image image = new Image(file.toURI().toString());
        System.out.println( image );

        Card cartaprova = new Card( 3, 4,2, 6, image);
        card_list.getChildren().add( cartaprova.getCardModel() );
        Card cartaprova1 = new Card( 3, 4,2, 6, null);
        card_list.getChildren().add( cartaprova1.getCardModel() );
        Card cartaprova2 = new Card( 3, 4,2, 6, null);
        card_list.getChildren().add( cartaprova2.getCardModel() );
        card_list.getChildren().add( new ImageView( image ));
    }

    @FXML
    void previousScreen(ActionEvent event) {
        Game.backToMainMenu();
    }

    @FXML
    void buttonSelected(MouseEvent event) {
    }

}