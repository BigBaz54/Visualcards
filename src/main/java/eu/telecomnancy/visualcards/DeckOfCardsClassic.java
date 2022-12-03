package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.net.URL;
import java.util.ArrayList;

public class DeckOfCardsClassic extends DeckOfCards {

    public DeckOfCardsClassic(ArrayList<Card> deck) {
        this.nbCards = 52;
        this.deck = deck;
        URL imageFile=getClass().getResource("images/black_joker.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }

    }

    public DeckOfCardsClassic() {
        this.nbCards = 52;
        deck = new ArrayList<>();
        for(CardClassicColor color : CardClassicColor.values()) {
            for (CardClassicValue value : CardClassicValue.values()) {
                deck.add(new CardClassic(value,color));
            }
        }
        URL imageFile=getClass().getResource("images/black_joker.png");
        if (imageFile!=null) {
            backOfCardImage = new Image(imageFile.toString());
        }
    }
}
