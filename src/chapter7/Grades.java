package chapter7;

import java.util.Scanner;

/*
* create a program that allows a user to enter any
* number of grades and provides them with their
* average score, as well as the highest and lowest scores*/
public class Grades {
    private static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" How many Scores do u want to enter");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println(" the score Sum is "+calculateSum());

        System.out.println(" the score average   is "+String.format("%.2f",calculateAverage()));
        System.out.println(" the highest score is "+getHighest());
        System.out.println(" the lowest score is "+getLowest());


    }


    private static void getGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println(" Enter the grade # " + (i + 1));
            grades[i] = scanner.nextInt();

        }
    }

    public static double calculateSum(){
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade:grades) {
            if (grade > highest) highest=grade;
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade:grades) {
            if (grade < lowest) lowest=grade;
        }
        return lowest;
    }
}

