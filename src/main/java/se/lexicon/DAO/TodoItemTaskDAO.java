package se.lexicon.DAO;

import se.lexicon.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findByID(int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(boolean assigned);
    Collection<TodoItemTask> findByPersonID(int id);
    void remove(int id);
}
