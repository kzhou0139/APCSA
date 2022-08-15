//Kelly Zhou
//Mrs. Bauguss
//Period 3

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter player names: ");
        System.out.println();
        System.out.print("\tEnter your name: ");
        String playerOneName = sc1.nextLine();
        System.out.println();
        System.out.print("\tEnter your name: ");
        String playerTwoName = sc1.nextLine();
        System.out.println();

        OneHundredGame newGame = new OneHundredGame(playerOneName, playerTwoName);

        newGame.runGame();
    }
}
