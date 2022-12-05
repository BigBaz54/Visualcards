package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.net.URL;
import java.util.ArrayList;

public class DeckOfCardsScopa extends DeckOfCards {

    public DeckOfCardsScopa(ArrayList<Card> deck) {
        this.nbCards = 40;
        this.deck = deck;
        URL imageFile=getClass().getResource("images/back_scopa.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }
    }

    public DeckOfCardsScopa() {
        this.nbCards = 40;
        deck = new ArrayList<>();
        for(CardScopaColor color : CardScopaColor.values()) {
            for (CardScopaValue value : CardScopaValue.values()) {
                deck.add(new CardScopa(value,color));
            }
        }
        URL imageFile=getClass().getResource("images/back_scopa.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }
    }
}
