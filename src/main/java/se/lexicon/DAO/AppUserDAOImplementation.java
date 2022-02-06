package se.lexicon.DAO;

import se.lexicon.AppUser;

import java.util.Collection;
import java.util.Collections;

public class AppUserDAOImplementation implements AppUserDAO{

    Collection<AppUser> collectionList;

    @Override
    public AppUser persist(AppUser appUser) {
        collectionList.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser appUser: collectionList) {
            if(appUser.equals(username)){
                return appUser;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return collectionList;
    }

    @Override
    public void remove(String username) {
        for (AppUser appUser : collectionList){
            if(appUser.equals(username)){
                collectionList.remove(appUser);
            }
        }
    }
}
