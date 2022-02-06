package se.lexicon.DAO;

import se.lexicon.Person;
import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public class TodoItemDAOImplementation implements TodoItemDAO{

    Collection<TodoItem> collectionList;

    @Override
    public TodoItem persist(TodoItem todoItem) {
        collectionList.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findByID(int id) {
        for (TodoItem todoItem : collectionList) {
            if(todoItem.getId() == id){
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return collectionList;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        Collection<TodoItem> foundMatches = null;
        for (TodoItem todoItem : collectionList) {
            if(todoItem.isDone() == true){
                foundMatches.add(todoItem);
                return collectionList;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        Collection<TodoItem> foundMatches = null;
        for (TodoItem todoItem : collectionList) {
            if(todoItem.getTitle().equals(title)){
                foundMatches.add(todoItem);
                return foundMatches;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonID(int id) {
        Collection<TodoItem> foundMatches = null;
        for (TodoItem todoItem : collectionList) {
            if (todoItem.getId() == id){
                foundMatches.add(todoItem);
                return foundMatches;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        Collection<TodoItem> foundMatches = null;
        for (TodoItem todoItem : collectionList) {
            if(todoItem.getDeadLine().isBefore(date)){
                foundMatches.add(todoItem);
                return foundMatches;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        Collection<TodoItem> foundMatches = null;
        for (TodoItem todoItem : collectionList) {
            if(todoItem.getDeadLine().isAfter(date)){
                foundMatches.add(todoItem);
                return foundMatches;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        for (TodoItem todoItem : collectionList) {
            if(todoItem.getId() == id){
                collectionList.remove(todoItem);
            }
        }
    }

}
