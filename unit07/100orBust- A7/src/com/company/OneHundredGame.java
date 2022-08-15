package com.company;
import java.util.Scanner;

public class OneHundredGame {

    public static final int PLAYER_ONE_TURN = 0;
    public static final int PLAYER_TWO_TURN = 1;
    public static final int PLAYER_ONE_WINS = 2;
    public static final int PLAYER_TWO_WINS = 3;

    private int status;
    private Player playerOne;
    private Player playerTwo;

    private int turn;
    private int win;


    public OneHundredGame (String playerOneName, String playerTwoName)
    {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
        status = PLAYER_ONE_TURN;
    }

    public void runGame()
    {
        System.out.println(playerOne.toString() + " it is your turn and you have " + playerOne.getBank() + " points in your bank.");
        turn = -1;

        while (true)
        {
            int s = getStatus();
            if (s == PLAYER_ONE_TURN)
            {
                runTurn(playerOne);
                turn = 2;
                updateStatus();
                continue;
            }
            else if (s == PLAYER_TWO_TURN)
            {
                runTurn(playerTwo);
                turn = 1;
                updateStatus();
                continue;
            }
            else if (s == PLAYER_ONE_WINS)
            {
                System.out.println(playerOne.toString() + " wins the game!");
                System.exit(0);
            }
            else
            {
                System.out.println(playerTwo.toString() + " wins the game!");
                System.exit(0);
            }
        }
    }

    public void runTurn (Player p)
    {
        playerMenu(p);
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        int dice1 = 0;
        int dice2 = 0;
        int total = 0;
        win = 0;

        while ((selection == 1) || (selection == 2))
        {
            if (selection == 1)
            {
                dice1 = rollDie();
                dice2 = rollDie();
                total = dice1 + dice2;
                System.out.println();
                System.out.println("\tYou rolled a " + dice1 + " and a " + dice2 + ".");

                if (dice1 == dice2)
                {
                    System.out.println();
                    System.out.println("\tYour turn ends and you add 0 points to your total for rolling doubles.");
                    System.out.println();
                    p.resetCurrent();
                    break;
                }
                else
                {
                    p.addToCurrent (total);
                    break;
                }
            }
            if (selection == 2)
            {
                System.out.println();
                p.bankCurrent();
                System.out.println("\t" + p.getCurrent() + " points were added to your bank giving you " + p.getBank() + " now in your bank.");
                System.out.println();
                if (playerOne.getBank() >= 100)
                {
                    win = 1;
                    updateStatus();
                    break;
                }
                if (playerTwo.getBank() >= 100)
                {
                    win = 2;
                    updateStatus();
                    break;
                }
                p.resetCurrent();
                break;
            }
        }

        while ((selection != 1) && (selection != 2))
        {
            System.out.println();
            System.out.println("Invalid input. Please enter a 1 or a 2.");
            playerMenu(p);
            selection = sc.nextInt();
        }
    }

    public void updateStatus() {
        if (win == 1)
        {
            status = PLAYER_ONE_WINS;
        }
        if (win == 2)
        {
            status = PLAYER_TWO_WINS;
        }

        if ((turn == 1) && (playerTwo.getCurrent() == 0))
        {
            System.out.println(playerOne.toString() + " it is your turn and you have " + playerOne.getBank() + " points in your bank.");
            status = PLAYER_ONE_TURN;
        }
        if ((turn == 2) && (playerOne.getCurrent() == 0))
        {
            System.out.println(playerTwo.toString() + " it is your turn and you have " + playerTwo.getBank() + " points in your bank.");
            status = PLAYER_TWO_TURN;
        }
    }

    public int rollDie()
    {
        int random = (int)(Math.random() * 6 + 1);
        return random;
    }

    public int getStatus()
    {
        return status;
    }

    public Player getPlayerOne()
    {
        return playerOne;
    }

    public Player getPlayerTwo()
    {
        return playerTwo;
    }

    public static void playerMenu(Player player)
    {
        System.out.println();
        System.out.println("\tYou have earned " + player.getCurrent() + " points this turn.");
        System.out.println("\t1. Keep Going");
        System.out.println("\t2. Stop & add to bank");
        System.out.print("\tEnter selection: ");
    }
}


