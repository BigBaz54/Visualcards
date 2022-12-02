package eu.telecomnancy.visualcards;

public class ShuffleCommand extends Command {

    public ShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    public void execute() {
        saveBackup();
        jeu.shuffle();
        jeu.history.push(this);
    }
}
