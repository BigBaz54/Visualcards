package eu.telecomnancy.visualcards;

public class NextCardCommand extends Command {

    public NextCardCommand(DeckOfCards jeu) {
        super(jeu);
    }

    void execute() {
        jeu.nextCard();
    }
}
