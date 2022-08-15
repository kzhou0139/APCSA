package com.company;

public class MazeGame {

    private char[][] maze = { {'W', 'W', 'W', 'W', 'W', 'W'},
                              {'S', '_', '_', '_', '_', 'W'},
                              {'W', 'W', '_', 'W', '_', '_'},
                              {'W', 'W', 'W', '_', '_', 'W'},
                              {'E', '_', '_', '_', 'W', 'W'},
                              {'W', 'W', 'W', 'W', 'W', 'W'} };

    int playerColumn;
    int playerRow;
    int moveCount;
    String directionS = "";

    public MazeGame()
    {
        this.playerRow = 1;
        this.playerColumn = 0;
    }

    public boolean won()
    {
        if ((playerColumn == 0) && (playerRow == 4))
            return true;
        else
            return false;
    }

    public int getMoveCount()
    {
        return moveCount;
    }

    public boolean move(char direction)
    {
        boolean canMove = false;

        if (direction == 'w')
        {
            if (maze[playerRow - 1][playerColumn] == 'W')
                canMove = false;
            else
            {
                directionS = "up";
                playerRow--;
                moveCount++;
                canMove = true;
            }
        }

        if (direction == 'a')
        {
            if ((playerRow == 1 && playerColumn == 0))
                canMove = false;
            else if (maze[playerRow][playerColumn - 1] == 'W')
                canMove = false;
            else
            {
                directionS = "left";
                playerColumn--;
                moveCount++;
                canMove = true;
            }
        }

        if (direction == 's')
        {
            if (maze[playerRow + 1][playerColumn] == 'W')
                canMove = false;
            else
            {
                directionS = "down";
                playerRow++;
                moveCount++;
                canMove = true;
            }
        }

        if (direction == 'd')
        {
            if (playerRow == 2 && playerColumn == 5)
                canMove = false;
            else if (maze[playerRow][playerColumn + 1] == 'W')
                canMove = false;
            else
            {
                directionS = "right";
                playerColumn++;
                moveCount++;
                canMove = true;
            }
        }

        return canMove;

    }

    public void draw()
    {
        System.out.println();

        char[][] originalMaze = { {'W', 'W', 'W', 'W', 'W', 'W'},
                {'S', '_', '_', '_', '_', 'W'},
                {'W', 'W', '_', 'W', '_', '_'},
                {'W', 'W', 'W', '_', '_', 'W'},
                {'E', '_', '_', '_', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W', 'W'} };

        maze = originalMaze;

        for (int i = 0; i < maze.length; i++)
        {
            for (int j = 0; j < maze[0].length; j++)
            {
                if ((i == playerRow) && (j == playerColumn))
                    maze[i][j] = 'X';

                if (maze[1][0] != 'X')
                    maze[1][0] = 'S';

                System.out.print(maze[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
