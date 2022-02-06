package se.lexicon.DAO;

import se.lexicon.TodoItem;
import se.lexicon.TodoItemTask;

import java.util.Collection;

public class TodoItemTaskDAOImplementation implements TodoItemTaskDAO{

    Collection<TodoItemTask> collectionList;

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        collectionList.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findByID(int id) {
        for (TodoItemTask todoItemTask : collectionList) {
            if(todoItemTask.getId() == id){
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return collectionList;
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean assigned) {
        Collection<TodoItemTask> foundMatches = null;
        for (TodoItemTask todoItemTask : collectionList) {
            if(todoItemTask.isAssigned() == true){
                foundMatches.add(todoItemTask);
                return collectionList;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonID(int id) {
        Collection<TodoItemTask> foundMatches = null;
        for (TodoItemTask todoItemTask : collectionList) {
            if (todoItemTask.getId() == id){
                foundMatches.add(todoItemTask);
                return foundMatches;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        for (TodoItemTask todoItemTask : collectionList) {
            if(todoItemTask.getId() == id){
                collectionList.remove(todoItemTask);
            }
        }
    }
}
