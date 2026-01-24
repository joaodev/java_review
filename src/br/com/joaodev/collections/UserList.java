package br.com.joaodev.collections;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        User u1 = new User("John");

        users.add(u1);
        users.add(new User("Peter"));
        users.add(new User("Ipsum"));
        users.add(new User("Lorem"));

        System.out.println(users.get(3));

        System.out.println(">>>>>" + users.remove(1));
        System.out.println(users.remove(new User("Ipsum")));

        System.out.println(users.contains(new User("Lorem")));

        for (User user : users) {
            System.out.println(user.name);
        }
    }
}
