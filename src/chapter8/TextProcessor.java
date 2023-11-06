package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love test automation university");
        System.out.println(" */*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        reverseString("Hello TAU!");
        addSpaces("HelloWorld!It'sMeAbdallhMetwally");
    }

    /**
     * add spaces to a text to spilt a sentence every new word should begin with capital letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
        
    }

    /**
     *  reverse a text in the same line
     * @param text full text to be reversed
     */
    public static void reverseString(String text) {
        for (int i = text.length()-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println(" ");
    }

    /**
     * Splits a String into an array by tokenizing it
     * counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text containing %d  words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);

        }
    }
}
