package eu.telecomnancy.visualcards;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<Command>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public String toString() {
        return "CommandHistory{" +
                "history=" + history.toString() +
                '}';
    }

    public boolean empty() {
        return history.empty();
    }
}
