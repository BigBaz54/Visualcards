package eu.telecomnancy.visualcards;

public class FisherYatesShuffleCommand extends Command {
    FisherYatesShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        saveBackup();
        jeu.setShuffleStrategy(new FisherYatesShuffle());
        jeu.history.push(this);
    }
}
