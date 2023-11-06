package chapter4;

import java.util.Scanner;

public class LetterSerach {
    public static void main(String[] args) {
        // Get text
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the text :");
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        // Search for the letter 'A'
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("this text contain the Letter a or A");
        }else System.out.println("Letter not found ");
    }
}
