package eu.telecomnancy.visualcards;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        DeckOfCards deckOfCards = new DeckOfCardsClassic();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DeckView.fxml"));
        loader.setControllerFactory(iC -> new DeckView(deckOfCards));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Deck Of Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
