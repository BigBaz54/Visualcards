package eu.telecomnancy.visualcards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckView implements Initializable, Observer {
    @FXML
    private ImageView deckImageView;
    @FXML
    private ImageView activeCardImageView;
    @FXML
    private GridPane cardPane;
    private DeckOfCards jeu;

    public void initialize(URL location, ResourceBundle resources) {
        this.jeu = new DeckOfCards();
        this.jeu.addObserver(this);
        this.jeu.shuffle();
    }

    @Override
    public void react() {
        cardPane.getChildren().clear();
        for (int i = 0; i < 4; i++) {
            cardPane.addRow(i);
            cardPane.setVgap(10);
            cardPane.setHgap(10);
            cardPane.gridLinesVisibleProperty().setValue(true);
            for (int j = 0; j < 13; j++) {
                BorderPane cardborder = new BorderPane();
                cardborder.setStyle("-fx-border-color: black");
                ImageView cardj = new ImageView();
                cardj.setFitHeight(80);
                cardj.setFitWidth(55);
                cardj.setImage(jeu.getDeck().get(i * 13 + j).getImage());
                cardborder.setCenter(cardj);
                cardPane.addColumn(j, cardborder);
            }
            if (jeu.getActiveCard() != null) {
                activeCardImageView.setImage(jeu.activeCard.getImage());
            }
            deckImageView.setImage(jeu.getBackOfCardImage());
        }
    }

    public void shuffle(ActionEvent actionEvent) {
        jeu.shuffle();
    }

    public void nextCard(ActionEvent actionEvent) {
        jeu.nextCard();
    }

    public void toggleFisherYatesShuffle() {
        jeu.setShuffleStrategy(new FisherYatesShuffle());
    }

    public void toggleDefaultShuffle() {
        jeu.setShuffleStrategy(new DefaultShuffle());
    }
}
