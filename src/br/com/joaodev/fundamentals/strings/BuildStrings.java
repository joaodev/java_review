package br.com.joaodev.fundamentals.strings;

public class BuildStrings {

    public static void main(String[] args) {

        /**
         * Constructing objects
         * It is possible to create an empty object of the type StringBuilder.
         */
        StringBuilder empty = new StringBuilder();
        System.out.println(empty);

        StringBuilder sb = new StringBuilder("Hello!" + "teste");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));

        sb.setCharAt(1, 'm');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append("123");
        System.out.println(sb);

        StringBuilder messageBuilder = new StringBuilder();

        messageBuilder
                .append("From john@test.com\n")
                .append("To: doe@test.com\n")
                .append("Text: I lost my keys.\n")
                .append("Please, open the door!");

        System.out.println(messageBuilder);

        StringBuilder sb2 = new StringBuilder("I'm a programmer.");
        sb2.insert(6, "Java");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Let's use C#");
        sb3.replace(10, 12, "Java");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Welcome");
        sb4.delete(0, 3);
        System.out.println(sb4);

        sb4.reverse();
        System.out.println(sb4);

        /**
         * The length() and capacity()
         * Two methods should not be confused: length and capacity. The length returns the actual number of
         * characters whereas capacity returns the amount of storage available for newly inserted characters,
         * beyond which an allocation will occur.
         */
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());

        stringBuilder.append("A very long string");

        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());

        StringBuilder sbc = new StringBuilder(30);
        System.out.println(sbc.length());
        System.out.println(sbc.capacity());
    }
}
