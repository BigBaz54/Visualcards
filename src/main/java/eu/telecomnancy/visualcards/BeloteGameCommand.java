package eu.telecomnancy.visualcards;

public class BeloteGameCommand extends Command {

    BeloteGameCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        saveBackup();
        jeu.updateGame(new DeckOfCardsBelote());
        jeu.history.push(this);
    }
}
