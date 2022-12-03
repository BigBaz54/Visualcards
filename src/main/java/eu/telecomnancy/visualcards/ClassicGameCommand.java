package eu.telecomnancy.visualcards;

public class ClassicGameCommand extends Command {

    ClassicGameCommand(DeckOfCards jeu) {
        super(jeu);
    }

    @Override
    void execute() {
        saveBackup();
        jeu.updateGame(new DeckOfCardsClassic());
        jeu.history.push(this);
    }
}
