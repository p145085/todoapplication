package se.lexicon;

public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person();
        TodoItem todoitem1 = new TodoItem();
        TodoItemTask todoitemtask1 = new TodoItemTask();
        AppUser appuser1 = new AppUser("populus", "hejsanhoppsan", AppRole.ROLE_APP_ADMIN);


        person1.getSummary();


    }
}
