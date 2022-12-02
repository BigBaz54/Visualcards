package eu.telecomnancy.visualcards;

public class RandomCardCommand extends Command {

    RandomCardCommand(DeckOfCards jeu) {
        super(jeu);
    }

    void execute() {
        saveBackup();
        jeu.randomCard();
        jeu.history.push(this);
    }
}
