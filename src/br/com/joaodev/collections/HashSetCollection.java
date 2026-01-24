package br.com.joaodev.collections;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {

        HashSet<User> users = new HashSet<User>();

        users.add(new User("John"));
        users.add(new User("Peter"));
        users.add(new User("Lorem"));

        boolean contains = users.contains(new User("John"));
        System.out.println(contains);
    }
}
