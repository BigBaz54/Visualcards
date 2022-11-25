package eu.telecomnancy.visualcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class DeckView implements Observer {
    @FXML
    private Button nextCardButton;
    @FXML
    private ImageView deckImageView;
    @FXML
    private ImageView activeCardImageView;
    @FXML
    private GridPane cardPane;
    private DeckOfCards jeu;

    public DeckView(DeckOfCards jeu) {
        this.jeu = jeu;
        this.jeu.addObserver(this);
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
        }
    }
}
