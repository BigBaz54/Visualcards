package eu.telecomnancy.visualcards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
        this.react();
    }

    public DeckView(DeckOfCards jeu) {
        this.jeu = jeu;
        this.jeu.addObserver(this);
    }

    @Override
    public void react() {
        cardPane.getChildren().clear();
        int nbRows = jeu.nbCards>52 ? 5 : 4;
        int nbColumn = (int) Math.ceil(jeu.getNbCards()/4);
        for (int i = 0; i < nbRows; i++) {
            cardPane.addRow(i);
            cardPane.setVgap(5);
            cardPane.setHgap(5);
            cardPane.gridLinesVisibleProperty().setValue(false);
            for (int j = 0; j < nbColumn; j++) {
                if ((i * nbColumn + j)<jeu.nbCards) {
                    BorderPane cardborder = new BorderPane();
                    cardborder.setStyle("-fx-border-color: black; -fx-border-radius: 5px");
                    ImageView cardj = new ImageView();
                    cardj.setFitHeight(80);
                    cardj.setFitWidth(55);
                    cardj.setImage(jeu.getDeck().get(i * nbColumn + j).getImage());
                    cardborder.setCenter(cardj);
                    cardPane.addColumn(j, cardborder);
                }
            }
            if (jeu.getActiveCard() != null) {
                activeCardImageView.setImage(jeu.activeCard.getImage());
            } else {
                activeCardImageView.setImage(null);
            }
            deckImageView.setImage(jeu.getBackOfCardImage());
        }
    }

    public void shuffle() {
        new ShuffleCommand(jeu).execute();
    }

    public void nextCard() {
        new NextCardCommand(jeu).execute();
    }

    public void randomCard() {
        new RandomCardCommand(jeu).execute();
    }

    public void toggleFisherYatesShuffle() {
        new FisherYatesShuffleCommand(jeu).execute();
    }

    public void toggleDefaultShuffle() {
        new DefaultShuffleCommand(jeu).execute();
    }

    public void undo() {
        new UndoCommand(jeu).execute();
    }

    public void printHistory() {
        jeu.printHistory();
    }

    public void classicGame() {
        new ClassicGameCommand(jeu).execute();
    }

    public void scopaGame() {
        new ScopaGameCommand(jeu).execute();
    }

    public void beloteGame() {
        new BeloteGameCommand(jeu).execute();
    }
}
