package se.lexicon.DAO;

import se.lexicon.Person;

import java.util.Collection;

public interface PersonDAO {
    Person persist(Person person);
    Person findByID(int id);
    Person findByEmail(String email);
    Collection<Person> findAll();
    void remove(int id);
}
