package chapter4;
import java.util.Scanner;

/*
* each store employee makes $15 per hour, write a program to allow the employee
* to enter the number of hours worked for the week , do not allow for overtime */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        // initializing known variables
        int rate = 15;
        int maxHours = 40;

        // get the unknown variables

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours worked for the week.");
        double hoursWorked = scanner.nextDouble();

        // validate input
        while (hoursWorked > maxHours || hoursWorked <= 0){
            System.out.println("Invalid input, your worked hours must be between 1 and 40 .");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // calculate Gross
        double gross = hoursWorked* rate;
        System.out.println("your Gross pay is : "+ gross );


    }
}
