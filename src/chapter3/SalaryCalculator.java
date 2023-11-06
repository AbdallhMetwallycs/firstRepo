package chapter3;

import java.util.Scanner;

// comment 1
// comment 2
// comment 3
// comment 4
/*
 comment 1
 comment 2
 comment 3
 comment 4
 comment 5
 */
/*
 if Statement
 All salespersons get a payment of 1000$ a week
 salespersons who exceed 10 sales get an additional sales bonus of 250$
 */
public class SalaryCalculator {
    public static void main(String [] Args){
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int magicNum = 10;
        // magic number A number that is hard-coded as opposed to being represented by a variable

        // get unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Sales did the employee did this week ?");
        int sales = scanner.nextInt();
        scanner.close();  // to save memory

        // quick detour for the bonus earners

        if (sales>magicNum){
            salary = salary + bonus;
        }
        // output
        System.out.println(" the weekly salary for that Employee is "+salary);
    }

}
