package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class CardScopa extends Card {
    protected String suit;
    protected CardScopaColor color;
    protected CardScopaValue value;

    public CardScopa(CardScopaValue value, CardScopaColor color) {
        setValue(value);
        setColor(color);
        String fileName = getValidFaceNames().get(value.ordinal()) + "_de_"+getValidSuits().get(color.ordinal())+".png";
        image = new Image(getClass().getResource("images/"+fileName).toString());
    }

    public String getSuit() {
        return suit;
    }


    public CardScopaColor getColor() {
        return color;
    }

    public void setColor(CardScopaColor color) {
        this.color = color;
    }

    public CardScopaValue getValue() {
        return value;
    }

    public void setValue(CardScopaValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardScopa{" +
                "color=" + getColor() +
                ", value=" + getValue() +
                '}';
    }

    public String getFaceName() {
        return getValidFaceNames().get(getValue().ordinal());
    }

    public List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","cavalier","valet","roi","as");
    }

    public List<String> getValidSuits()
    {
        return Arrays.asList("coupes","deniers","epees","batons");
    }
}
