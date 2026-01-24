package br.com.joaodev.collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add(1.2);
        hs.add(true);
        hs.add("Hello");
        hs.add(1);
        hs.add('A');

        System.out.println("The size is: " + hs.size());
        hs.add("test");
        System.out.println("The size is: " + hs.size());

        System.out.println(hs.remove("Test"));
        System.out.println(hs.remove("test"));
        System.out.println(hs.remove('A'));

        System.out.println("The size is: " + hs.size());

        System.out.println(hs.contains("test"));
        System.out.println(hs.contains("Hello"));
        System.out.println(hs.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(hs);

        //hs.addAll(nums);
        hs.retainAll(nums);
        System.out.println(hs);

        hs.clear();
        System.out.println(hs);
    }
}
