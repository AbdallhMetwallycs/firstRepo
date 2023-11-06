package chapter3;

import java.util.Scanner;


/*
 if Statement
 All salespersons are expected to make 10 sales or more per week
 salespersons who get 10 sales or more get an additional sales bonus of 250$
 and a congratulation message
 otherwise  receive the same salary and informed of how many sales they are short
 */
public class QuotaCalculator {
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

        // make a decision on the path to take output

        if (sales>=magicNum){
            System.out.println(" Congratulation for Achiveng "+sales+" sales this week");
            System.out.println(" you get an additional 250$ payment for every 10 over the 10 sales ");
            salary = salary + bonus;
            System.out.println(" your salary is "+salary);

        }
        else {
            int salesShort = magicNum-sales;
            System.out.println(" you need to get more "+salesShort+" sales to get additional payment");
            System.out.println(" your salary is "+salary);
        }


    }
}
