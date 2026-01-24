package br.com.joaodev.arrays.others;

public class User {

    String name;
    String email;

    public boolean equals(Object obj) {

        if (obj instanceof User) {

            User otherUser = (User) obj;

            boolean nameEquals = otherUser.name.equals(this.name);
            boolean emailEquals = otherUser.email.equals(this.email);

            return nameEquals && emailEquals;
        } else {
            return false;
        }
    }
}
