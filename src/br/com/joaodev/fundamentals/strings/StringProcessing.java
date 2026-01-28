package br.com.joaodev.fundamentals.strings;

public class StringProcessing {

    public static void main(String[] args) {

        /**
         * Strings and arrays
         * It's possible to convert between strings and character arrays using special methods
         * like valueOf() and toCharArray().
         */
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

        String stringFromChars = String.valueOf(chars); // "ABCDEF"
        System.out.println(stringFromChars);

        char [] charsFromString = stringFromChars.toCharArray();
        // {'A', 'B', 'C', 'D', 'E', 'F'}
        System.out.println(charsFromString.length);

        String theSameString = new String(charsFromString); // "ABCDEF"
        System.out.println(theSameString);

        String text = "Hello";
        String[] parts = text.split("");
        System.out.println(parts.length);

        /**
         * Splitting the string
         * A string can be divided into an array of strings based on a delimiter.
         * To perform this, we call the split method, which divides the string into substrings by a separator.
         */
        String sentence1 = "a long text";
        String[] words1 = sentence1.split(" "); // {"a", "long", "text"}

        String sentence2 = "a long text";
        String[] words2 = sentence2.split(" "); // {"a", "long", "text"}

        String scientistName = "Isaac Newton";
        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " ");
        }
    }
}
