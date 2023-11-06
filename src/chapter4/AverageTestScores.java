package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        // initialize what we know
        int numberOfStudents  = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        // process all students
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            double average = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the Score of test #"+(j+1));
                double score = scanner.nextDouble();
                total = total+score;
            }
            average = total/numberOfTests;
            System.out.println("The Test Average Score of Student #"+(i+1)+"is : "+average);
        }
        scanner.close();

    }
}
