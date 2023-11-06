package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 6;

    public static void main(String[] args) {
        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }


    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            /* generate a  random number then search to make sure it doesn't  already exist
            * in the array , if it does , regenerate and search*/
            do {
                 randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));

            // Number is unique , add it to the array
            ticket[i] = randomNumber ;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array this is an array to search in
     * @param searchNumber this is the umber to search for
     * @return true or false
     */
    public static boolean search(int [] array, int searchNumber){
        for (int value: array) {
            if (value == searchNumber) {
                return true;
            }
        }
        // if we get to this point that mean no duplicate value in the array
        return false;
    }

    public static boolean binarySearch(int []array, int searchNumber){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, searchNumber);
        return index >= 0;
    }
    public static void printTicket(int [] ticket){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(" "+ticket[i]+" ");
        }
    }
}
