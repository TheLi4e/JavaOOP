package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<String, String> usersList;

    public DataBase() {
        this.usersList = new HashMap<>();
    }

    public void createData (){
        Users user1 = new Users ("John", "afasf");
        Users user2 = new Users ("Johnatahn", "dffaf");
        Users user3 = new Users ("Bob", "123");
        addNewUser(user1.getLogin(), user1.getPassword());
        addNewUser(user2.getLogin(), user2.getPassword());
        addNewUser(user3.getLogin(), user3.getPassword());
    }

    public void addNewUser(String login, String password) {
       usersList.put(login, password);
    }

    public Map<String, String> getUsersList() {
        return usersList;
    }
}
