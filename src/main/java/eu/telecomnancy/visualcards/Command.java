package eu.telecomnancy.visualcards;

public abstract class Command {
    DeckOfCards jeu;
    BackupDeck backup;

    Command(DeckOfCards jeu) {
        this.jeu = jeu;
    }
    abstract void execute();

    protected void saveBackup() {
        backup = new BackupDeck(jeu.getDeck(), jeu.getBackOfCardImage(), jeu.getShuffleStrategy(), jeu.getTopCard(), jeu.getActiveCard(), jeu.getNbCards());
    }

    public String toString() {
        return "\n"+getClass().getName();
    }
}
