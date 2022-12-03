package eu.telecomnancy.visualcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FisherYatesShuffle implements ShuffleStrategy {
    public ArrayList<Card> shuffle(ArrayList<Card> deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.size(); i++) {
            int r = i + rand.nextInt(deck.size() - i);
            Collections.swap(deck, i, r);
        }
        System.out.println("FY");
        return deck;
    }
}
