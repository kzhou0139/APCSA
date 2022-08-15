package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("---Pig Latin---");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println();

        String output = "";
        String finalOutput = "";
        String[] broken = input.split(" ");

        for (int s = 0; s < broken.length; s++)
        {
            String b = String.valueOf(broken[s]);
            char[] broke = b.toCharArray();
            String consonants = "";
            int consonantsNum = 0;
            if (broke[0] == 97 || broke[0] == 101 || broke[0] == 105
                    || broke[0] == 111 || broke[0] == 117)
                output = b + "way";
            else
            {
                for (int j = 0; j < broke.length; j++)
                {
                    if (broke[j] == 97 || broke[j] == 101 || broke[j] == 105
                            || broke[j] == 111 || broke[j] == 117 || broke[j] == 121)
                        break;
                    else
                    {
                        consonants += broke[j];
                        consonantsNum = j;
                    }
                }
                String vowels = b.substring(consonantsNum + 1, broken[s].length());
                output = vowels + consonants + "ay";
            }

            for (int i = 1; i < broke.length; i++)
            {
                if (broke[i] == 117 && broke[i - 1] == 113) {
                    String sub = b.substring(0, i + 1);
                    String withoutSub = b.substring(i + 1, broken[s].length());
                    output = withoutSub + sub + "ay";
                    break;
                }

                if (broke[i] == 97 || broke[i] == 101 ||
                        broke[i] == 105 || broke[i] == 111 || broke[i] == 121)
                    break;
            }
            finalOutput += output + " ";
        }

        System.out.println("Sentence in pig latin: " + finalOutput);

    }
}
