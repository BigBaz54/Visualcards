package eu.telecomnancy.visualcards;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public abstract class Card {

    protected Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract List<String> getValidFaceNames();
    public abstract List<String> getValidSuits();
}
