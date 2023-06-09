package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class BackupDeck {
    public ArrayList<Card> deck;
    public Image backOfCardImage;
    public ShuffleStrategy shuffleStrategy;
    int topCard;
    Card activeCard;
    int nbCards;

    public BackupDeck(ArrayList<Card> deck, Image backOfCardImage, ShuffleStrategy shuffleStrategy, int topCard, Card activeCard, int nbCards) {
        this.deck = new ArrayList<>(deck);
        this.backOfCardImage = backOfCardImage;
        this.shuffleStrategy = shuffleStrategy;
        this.topCard = topCard;
        this.activeCard = activeCard;
        this.nbCards = nbCards;
    }
}
