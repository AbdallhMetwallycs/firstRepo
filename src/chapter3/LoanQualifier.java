package chapter3;

import java.util.Scanner;

/*
* to qualify for a loan , a person must make at least  $30.000
* and have been working at thier current job for at least 2 years
* */
public class LoanQualifier {
    public static void main (String [] Args) {
        // initialize known variables
        int requiredSavings = 30000;
        int requiredYearsEmployed = 2;
        // get the unknowns
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount of money in ur saving Account ");
        double Savings = scanner.nextDouble();

        System.out.println("How many years have you been working in ur current job ?");
        double years = scanner.nextInt();

        scanner.close();  // for saving memory
        // make decisions
        if(Savings>= requiredSavings){
            if (years>=requiredYearsEmployed){
                System.out.println("Congratulations you can get the Loan, YOU WORTH IT ");
            }else System.out.println("Sorry your must be working in the same job for at least "+requiredYearsEmployed+" years");
        } else System.out.println("Sorry your saving Account hasn't reached "+requiredSavings+"the minimum Savings for the Loan");

    }
}
