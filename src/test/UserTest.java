package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserTest {

    public static void main(String[] args) {

        User user1 = new User(1, "Alex", 1000.0);
        User user2 = new User(2, "Jeeva", 800.0);
        User user3 = new User(3, "Xin", 950.0);
        User user4 = new User(3, "Brian", 750.0);
        User user5 = new User(3, "Sandip", 700.0);

        List<User> userList = new ArrayList<>();


        userList.add(user2);
        userList.add(user3);
        userList.add(user1);
        userList.add(user4);
        userList.add(user5);

        for(User user: userList){
            System.out.println(user);
        }

        System.out.println("-------------------------");

        //I want to sort it based on the id

        Collections.sort(userList);

        for(User user: userList){
            System.out.println(user);
        }




    }
}
