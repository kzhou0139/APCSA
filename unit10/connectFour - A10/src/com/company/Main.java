package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-Connect Four Game-");
        Scanner sc = new Scanner(System.in);

        ConnectFourGame newGame = new ConnectFourGame();
        newGame.draw();

        while (true)
        {
            int column = 0;
            int statusCheck = 0;

            System.out.print("Red enter a column for your move (0-6): ");
            column = sc.nextInt();

            while (column > 6 || column < 0)
            {
                System.out.println();
                System.out.println("Invalid input");
                System.out.print("Red enter a column for your move (0-6): ");
                column = sc.nextInt();
            }

            while (newGame.columnFull(column) == true)
            {
                System.out.println();
                System.out.println("Sorry, that column is full.");
                System.out.print("Red enter a column for your move (0-6): ");
                column = sc.nextInt();
            }

            newGame.dropPiece(column, 4);
            newGame.draw();

            statusCheck = newGame.status();
            if (statusCheck == 1)
            {
                System.out.println("Red wins!");
                System.exit(0);
            }
            if (statusCheck == 3)
            {
                System.out.println("Draw game!");
                System.exit(0);
            }

            System.out.print("Black enter a column for your move (0-6): ");
            column = sc.nextInt();

            while (column > 6 || column < 0)
            {
                System.out.println();
                System.out.println("Invalid input");
                System.out.print("Black enter a column for your move (0-6): ");
                column = sc.nextInt();
            }

            while (newGame.columnFull(column) == true)
            {
                System.out.println();
                System.out.println("Sorry, that column is full.");
                System.out.print("Black enter a column for your move (0-6): ");
                column = sc.nextInt();
            }

            newGame.dropPiece(column, 5);
            newGame.draw();

            statusCheck = newGame.status();
            if (statusCheck == 2)
            {
                System.out.println("Black wins!");
                System.exit(0);
            }
            if (statusCheck == 3)
            {
                System.out.println("Draw game!");
                System.exit(0);
            }

        }
    }
}
