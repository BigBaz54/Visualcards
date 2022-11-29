package eu.telecomnancy.visualcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FisherYatesShuffle implements ShuffleStrategy {
    public ArrayList<Card> shuffle(ArrayList<Card> deck) {
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int r = i + rand.nextInt(52 - i);
            Collections.swap(deck, i, r);
        }
        System.out.println("FY");
        return deck;
    }
}
