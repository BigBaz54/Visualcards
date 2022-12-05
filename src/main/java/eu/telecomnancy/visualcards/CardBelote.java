package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class CardBelote extends Card {
    protected String suit;
    protected CardBeloteColor color;
    protected CardBeloteValue value;

    public CardBelote(CardBeloteValue value, CardBeloteColor color) {
        setValue(value);
        setColor(color);
        String fileName = getValidFaceNames().get(value.ordinal()) + "_of_"+getValidSuits().get(color.ordinal())+".png";
        image = new Image(getClass().getResource("images/"+fileName).toString());
    }

    public String getSuit() {
        return suit;
    }


    public CardBeloteColor getColor() {
        return color;
    }

    public void setColor(CardBeloteColor color) {
        this.color = color;
    }

    public CardBeloteValue getValue() {
        return value;
    }

    public void setValue(CardBeloteValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardBelote{" +
                "color=" + getColor() +
                ", value=" + getValue() +
                '}';
    }

    public String getFaceName() {
        return getValidFaceNames().get(getValue().ordinal());
    }

    public List<String> getValidFaceNames()
    {
        return Arrays.asList("7","8","9","10","jack",
                "queen","king","ace");
    }

    public List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }
}
