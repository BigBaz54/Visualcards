package eu.telecomnancy.visualcards;

public class ShuffleCommand extends Command {

    public ShuffleCommand(DeckOfCards jeu) {
        super(jeu);
    }

    public void execute() {
        jeu.shuffle();
    }
}
