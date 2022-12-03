package eu.telecomnancy.visualcards;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;

// Représente un jeu de cartes. Une variable référence l'image représentant le dos d'une carte.
public abstract class DeckOfCards extends Observed {

    protected ArrayList<Card> deck;
    protected Image backOfCardImage;
    protected ShuffleStrategy shuffleStrategy = new DefaultShuffle();
    protected int topCard=0;
    protected Card activeCard;
    protected CommandHistory history = new CommandHistory();
    protected int nbCards;

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
        alertObservers();
    }

    public void setNbCards(int nbCards) {
        this.nbCards = nbCards;
        alertObservers();
    }

    public int getNbCards() {
        return nbCards;
    }

    public Image getBackOfCardImage() {
        return backOfCardImage;
    }

    public void setBackOfCardImage(Image backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }

    public Card dealTopCard()
    {
        Card result=deck.get(topCard);
        topCard=topCard+1;
        if (topCard>nbCards-1) {
            topCard=0;
        }
        return result;
    }

    public Card getActiveCard() {
        return this.activeCard;
    }

    public void setTopCard(int topCard) {
        this.topCard = topCard;
    }

    public int getTopCard() {
        return this.topCard;
    }

    public void setShuffleStrategy(ShuffleStrategy strat) {
        this.shuffleStrategy = strat;
    }

    public ShuffleStrategy getShuffleStrategy() {
        return this.shuffleStrategy;
    }

    public void shuffle() {
        this.shuffleStrategy.shuffle(deck);
        alertObservers();
    }

    public void nextCard() {
        this.activeCard = dealTopCard();
        alertObservers();
    }

    public void randomCard() {
        this.activeCard = drawARandomCard();
        alertObservers();
    }

    public Card drawACard(int i) {
        return deck.get(i);
    }

    public Card drawARandomCard() {
        var index=new Random().nextInt(nbCards);
        return deck.get(index);
    }

    public void undo() {
        BackupDeck commandBackup = history.pop().backup;
        deck = commandBackup.deck;
        backOfCardImage = commandBackup.backOfCardImage;
        shuffleStrategy = commandBackup.shuffleStrategy;;
        topCard = commandBackup.topCard;;
        activeCard = commandBackup.activeCard;
        nbCards = commandBackup.nbCards;
        alertObservers();
    }

    public void printHistory() {
        System.out.println(history.toString());
    }

    public void updateGame(DeckOfCards newGame) {
        this.topCard = 0;
        this.deck = newGame.deck;
        this.nbCards = newGame.nbCards;
        this.backOfCardImage = newGame.backOfCardImage;
        this.activeCard = newGame.activeCard;
        alertObservers();
    }

}
