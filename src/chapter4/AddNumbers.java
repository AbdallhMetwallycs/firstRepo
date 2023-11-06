package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again = false;
        Scanner scanner = new Scanner(System.in);

        double sum;
        do {
            System.out.println("Enter the first numbers");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second numbers");
            double num2 = scanner.nextDouble();
            sum = num1 + num2;
            System.out.println("the Sum is :"+ sum);
            System.out.println(" do u want to start over ? true or false");
            again = scanner.nextBoolean();
        }while (again);
    }
}
