package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("---Sentence Information---");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your sentence: ");
        String input = sc.nextLine();
        System.out.println();

        String[] broken = input.split(" ");
        System.out.println("Your sentence has " + broken.length + " words.");

        char[] inputChar = input.toCharArray();
        System.out.println("Your sentence has " + inputChar.length + " characters.");

        int vowels = 0;
        for (int i = 0; i < inputChar.length; i++)
        {
            if (inputChar[i] == 65 || inputChar[i] == 97)
                vowels++;
            if (inputChar[i] == 69 || inputChar[i] == 101)
                vowels++;
            if (inputChar[i] == 73 || inputChar[i] == 105)
                vowels++;
            if (inputChar[i] == 79 || inputChar[i] == 111)
                vowels++;
            if (inputChar[i] == 85 || inputChar[i] == 117)
                vowels++;
        }
        System.out.println("Your sentence has " + vowels + " vowels.");

        int consonants = 0;
        for (int k = 0; k < inputChar.length; k++)
        {
            if (inputChar[k] != 65 && inputChar[k] != 97 && inputChar[k] != 69 && inputChar[k] != 101
            && inputChar[k] != 73 && inputChar[k] != 105 && inputChar[k] != 79 && inputChar[k] != 111
            && inputChar[k] != 85 && inputChar[k] != 117 && inputChar[k] != 32 && inputChar[k] != 34
            && inputChar[k] != 33 && inputChar[k] != 39 && inputChar[k] != 46 && inputChar[k] != 63
            && inputChar[k] != 59 && inputChar[k] != 44)
                consonants++;
        }
        System.out.println("Your sentence has " + consonants + " consonants.");

        int punctuators = 0;
        for (int j = 0; j < inputChar.length; j++)
        {
            if (inputChar[j] == 34 || inputChar[j] == 33)
                punctuators++;
            if (inputChar[j] == 39 || inputChar[j] == 46)
                punctuators++;
            if (inputChar[j] == 63 || inputChar[j] == 59)
                punctuators++;
            if (inputChar[j] == 44)
                punctuators++;
        }
        System.out.println("Your sentence has " + punctuators + " punctuators.");
    }
}
