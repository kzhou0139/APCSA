package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("---Data Set---");
        System.out.println();
        printMenu();
        int selection = sc.nextInt();
        int[] dataSet = new int[10];

        while (true)
        {
            if (selection == 1)
            {
                System.out.println();
                System.out.print("Enter the value for loaction 0: ");
                dataSet[0] = sc.nextInt();
                System.out.print("Enter the value for loaction 1: ");
                dataSet[1] = sc.nextInt();
                System.out.print("Enter the value for loaction 2: ");
                dataSet[2] = sc.nextInt();
                System.out.print("Enter the value for loaction 3: ");
                dataSet[3] = sc.nextInt();
                System.out.print("Enter the value for loaction 4: ");
                dataSet[4] = sc.nextInt();
                System.out.print("Enter the value for loaction 5: ");
                dataSet[5] = sc.nextInt();
                System.out.print("Enter the value for loaction 6: ");
                dataSet[6] = sc.nextInt();
                System.out.print("Enter the value for loaction 7: ");
                dataSet[7] = sc.nextInt();
                System.out.print("Enter the value for loaction 8: ");
                dataSet[8] = sc.nextInt();
                System.out.print("Enter the value for loaction 9: ");
                dataSet[9] = sc.nextInt();
                printMenu();
                selection = sc.nextInt();
            }

            int indexChange = 0;
            int newVal = 0;

            if (selection == 2)
            {
                System.out.println();
                System.out.print("Enter the index of the location to be changed (0-9): ");
                indexChange = sc.nextInt();
                System.out.print("Enter the value for the location: ");
                newVal = sc.nextInt();
                dataSet[indexChange] = newVal;
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 3)
            {
                System.out.println();
                System.out.println("The data in the array is :");
                for (int i = 0; i < dataSet.length; i++)
                {
                    if (i == (dataSet.length - 1))
                        System.out.print(dataSet[i]);
                    else
                        System.out.print(dataSet[i] + ", ");
                }
                System.out.println();
                printMenu();
                selection = sc.nextInt();
            }

            int total = 0;

            if (selection == 4)
            {
                System.out.println();
                for (int j = 0; j < dataSet.length; j++)
                {
                    total += dataSet[j];
                }
                System.out.println("The total of the values in the data set is " + total);
                printMenu();
                selection = sc.nextInt();
            }

            int average = 0;
            int totalA = 0;

            if (selection == 5)
            {
                System.out.println();
                for (int j = 0; j < dataSet.length; j++)
                {
                    totalA += dataSet[j];
                }
                average = totalA / 10;
                System.out.println("The average of the values in the data set is " + average);
                printMenu();
                selection = sc.nextInt();
            }

            int minimum = 0;

            if (selection == 6)
            {
                System.out.println();
                minimum = dataSet[0];
                for (int k = 0; k < dataSet.length; k++)
                {
                    if (dataSet[k] < minimum)
                        minimum = dataSet[k];
                }
                System.out.println("The minimum value in the data set is " + minimum);
                printMenu();
                selection = sc.nextInt();
            }

            int maximum = 0;

            if (selection == 7)
            {
                System.out.println();
                for (int k = 0; k < dataSet.length; k++)
                {

                        if (dataSet[k] >= maximum)
                            maximum = dataSet[k];

                }
                System.out.println("The maximum value in the data set is " + maximum);
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 8)
            {
                System.out.println();
                for (int a = 0; a < dataSet.length; a++)
                {
                    dataSet[a] = 0;
                }
                System.out.println();
                System.out.println("All values have been reset to 0.");
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 0)
            {
                System.out.println();
                System.out.println("Good Bye.");
                System.exit(0);
            }

            while ((selection < 0) || (selection > 8))
            {
                System.out.println();
                System.out.println("Invalid selection , try again.");
                printMenu();
                selection = sc.nextInt();
            }
        }
    }

    public static void printMenu()
    {
        System.out.println();
        System.out.println("Menu");
        System.out.println("1. Reassign");
        System.out.println("2. Change 1 value");
        System.out.println("3. Print");
        System.out.println("4. Total");
        System.out.println("5. Average");
        System.out.println("6. Minimum");
        System.out.println("7. Maximum");
        System.out.println("8. Clear");
        System.out.println("0. Exit");
        System.out.print("Enter Selection: ");
    }
}
