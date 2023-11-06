package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        // Get the number of items to scan
        System.out.println("enter the number of items you would like to scan ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println("enter the price of the item :"+ (i+1)); // we start from i = 0 so we add +1
            double cost = scanner.nextDouble();
            total = total + cost;
        }
        scanner.close();
        System.out.println(" the total price of your items is : $"+ total);

    }
}
