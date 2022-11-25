package eu.telecomnancy.visualcards;

import java.util.List;

public abstract class Observed {
    private List<Observer> obsList;

    public void addObserver(Observer obs) {
        obsList.add(obs);
    }

    public void alertObservers() {
        for (Observer o : obsList) {
            o.react();
        }
    }
}
