package chapter6;

import java.util.Scanner;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int numberOfAllottedMinutes;
    private int numberOfMinutesUsed;

    // default constructors
    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        numberOfAllottedMinutes = 800;
        numberOfMinutesUsed = 800;
    }
    // id-only constructor
    public PhoneBill(int id){
        id = 0;
        baseCost = 79.99;
        numberOfAllottedMinutes = 800;
        numberOfMinutesUsed = 800;
    }
    // all fields constructor
    public PhoneBill(int id, double baseCost, int numberOfAllottedMinutes, int numberOfMinutesUsed){
        id = 0;
        baseCost = 79.99;
        numberOfAllottedMinutes = 800;
        numberOfMinutesUsed = 800;
    }
    // getters
    public int getId(){
        return id;
    }
    public int getNumberOfAllottedMinutes(){
        return numberOfAllottedMinutes;
    }
    public int getNumberOfMinutesUsed(){
        return numberOfMinutesUsed;
    }
    public double getBaseCost(){
        return baseCost;
    }
    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setNumberOfAllottedMinutes(int numberOfAllottedMinutes) {
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
    }

    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }
    // calculate the overage minutes Tax
    public double calculateOverageMinutesTax(){
        if(numberOfMinutesUsed>numberOfAllottedMinutes){
            double overageRate = 0.25;
            int overageMinutes = numberOfMinutesUsed - numberOfAllottedMinutes;
            return overageMinutes * overageRate;
        }
        return 0;
    }
    // calculate the Tax
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (calculateOverageMinutesTax() +baseCost);
    }

    // calculate the total Bill
    public double calculateTotal(){
        return baseCost +calculateTax()+calculateOverageMinutesTax();
    }
    // print an itemized Bill
    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverageMinutesTax()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }


}