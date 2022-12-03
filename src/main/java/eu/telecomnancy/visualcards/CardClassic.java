package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class CardClassic extends Card {
    protected String suit;
    protected CardClassicColor color;
    protected CardClassicValue value;

    public CardClassic(CardClassicValue value, CardClassicColor color) {
        setValue(value);
        setColor(color);
        String fileName = getValidFaceNames().get(value.ordinal()) + "_of_"+getValidSuits().get(color.ordinal())+".png";
        image = new Image(getClass().getResource("images/"+fileName).toString());
    }

    public String getSuit() {
        return suit;
    }


    public CardClassicColor getColor() {
        return color;
    }

    public void setColor(CardClassicColor color) {
        this.color = color;
    }

    public CardClassicValue getValue() {
        return value;
    }

    public void setValue(CardClassicValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardClassic{" +
                "color=" + getColor() +
                ", value=" + getValue() +
                '}';
    }

    public String getFaceName() {
        return getValidFaceNames().get(getValue().ordinal());
    }

    public List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                "queen","king","ace");
    }

    public List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }
}
