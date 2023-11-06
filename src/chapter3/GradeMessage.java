package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        // get the test score
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your grade Letter");
        String grade = scanner.next();

        String message;
        switch (grade){
            case "A":
                message = "Excellent Work";
                break;
            case "B":
                message = "Great Job ";
                break;
            case "C":
                message = "Good job ";
                break;
            case "D":
                message = " U need to work hard ";
                break;
            case "F":
                message = " U must work hard ";
                break;
            default:
                message = "Error invalid Grade";
                break;
        }
        System.out.println(" "+ message);
    }
}