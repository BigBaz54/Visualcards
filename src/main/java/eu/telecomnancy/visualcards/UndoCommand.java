package eu.telecomnancy.visualcards;

public class UndoCommand extends Command {

    public UndoCommand(DeckOfCards jeu) {
        super(jeu);
    }

    void execute() {
        if (!(jeu.history.empty())) {
            jeu.undo();
        }
    }
}
