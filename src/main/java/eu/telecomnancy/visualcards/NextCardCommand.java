package eu.telecomnancy.visualcards;

public class NextCardCommand extends Command {

    public NextCardCommand(DeckOfCards jeu) {
        super(jeu);
    }

    void execute() {
        saveBackup();
        jeu.nextCard();
        jeu.history.push(this);
    }
}
