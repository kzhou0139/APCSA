package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("---String Bomb---");
        System.out.println();
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println();

        String finalOutput = "";
        String[] broken = input.split(" ");

        for (int s = 0; s < broken.length; s++)
        {
            String output = "";
            if (broken[s].length() % 2 == 0)
            {
                if (broken[s].length() == 2)
                {
                    String upper = String.valueOf(broken[s]);
                    output = upper.toUpperCase();
                }
                if (broken[s].length() == 4)
                    output = "****";
                if (broken[s].length() == 6)
                {
                    String six = String.valueOf(broken[s]);
                    char[] six6 = six.toCharArray();
                    char temp = six6[0];
                    six6[0] = six6[5];
                    six6[5] = temp;
                    temp = six6[2];
                    six6[2] = six6[3];
                    six6[3] = temp;
                    output = String.valueOf(six6);
                }
                if (broken[s].length() >= 8)
                {
                    String eight = String.valueOf(broken[s]);
                    char[] eight8 = eight.toCharArray();
                    int fHalf = eight8.length / 2;
                    char[] firstHalf = new char[fHalf];
                    for (int i = 0; i < fHalf; i++)
                    {
                        firstHalf[i] = eight8[i];
                    }
                    char[] secondHalf = new char [fHalf];
                    int w = fHalf;
                    for (int j = 0; j < fHalf; j++)
                    {
                        secondHalf[j] = eight8[w];
                        w++;
                    }
                    String firstHalfS = String.valueOf(firstHalf);
                    String secondHalfS = String.valueOf(secondHalf);
                    output = firstHalfS + " " + secondHalfS;
                }
            }

            else
            {
                if (broken[s].length() == 1)
                    output = "%";
                if (broken[s].length() == 3)
                {
                    String three = String.valueOf(broken[s]);
                    char[] t = three.toCharArray();
                    t[0] = 60;
                    t[2] = 62;
                    output = String.valueOf(t);
                }
                if (broken[s].length() == 5)
                {
                    String q = "";
                    String five = String.valueOf(broken[s]);
                    char[] five5 = five.toCharArray();
                    for (int k = 0; k < five5.length; k++)
                    {
                        if (five5[k] >= 97 && five5[k] <= 122)
                        {
                            q = String.valueOf(five5[k]);
                            q = q.toUpperCase();
                        }
                        else
                        {
                            q = String.valueOf(five5[k]);
                            q = q.toLowerCase();
                        }
                        output += q;
                    }
                }
                if (broken[s].length() >= 7)
                {
                    String seven = String.valueOf(broken[s]);
                    char[] seven7 = seven.toCharArray();
                    char[] oddChar = new char[(seven.length() / 2) + 1];
                    int start = 0;
                    for (int a = 0; a < seven7.length; a += 2)
                    {
                        oddChar[start] = seven7[a];
                        start++;
                    }
                    output = String.valueOf(oddChar);
                }
            }

            finalOutput += output + " ";
        }

        System.out.println("The converted sentence is: " + finalOutput);

    }
}
