package eu.telecomnancy.visualcards;

public class FisherYatesShuffleCommand extends Command {
    FisherYatesShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        jeu.setShuffleStrategy(new FisherYatesShuffle());
    }
}
