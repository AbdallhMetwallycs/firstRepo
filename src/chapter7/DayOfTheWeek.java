package chapter7;

import java.util.Scanner;

/*Make an array that holds its actual values of the days of the week,
 and then have the user input a number corresponding to some day of the week.
 And assume that the week starts on Monday.

 Your program should output the String that represents
 the day of the week that corresponds to the number that the user input.
 For example, if the user inputs the number 1, your program should print “Monday”.
*/
public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int dayNumber ;
        String[] days ;
        String dayName ;

        dayNumber = getNumber();
        days = daysOfWeek();
        dayName = getDayByNumber(days, dayNumber);
        System.out.println("The corresponding day name to number "+ dayNumber+" you Entered is : "+dayName);

        System.out.println(" Do u want continue ? enter 1 for yes or 0 for no");
        int respond = scanner.nextInt();


        if (respond == 1){
            dayNumber = getNumber();
            days = daysOfWeek();
            dayName = getDayByNumber(days, dayNumber);
            System.out.println("The corresponding day name to number "+ dayNumber+" you Entered is : "+dayName);
        } else if (respond == 0) {
            System.out.println(" Thank you and Good Bye ");
        }else System.out.println(" Invalid input ,Good Bye");
        scanner.close();
    }

    public static String[] daysOfWeek() {
        return new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    public static int getNumber() {

        System.out.println(" Enter a number between 1 and 7 :");
        int number = scanner.nextInt();
        while (number <= 0 || number >= 8) {
            System.out.println("Enter a valid input Between from 1 to 7");
            number = scanner.nextInt();
        }

        return number;
    }

    public static String getDayByNumber(String [] array, int number) {
        return array[number-1];
    }
}
