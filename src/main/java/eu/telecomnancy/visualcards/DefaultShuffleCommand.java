package eu.telecomnancy.visualcards;

public class DefaultShuffleCommand extends Command {
    DefaultShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        jeu.setShuffleStrategy(new DefaultShuffle());
    }
}
