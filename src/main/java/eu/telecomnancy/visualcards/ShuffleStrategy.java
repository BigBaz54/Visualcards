package eu.telecomnancy.visualcards;

import java.util.ArrayList;

public interface ShuffleStrategy {
    ArrayList<Card> shuffle(ArrayList<Card> deck);
}
