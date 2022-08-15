package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HangmanGame newGame = new HangmanGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("---Hangman---");

        while (true)
        {
            System.out.println();
            newGame.printSentence();
            System.out.println();
            newGame.printGuessed();

            System.out.print("Enter your guess: ");
            char guess = sc.next().charAt(0);
            boolean isCorrect = newGame.isInSentence(guess);
            if (isCorrect == false)
            {
                System.out.println();
                System.out.println("              Incorrect Guess");
                System.out.println();
            }

            int guessesLeft = newGame.guessesLeft();
            boolean win = newGame.won();
            if (guessesLeft == 0 && win == false)
            {
                System.out.println("You failed to save this man.");
                System.exit(0);
            }
            if (win == true)
            {
                System.out.println();
                System.out.println("Congratulations, you saved this man!");
                System.exit(0);
            }

        }
    }
}
