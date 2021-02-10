package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardController implements Controller{

    @FXML
    private Label topNumber;

    @FXML
    private Label leftNumber;

    @FXML
    private Label botNumber;

    @FXML
    private Label rightNumber;

    @FXML
    private ImageView imageArea;

    public void setCardNumbers ( int top, int bot, int left, int right ) {
        topNumber.setText(String.valueOf(top));
        botNumber.setText(String.valueOf(bot));
        leftNumber.setText(String.valueOf(left));
        rightNumber.setText(String.valueOf(right));
    }

    public void setImageArea ( Image img ) {
        imageArea.setImage(img);
        System.out.println("image set");
    }

}