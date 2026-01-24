package br.com.joaodev.collections;

import java.util.Objects;

public class User {

   String name;

   User(String name) {
       this.name = name;
   }

   public String toString() {
       return "My name is " + this.name + ".";
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
