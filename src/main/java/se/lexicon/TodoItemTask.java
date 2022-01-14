package se.lexicon;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoitem;
    private Person assignee;

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoitem() {
        return todoitem;
    }

    public void setTodoitem(TodoItem todoitem) {
        if (todoitem == null){
            throw new IllegalArgumentException("todoitem was null.");
        }
        this.todoitem = todoitem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null){
            throw new IllegalArgumentException("assignee was null.");
        }
        this.assignee = assignee;
    }
    public void getSummary(){
        System.out.println("ID: " + id + " Assigned: " + assigned + " Todoitem: " + todoitem + " Assignee: " + assignee);
    }
}
