package br.com.joaodev.arrays.others;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "John";
        user1.email = "john@test.com";

        User user2 = new User();
        user2.name = "John";
        user2.email = "john@test.com";

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));

        System.out.println(user2.equals(new Date()));
    }
}
