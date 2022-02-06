package se.lexicon.sequencers;

public class TodoItemIdSequencer {

    private int currentID;

    private int nextID() {
        return currentID++;
    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
}
