package se.lexicon.DAO;

import se.lexicon.Person;

import java.util.Collection;

public class PersonDAOImplementation implements PersonDAO{

    Collection<Person> collectionList;

    @Override
    public Person persist(Person person) {
        collectionList.add(person);
        return person;
    }

    @Override
    public Person findByID(int id) {
        for (Person person : collectionList) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : collectionList) {
            if(person.getEmail().equals(email)){
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return collectionList;
    }

    @Override
    public void remove(int id) {
        for (Person person : collectionList) {
            if(person.getId() == id){
                collectionList.remove(person);
            }
        }
    }
}
