package com.company;

public class ConnectFourGame {

    public static final int PLAYING = 0;
    public static final int RED_WINS = 1;
    public static final int BLACK_WINS = 2;
    public static final int DRAW = 3;
    public static final int RED = 4;
    public static final int BLACK = 5;
    public static final int EMPTY = 6;
    private int board[][];

    public ConnectFourGame() {
        board = new int[7][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++)
                board[i][j] = EMPTY;
        }

    }

    public boolean dropPiece(int column, int player) {
        boolean ifAble = false;

        if (player == RED) {
            for (int i = 6; i > -1; i--) {
                if (board[i][column] == EMPTY) {
                    board[i][column] = RED;
                    ifAble = true;
                    break;
                } else
                    ifAble = false;
            }
        }

        if (player == BLACK) {
            for (int i = 6; i > -1; i--) {
                if (board[i][column] == EMPTY) {
                    board[i][column] = BLACK;
                    ifAble = true;
                    break;
                } else
                    ifAble = false;
            }
        }

        return ifAble;

    }

    public int status()
    {
        int stat = -1;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (board[i][j] == RED && board[i][j + 1] == RED && board[i][j + 2] == RED && board[i][j + 3] == RED)
                    stat = RED_WINS;
                if (board[i][j] == RED && board[i + 1][j] == RED && board[i + 2][j] == RED && board[i + 3][j] == RED)
                    stat = RED_WINS;
                if (board[i][j] == RED && board[i + 1][j + 1] == RED && board[i + 2][j + 2] == RED && board[i + 3][j + 3] == RED)
                    stat = RED_WINS;

                if (board[i][j] == BLACK && board[i][j + 1] == BLACK && board[i][j + 2] == BLACK && board[i][j + 3] == BLACK)
                    stat = BLACK_WINS;
                if (board[i][j] == BLACK && board[i + 1][j] == BLACK && board[i + 2][j] == BLACK && board[i + 3][j] == BLACK)
                    stat = BLACK_WINS;
                if (board[i][j] == BLACK && board[i + 1][j + 1] == BLACK && board[i + 2][j + 2] == BLACK && board[i + 3][j + 3] == BLACK)
                    stat = BLACK_WINS;
            }
        }

        for (int r = 6; r > 2; r--)
        {
            for (int c = 6; c > 2; c--)
            {
                if (board[r][c] == RED && board[r][c - 1] == RED && board[r][c - 2] == RED && board[r][c - 3] == RED)
                    stat = RED_WINS;
                if (board[r][c] == RED && board[r - 1][c] == RED && board[r - 2][c] == RED && board[r - 3][c] == RED)
                    stat = RED_WINS;
                if (board[r][c] == RED && board[r - 1][c - 1] == RED && board[r - 2][c - 2] == RED && board[r - 3][c - 3] == RED)
                    stat = RED_WINS;

                if (board[r][c] == BLACK && board[r][c - 1] == BLACK && board[r][c - 2] == BLACK && board[r][c - 3] == BLACK)
                    stat = BLACK_WINS;
                if (board[r][c] == BLACK && board[r - 1][c] == BLACK && board[r - 2][c] == BLACK && board[r - 3][c] == BLACK)
                    stat = BLACK_WINS;
                if (board[r][c] == BLACK && board[r - 1][c - 1] == BLACK && board[r - 2][c - 2] == BLACK && board[r - 3][c - 3] == BLACK)
                    stat = BLACK_WINS;
            }
        }

        for (int a = 0; a < 4; a++)
        {
            for (int b = 6; b > 2; b--)
            {
                if (board[a][b] == RED && board[a + 1][b - 1] == RED && board[a + 2][b - 2] == RED && board[a + 3][b - 3] == RED)
                    stat = RED_WINS;
                if (board[a][b] == BLACK && board[a + 1][b - 1] == BLACK && board[a + 2][b - 2] == BLACK && board[a + 3][b - 3] == BLACK)
                    stat = BLACK_WINS;
            }
        }

        if ((stat != RED_WINS) && (stat != BLACK_WINS))
        {
            int ifEmpty = -1;

            for (int c = 0; c < board.length; c++)
            {
                for (int d = 0; d < board[0].length; d++)
                {
                    if (board[c][d] == EMPTY)
                    {
                        ifEmpty = 1;
                        break;
                    }
                }
                if (ifEmpty == 1)
                    break;
            }

            if (ifEmpty == 1)
                stat = PLAYING;
            else
                stat = DRAW;
        }

        return stat;
    }



    public boolean columnFull (int column)
    {
        boolean full = false;
        int ifFilled = 0;
        for (int i =0; i < board.length; i++)
        {
            if (board[i][column] == EMPTY)
                continue;
            else
                ifFilled++;
        }
        if (ifFilled == 7)
            full = true;
        else
            full = false;

        return full;

    }

    public void draw()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                System.out.print("| ");
                if (board[i][j] == RED)
                    System.out.print('R');
                else if (board[i][j] == BLACK)
                    System.out.print('B');
                else
                    System.out.print(' ');
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        System.out.println("-----------------------------");

    }

    public int getSpot (int col, int row)
    {
        int ret = 0;
        if (col >= board[0].length || col < 0)
            ret = -1;
        else if (row >= board.length || row < 0)
            ret = -1;
        else
            ret = board[col][row];

        return ret;

    }

}
