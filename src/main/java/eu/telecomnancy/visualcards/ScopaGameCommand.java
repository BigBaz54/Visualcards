package eu.telecomnancy.visualcards;

public class ScopaGameCommand extends Command {

    ScopaGameCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        saveBackup();
        jeu.updateGame(new DeckOfCardsScopa());
        jeu.history.push(this);
    }
}