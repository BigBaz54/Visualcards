package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.net.URL;
import java.util.ArrayList;

public class DeckOfCardsBelote extends DeckOfCards {

    public DeckOfCardsBelote(ArrayList<Card> deck) {
        this.nbCards = 32;
        this.deck = deck;
        URL imageFile=getClass().getResource("images/black_joker.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }

    }

    public DeckOfCardsBelote() {
        this.nbCards = 32;
        deck = new ArrayList<>();
        for(CardBeloteColor color : CardBeloteColor.values()) {
            for (CardBeloteValue value : CardBeloteValue.values()) {
                deck.add(new CardBelote(value,color));
            }
        }
        URL imageFile=getClass().getResource("images/black_joker.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }
    }
}
