package se.lexicon;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null){
            throw new IllegalArgumentException("Title was null.");
        }
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null){
            throw new IllegalArgumentException("deadLine was null.");
        }
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public boolean isOverdue(){
        if (LocalDate.now().isBefore(deadLine)){
            return false;
        } else
            return true;
    }
    public void getSummary(){
        System.out.println(
                "ID: " + id
                + " Title: " + title
                + " Taskdescription: " + taskDescription
                + " Due on: " + deadLine
                + " Is done: " + done
                + " Owner: " + creator
        );
    }
}
