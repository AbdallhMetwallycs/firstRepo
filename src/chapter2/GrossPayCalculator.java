package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String [] Args){
        // get the number of hours worked
        System.out.println("enter the number of working hours for the Employee per month");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        // get the hourly pay rate
        System.out.println("enter the employee pay rate");
        double payRate = scanner.nextDouble();
        // multiply hours and pay rate
        double gross = hours * payRate;
        // display result
        System.out.println("the Gross pay for the Employee is \n" + gross);
    }
}
