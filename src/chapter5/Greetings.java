package chapter5;

import java.util.Scanner;

/*
* write a methode that asks the user their name , then greet them by name */
public class Greetings {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your name : ");

        System.out.println("method one");
        System.out.println(greet());
        System.out.println("method two");
        greetWithName();
    }

    public static String getName(){
        return scanner.next();
    }
    public static String greet(){
        String name = scanner.next();
        return "Hello "+name;
    }

    public static void greetWithName(){
        String name = scanner.next();
        System.out.println("Hello greeting with name "+name);
    }
}
