package eu.telecomnancy.visualcards;

public class DefaultShuffleCommand extends Command {
    DefaultShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        saveBackup();
        jeu.setShuffleStrategy(new DefaultShuffle());
        jeu.history.push(this);
    }
}
