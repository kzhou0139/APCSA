package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("---Worker Ant---");
        System.out.println("Enter the state of the ground around an ant's home ('F' - Food, 'H' - Home and ' ' - Empty Ground):");
        String foodLocation = sc.next();
        char[] foodArray = foodLocation.toCharArray();

        int home = 0;
        for (int i = 0; i < foodArray.length; i++)
        {
            if (foodArray[i] == 'H')
                home = i;
            else
                continue;
        }

        int right = rightSteps (foodArray, home);
        int left = leftSteps(foodArray, home);

        int totalSteps = right + left;

        System.out.println("It took your ant " + totalSteps + " to gather the food around its home.");

    }

    public static int rightSteps (char[] foodArray, int home)
    {
        int totalStepsRight = 0;

        for (int j = home + 1; j < foodArray.length; j++)
        {
            int stepsRight = 0;
            if ((foodArray[j] == 'F') && (j != foodArray.length - 1))
                stepsRight += (j - home) * 2;
            if (j == foodArray.length - 1)
            {
                if ((foodArray[foodArray.length - 1] == 'F') || (foodArray[foodArray.length - 1] == '-'))
                    stepsRight += ((foodArray.length - 1) - home) * 2;
            }

            totalStepsRight += stepsRight;
        }

        return totalStepsRight;
    }

    public static int leftSteps (char[] foodArray, int home)
    {
        int totalStepsLeft = 0;

        for (int k = home; k > -1; k--)
        {
            int stepsLeft = 0;
            if (k != 0)
            {
                if (foodArray[k] == 'F')
                    stepsLeft += (home - k) * 2;
            }
            if (k == 0)
            {
                if ((foodArray[0] == 'F') || (foodArray[0]) == '-')
                    stepsLeft += (home - 0) * 2;
            }
            totalStepsLeft += stepsLeft;
        }

        return totalStepsLeft;
    }

}
