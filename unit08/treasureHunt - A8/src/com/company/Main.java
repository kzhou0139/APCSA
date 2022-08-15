package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("---Treasure Hunt---");
        System.out.print("Enter the treasure map ('N' - No treasure and 'T; - Treasure): ");
        String s = sc.next();
        System.out.println();
        char [] treasure = s.toCharArray();
        int location = -1;

        for (int i = 0; i < treasure.length; i++)
        {
            if (treasure[i] == 'T')
            {
                location = i;
            }
        }

        if (location != -1)
            System.out.println("The treasure can be found in location " + location + ".");
        else
            System.out.println("There is no tresaure on this treasure map.");
    }
}
