package chapter5;


import java.util.Scanner;

/*
* any one who makes more than $25000 , and has a credit Score of 700 or better is approved
* reject all others */
public class CreditCheck {
    // global variables
    static int reqSalary = 25000;
    static int reqCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // initialize what we know

        // Get what you need to know
        System.out.println(" Enter your name :");
        String name =Greetings.getName();
//        System.out.println(" Enter your salary :");
        double salary = getSalary();
//        System.out.println(" Enter your credit score :");
        int creditScore = getCreditScore();
        scanner.close();
        // check
        boolean check = isUserQualified(salary, creditScore);

        // notify the user
        if (check) System.out.println(" Great "+name+" You are Approved");
        else System.out.println(" sorry "+name+" You are not Approved");
    }

    public static double getSalary(){

        System.out.println("Enter your actual Salary : ");
       return scanner.nextDouble();

    }
    public static int getCreditScore(){

        System.out.println("Enter your Credit Score : ");
        return scanner.nextInt();

    }
    public static boolean isUserQualified(double salary, int creditScore){
        boolean check;
        check = salary >= reqSalary && creditScore >= reqCreditScore;
    return check;
    }
}
