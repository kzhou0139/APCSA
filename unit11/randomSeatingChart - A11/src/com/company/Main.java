package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("---Random Seating Chart---");
        System.out.println("Enter students' names on their own line; enter \"Done\" when all the names have been entered.");
        Scanner sc = new Scanner(System.in);

        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<Integer> Seats = new ArrayList<Integer>();

        String name = sc.next();
        Names.add(name);
        while (true)
        {
            name = sc.next();
            if (name.equals("Done") == true)
                break;
            else
                Names.add(name);
        }
        System.out.println();

        System.out.print("Enter the number of seats in your classroom: ");
        int numOfSeats = sc.nextInt();

        if (Names.size() > numOfSeats)
        {
            System.out.println();
            System.out.println("Error there are not enough seats in your classroom.");
        }

        else
        {
            for (int i = 1; i <= numOfSeats; i++)
                Seats.add(i);

            System.out.println();
            System.out.println("The seating chart is: ");
            System.out.println("name              seat");
            for (int j = 0; j < Names.size(); j++)
            {
                int seatNum = randomSeat(Seats);
                System.out.printf("%-10s" + "%10d\n", Names.get(j), seatNum);
            }
        }

    }

    public static int randomSeat (ArrayList<Integer> Seats)
    {
        int random = (int)(Math.random() * Seats.size());
        return Seats.remove(random);
    }

}
