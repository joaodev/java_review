package br.com.joaodev.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<Integer, String>();

        users.put(1, "John");
        users.put(2, "Peter");
        users.put(3, "Lorem");
        users.put(4, "Ipsum");
        users.put(5, "Dolor");

        System.out.println(users.get(2));
        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("Lorem"));

        System.out.println(users.remove(4));
        System.out.println(users.remove(5, "Dolor"));

        for (int key : users.keySet()) {
            System.out.println(key);
        }

        for (String value : users.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
