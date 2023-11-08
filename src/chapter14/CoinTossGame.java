package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    private static Scanner scanner;
    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);
        Player player1 = new Player(askPlayerName());
        player1.setGuess(askGuess());

        Player player2 = new Player(askPlayerName());
        player2.setGuess(askGuess());
        if(player1.getGuess().equalsIgnoreCase(Coin.head)){
            player2.setGuess(Coin.tail);
        }else{
            player2.setGuess(Coin.head);
        }

        System.out.println("Flipping the coin...");
        Coin coin = new Coin();
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());

        game.winner(player1, player2, coin);

        game.scanner.close();

    }

    private static String askPlayerName() {
        System.out.println("enter the player name :");
        return scanner.nextLine();
    }

    private static String askGuess() {
        String prompt = String.format("%s or %s ?", Coin.head, Coin.tail);
        System.out.println(prompt);
        String guess = scanner.nextLine();
        while (!guess.equalsIgnoreCase(Coin.head) && !guess.equalsIgnoreCase(Coin.tail)){
               System.out.println("invalid input, pls try again  "+ prompt);
               guess = scanner.nextLine();
        }
        return guess;
    }

    private void winner(Player player1, Player player2, Coin coin){

        String winner;
        if (coin.getSide().equalsIgnoreCase(player1.getGuess())) winner = player1.getName();
        else winner = player2.getName();

        System.out.println("the Winner is "+ winner);
    }
}
