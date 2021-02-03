package model;

import config.Resource;
import controller.CardController;
import controller.Controller;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import logic.GraphicHandler;

public class Card {

    private final int topValue;
    private final int botValue;
    private final int leftValue;
    private final int rightValue;
    private final Parent cardModel;
    private final Controller controller;

    public Card (int top, int bot, int left, int right, Image img ) {
        this.topValue = top;
        this.botValue = bot;
        this.leftValue = left;
        this.rightValue = right;
        this.cardModel = GraphicHandler.loadResource( Resource.CARD_MODEL );
        this.controller = GraphicHandler.getLoadedController();

        if ( !( controller instanceof CardController ) ) System.out.println( "Card: LoadedController mismatch!");
        else {
            ((CardController) controller).setCardNumbers( topValue, botValue, leftValue, rightValue );
            ((CardController) controller).setImageArea( img );
        }
    }

    public int getTopValue() {
        return topValue;
    }

    public int getBotValue() {
        return botValue;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }

    public Parent getCardModel() {
        return cardModel;
    }
}
