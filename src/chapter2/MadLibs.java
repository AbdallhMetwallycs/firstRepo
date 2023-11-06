package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[]Args){
        System.out.println("Hello Stranger \n please enter a Season of the year ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Great work , Also enter the number of cups of coffee");
        int cups = scanner.nextInt();
        System.out.println("Last one , enter an Adjective ");
        String adj = scanner.next();

        System.out.println("On an "+adj+" "+season+" I drink a minimum of "+cups+" cups of coffee");

    }
}
