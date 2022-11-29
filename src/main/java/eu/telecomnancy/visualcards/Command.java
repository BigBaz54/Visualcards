package eu.telecomnancy.visualcards;

public abstract class Command {
    DeckOfCards jeu;

    Command(DeckOfCards jeu) {
        this.jeu = jeu;
    }
    abstract void execute();
}
