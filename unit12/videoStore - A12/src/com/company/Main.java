package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        VideoStore newStore = new VideoStore();
        rentMenu();
        int selection = sc.nextInt();

        while (true)
        {
            if (selection == 1)
            {
                System.out.println();
                System.out.println("Video Menu");
                for (int i = 0; i < newStore.videosInStock().size(); i++)
                {
                    int num = i + 1;
                    System.out.println(num + ". " + newStore.videosInStock().get(i).getTitle());
                }
                System.out.println("0. Cancel");
                System.out.print("Enter selection: ");
                int selectVideo = sc.nextInt();
                if (selectVideo != 0)
                {
                    System.out.println();
                    System.out.println(newStore.videosInStock().get(selectVideo - 1).toString());
                    System.out.println();
                    System.out.println("1 - Rent, 2 - Put Back");
                    System.out.print("Enter selection: ");
                    int rentPutBackVideo = sc.nextInt();
                    if (rentPutBackVideo == 1)
                        newStore.videosInStock().get(selectVideo - 1).setRented(true);
                }
                rentMenu();
                selection = sc.nextInt();
            }

            if (selection == 2)
            {
                System.out.println();
                System.out.println("Game Menu");
                for (int i = 0; i < newStore.gamesInStock().size(); i++)
                {
                    int num = i + 1;
                    System.out.println(num + ". " + newStore.gamesInStock().get(i).getTitle());
                }
                System.out.println("0. Cancel");
                System.out.print("Enter selection: ");
                int selectGame = sc.nextInt();
                if (selectGame != 0)
                {
                    System.out.println();
                    System.out.println(newStore.gamesInStock().get(selectGame - 1).toString());
                    System.out.println();
                    System.out.println("1 - Rent, 2 - Put Back");
                    System.out.print("Enter selection: ");
                    int rentPutBackGame = sc.nextInt();
                    if (rentPutBackGame == 1)
                        newStore.gamesInStock().get(selectGame - 1).setRented(true);
                }
                rentMenu();
                selection = sc.nextInt();
            }

            if (selection == 3)
            {
                double cost = 0;
                System.out.println();
                System.out.println("Receipt");
                System.out.println("Rented Videos: ");
                for (int i = 0; i < newStore.getVideos().size(); i++)
                {
                    if (newStore.getVideos().get(i).getRented() == true)
                    {
                        System.out.printf("        %-20s      $   %3.2f", newStore.getVideos().get(i).getTitle(), newStore.getVideos().get(i).getCost());
                        cost += newStore.getVideos().get(i).getCost();
                        System.out.println();
                    }
                }
                System.out.println();
                System.out.println("Rented Games: ");
                for (int i = 0; i < newStore.getGames().size(); i++)
                {
                    if (newStore.getGames().get(i).getRented() == true)
                    {
                        System.out.printf("        %-20s      $   %3.2f", newStore.getGames().get(i).getTitle(), newStore.getGames().get(i).getCost());
                        cost += newStore.getGames().get(i).getCost();
                        System.out.println();
                    }
                }
                System.out.printf("Subtotal:                         $   %3.2f", cost);
                double tax = cost * 0.0825;
                System.out.printf("\nTax:                              $   %3.2f", tax);
                double total = cost + tax;
                System.out.printf("\nTotal:                            $   %3.2f", total);

                System.out.println();
                System.out.println();
                System.out.println("Enter \"exit\" to quit");
                String exit = sc.next();
                if (exit.equals("exit"))
                    System.exit(0);
            }

        }
    }

    public static void rentMenu()
    {
        System.out.println();
        System.out.println("Renting Menu");
        System.out.println("1. Rent Movie");
        System.out.println("2. Rent Game");
        System.out.println("3. Checkout");
        System.out.print("Enter selection: ");
    }

}
