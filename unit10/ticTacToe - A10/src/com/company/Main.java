package com.company;
import java.util.Scanner;

public class Main {
    //Kelly Zhou Mrs. Bauguss P3

    public static void main(String[] args) {
	// write your code here
        System.out.println("---Tic Tac Toe Version Two---");
        Scanner sc = new Scanner(System.in);

        boolean xWin = false;
        boolean oWin = false;
        boolean isFull = false;
        char[][] board = { {' ', ' ', ' '},
                           {' ', ' ', ' '},
                           {' ', ' ', ' '} };

        displayBoard(board);

        while ((xWin == false) && (oWin == false))
        {
            int xRow = 0;
            int xColumn = 0;
            int oRow = 0;
            int oColumn = 0;

            System.out.print("X enter the column for your move (0 - 2): ");
            xColumn = sc.nextInt();
            System.out.print("X enter the row for your move (0 - 2): ");
            xRow = sc.nextInt();

            while ((xColumn > 2) || (xRow > 2) || (board[xRow][xColumn] != ' '))
            {
                System.out.println();
                System.out.println("Invalid move, enter a new move.");
                System.out.print("X enter the column for your move (0 - 2): ");
                xColumn = sc.nextInt();
                System.out.print("X enter the row for your move (0 - 2): ");
                xRow = sc.nextInt();
            }

            board[xRow][xColumn] = 'X';
            displayBoard(board);

            isFull = isCat(board);
            if (isFull == true)
            {
                System.out.println();
                System.out.println("Board is full!");
                System.exit(0);
            }

            xWin = isWinner(board, 'X');
            if (xWin == true)
            {
                System.out.println();
                System.out.println("X Wins!");
                System.exit(0);
            }

            System.out.print("O enter the column for your move (0 - 2): ");
            oColumn = sc.nextInt();
            System.out.print("O enter the row for your move (0 - 2): ");
            oRow = sc.nextInt();

            while ((oColumn > 2) || (oRow > 2) || (board[oRow][oColumn] != ' '))
            {
                System.out.println();
                System.out.println("Invalid move, enter a new move.");
                System.out.print("O enter the column for your move (0 - 2): ");
                oColumn = sc.nextInt();
                System.out.print("O enter the row for your move (0 - 2): ");
                oRow = sc.nextInt();
            }

            board[oRow][oColumn] = 'O';
            displayBoard(board);

            isFull = isCat(board);
            if (isFull == true)
            {
                System.out.println();
                System.out.println("Board is full!");
                System.exit(0);
            }

            oWin = isWinner(board, 'O');
            if (oWin == true)
            {
                System.out.println();
                System.out.println("O Wins!");
                System.exit(0);
            }

        }

    }

    public static void displayBoard (char[][] board)
    {
        System.out.println();
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (j == 2)
                    System.out.print(" " + board[i][j]);
                else
                    System.out.print(" " + board[i][j] + " |");
            }
            if (i == 2)
                break;
            else
                System.out.println("\n-----------");
        }
        System.out.println();
    }

    public static boolean isWinner (char[][] board, char player)
    {
        boolean win = false;

        if (player == 'X')
        {
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
                win = true;
            else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')
                win = true;
            else if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
                win = true;
            else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
                win = true;
            else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
                win = true;
            else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
                win = true;
            else if (board[0][1] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
                win = true;
            else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
                win = true;
            else
                win = false;
        }

        else
        {
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
                win = true;
            else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')
                win = true;
            else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
                win = true;
            else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
                win = true;
            else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
                win = true;
            else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
                win = true;
            else if (board[0][1] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
                win = true;
            else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
                win = true;
            else
                win = false;
        }

        return win;

    }

    public static boolean isCat (char[][] board)
    {
        boolean filled = false;
        boolean xWon = isWinner(board, 'X');
        boolean oWon = isWinner(board, 'O');
        int full = 0;

        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (board[i][j] == ' ')
                {
                    full = -1;
                    break;
                }
            }
            if (full == -1)
                break;
        }

        if ((full == 0) && (xWon == false) && (oWon == false))
            filled = true;
        else
            filled = false;

        return filled;

    }

}
