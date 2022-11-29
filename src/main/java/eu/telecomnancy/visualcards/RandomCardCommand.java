package eu.telecomnancy.visualcards;

public class RandomCardCommand extends Command {

    RandomCardCommand(DeckOfCards jeu) {
        super(jeu);
    }

    void execute() {
        jeu.randomCard();
    }
}
