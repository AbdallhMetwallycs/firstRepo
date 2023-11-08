package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TheowException {
    public static void main(String[] args) throws Exception{
        createNewFile();
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file = new File("D:\\Abdallh Metwally/number.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" File Not Found");
            e.printStackTrace();
        } catch (InputMismatchException i) {
            System.out.println(" input mistake ");
            i.printStackTrace();
        }catch (Exception r){
            System.out.println("Error");
            r.printStackTrace();
        }

    }

    public static void createNewFile() throws IOException {
        File file = new File("D:\\Abdallh Metwally/Abdllhmetwallycv.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(" File Not Found");
            e.printStackTrace();
        }

}
}
