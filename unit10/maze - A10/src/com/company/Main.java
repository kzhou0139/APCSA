//Kelly Zhou Mrs. Bauguss P3

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("---Maze---");
        Scanner sc = new Scanner(System.in);

        MazeGame newGame = new MazeGame();
        newGame.draw();

        while (true)
        {
            boolean ableMove = false;
            boolean win = false;

            System.out.print("Enter move (w - up, a - left, s - down, d - right): ");
            char direction = sc.next().charAt(0);

            ableMove = newGame.move(direction);
            if (ableMove == false)
            {
                System.out.println();
                System.out.println("Invalid move.");
            }
            else
                newGame.draw();

            win = newGame.won();
            if (win == true)
            {
                System.out.println("Congratulations, you solved the maze in " + newGame.getMoveCount()
                + " moves.");
                System.exit(0);
            }

        }

    }
}
