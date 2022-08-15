package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> brains = new ArrayList<String>();
        ArrayList<String> shots = new ArrayList<String>();
        ArrayList<String> runners = new ArrayList<String>();
        ArrayList<String> hand = new ArrayList<String>();
        ZombieDiceBucket dieBucket = new ZombieDiceBucket();
        String[] dieColors = new String[3];

        System.out.print("How many players will be playing (2-5): ");
        int numOfPlayers = sc.nextInt();
        int[] scores = new int[numOfPlayers];
        int[] numOfTurns = new int[numOfPlayers];
        String[] names = new String[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++)
        {
            System.out.print("Enter a player's name: ");
            String name = sc.next();
            names[i] = name;
        }

        while (true)
        {
            for (int i = 0; i < numOfPlayers; i++)
            {
                numOfTurns[i]++;
                System.out.println();
                System.out.println(names[i] + " it is your turn and you have " + scores[i] + " brains in your bank.");
                System.out.println();
                System.out.println("       Turn Summary:");
                System.out.println("                Brains: " + brains);
                System.out.println("                Shots: " + shots);
                System.out.println("                Runners: " + runners);
                System.out.println("       1. Keep Going");
                System.out.println("       2. Stop & add to bank");
                System.out.print("       Enter selection: ");
                int selection = sc.nextInt();

                ZombieDie die1 = null;
                ZombieDie die2 = null;
                ZombieDie die3 = null;

                dieBucket.loadBucket();
                while (selection == 1)
                {
                    System.out.println();
                    hand.clear();                                  //draws die colors
                    int[] isFull = new int[3];
                    if (runners.size() != 0)
                    {
                        for (int a = 0; a < runners.size(); a++)
                        {
                            if (runners.get(a) == "Red-Runner")
                            {
                                hand.add("Red");
                                isFull[a] = 1;
                                if (a == 0)
                                    die1 = dieBucket.getRed();
                                if (a == 1)
                                    die2 = dieBucket.getRed();
                                if (a == 2)
                                    die3 = dieBucket.getRed();
                            }
                            if (runners.get(a) == "Green-Runner")
                            {
                                hand.add("Green");
                                isFull[a] = 1;
                                if (a == 0)
                                    die1 = dieBucket.getGreen();
                                if (a == 1)
                                    die2 = dieBucket.getGreen();
                                if (a == 2)
                                    die3 = dieBucket.getGreen();
                            }
                            if (runners.get(a) == "Yellow-Runner")
                            {
                                hand.add("Yellow");
                                isFull[a] = 1;
                                if (a == 0)
                                    die1 = dieBucket.getYellow();
                                if (a == 1)
                                    die2 = dieBucket.getYellow();
                                if (a == 2)
                                    die3 = dieBucket.getYellow();
                            }
                        }
                        if (isFull[0] == 0)
                        {
                            die1 = dieBucket.draw();
                            dieColors[0] = die1.toString();
                            hand.add(dieColors[0]);
                            dieBucket.remove(die1);
                        }
                        if (isFull[1] == 0)
                        {
                            die2 = dieBucket.draw();
                            dieColors[1] = die2.toString();
                            hand.add(dieColors[1]);
                            dieBucket.remove(die2);
                        }
                        if (isFull[2] == 0)
                        {
                            die3 = dieBucket.draw();
                            dieColors[2] = die3.toString();
                            hand.add(dieColors[2]);
                            dieBucket.remove(die3);
                        }
                    }
                    if (runners.size() == 0)
                    {
                        die1 = dieBucket.draw();
                        dieColors[0] = die1.toString();
                        hand.add(dieColors[0]);
                        dieBucket.remove(die1);
                        die2 = dieBucket.draw();
                        dieColors[1] = die2.toString();
                        hand.add(dieColors[1]);
                        dieBucket.remove(die2);
                        die3 = dieBucket.draw();
                        dieColors[2] = die3.toString();
                        hand.add(dieColors[2]);
                        dieBucket.remove(die3);
                    }
                    if (die1 == null || die2 == null || die3 == null)
                    {
                        hand.clear();
                        dieBucket.loadBucket();
                        if (runners.size() != 0)
                        {
                            for (int a = 0; a < runners.size(); a++)
                            {
                                if (runners.get(a) == "Red-Runner")
                                {
                                    hand.add("Red");
                                    isFull[a] = 1;
                                    if (a == 0)
                                        die1 = dieBucket.getRed();
                                    if (a == 1)
                                        die2 = dieBucket.getRed();
                                    if (a == 2)
                                        die3 = dieBucket.getRed();
                                }
                                if (runners.get(a) == "Green-Runner")
                                {
                                    hand.add("Green");
                                    isFull[a] = 1;
                                    if (a == 0)
                                        die1 = dieBucket.getGreen();
                                    if (a == 1)
                                        die2 = dieBucket.getGreen();
                                    if (a == 2)
                                        die3 = dieBucket.getGreen();
                                }
                                if (runners.get(a) == "Yellow-Runner")
                                {
                                    hand.add("Yellow");
                                    isFull[a] = 1;
                                    if (a == 0)
                                        die1 = dieBucket.getYellow();
                                    if (a == 1)
                                        die2 = dieBucket.getYellow();
                                    if (a == 2)
                                        die3 = dieBucket.getYellow();
                                }
                            }
                            if (isFull[0] == 0)
                            {
                                die1 = dieBucket.draw();
                                dieColors[0] = die1.toString();
                                hand.add(dieColors[0]);
                                dieBucket.remove(die1);
                            }
                            if (isFull[1] == 0)
                            {
                                die2 = dieBucket.draw();
                                dieColors[1] = die2.toString();
                                hand.add(dieColors[1]);
                                dieBucket.remove(die2);
                            }
                            if (isFull[2] == 0)
                            {
                                die3 = dieBucket.draw();
                                dieColors[2] = die3.toString();
                                hand.add(dieColors[2]);
                                dieBucket.remove(die3);
                            }
                        }
                        if (runners.size() == 0)
                        {
                            die1 = dieBucket.draw();
                            dieColors[0] = die1.toString();
                            hand.add(dieColors[0]);
                            dieBucket.remove(die1);
                            die2 = dieBucket.draw();
                            dieColors[1] = die2.toString();
                            hand.add(dieColors[1]);
                            dieBucket.remove(die2);
                            die3 = dieBucket.draw();
                            dieColors[2] = die3.toString();
                            hand.add(dieColors[2]);
                            dieBucket.remove(die3);
                        }

                    }
                    runners.clear();

                    System.out.println("After drawing you have the following dice: " + hand);
                    System.out.println("         Rolling...");
                    hand.clear();
                    die1.roll();   //why can die1 access roll if die1 is a ZombieDie object and roll is a method of the child class
                    hand.add(die1.toString());
                    if (die1.toString() == "Red-Runner" || die1.toString() == "Yellow-Runner" || die1.toString() == "Green-Runner")
                        runners.add(die1.toString());
                    if (die1.toString() == "Red-Brain" || die1.toString() == "Yellow-Brain" || die1.toString() == "Green-Brain")
                        brains.add(die1.toString());
                    if (die1.toString() == "Red-Shot" || die1.toString() == "Yellow-Shot" || die1.toString() == "Shot-Runner")
                        shots.add(die1.toString());

                    die2.roll();
                    hand.add(die2.toString());
                    if (die2.toString() == "Red-Runner" || die2.toString() == "Yellow-Runner" || die2.toString() == "Green-Runner")
                        runners.add(die2.toString());
                    if (die2.toString() == "Red-Brain" || die2.toString() == "Yellow-Brain" || die2.toString() == "Green-Brain")
                        brains.add(die2.toString());
                    if (die2.toString() == "Red-Shot" || die2.toString() == "Yellow-Shot" || die2.toString() == "Shot-Runner")
                        shots.add(die2.toString());

                    die3.roll();
                    hand.add(die3.toString());
                    if (die3.toString() == "Red-Runner" || die3.toString() == "Yellow-Runner" || die3.toString() == "Green-Runner")
                        runners.add(die3.toString());
                    if (die3.toString() == "Red-Brain" || die3.toString() == "Yellow-Brain" || die3.toString() == "Green-Brain")
                        brains.add(die3.toString());
                    if (die3.toString() == "Red-Shot" || die3.toString() == "Yellow-Shot" || die3.toString() == "Shot-Runner")
                        shots.add(die3.toString());

                    System.out.println("The results of your rolls were: " + hand);
                    if (shots.size() >= 3)
                    {
                        System.out.println();
                        System.out.println("You were shot 3 times.");
                        System.out.println("You lost all the brains you earned this turn.");
                        scores[i] = 0;
                        brains.clear();
                        shots.clear();
                        runners.clear();
                        break;
                    }
                    else
                    {
                        System.out.println("Turn summary: ");
                        System.out.println("         Brains:  " + brains);
                        System.out.println("         Shots:   " + shots);
                        System.out.println("         Runners: " + runners);
                        System.out.println("1. Keep Going");
                        System.out.println("2. Stop & add to bank");
                        System.out.print("Enter selection: ");
                        selection = sc.nextInt();
                    }
                }

                if (selection == 2)
                {
                    int not = 0;
                    int mostBrains = 0;
                    String winner = "";
                    System.out.println();
                    scores[i] += brains.size();
                    System.out.println("You ate " + brains.size() + " brains this turn giving you " + scores[i] + " brains now in your bank.");
                    for (int w = 0; w < scores.length; w++)
                    {
                        if (numOfTurns[w] != numOfTurns[i])
                            not = 1;
                    }
                    if (not == 0)
                    {
                        for (int x = 0; x < scores.length; x++)
                        {
                            if (scores[x] > mostBrains)
                            {
                                mostBrains = scores[x];
                                winner = names[x];
                            }
                        }
                        if (mostBrains >= 13)
                        {
                            System.out.println(winner + " is the winner!");
                            System.exit(0);
                        }
                    }
                    brains.clear();
                    shots.clear();
                    runners.clear();
                }

            }
        }
    }

    public static String[] shuffleNames (String[] names)
    {
        int nop = names.length;
        int turn = 0;
        String[] shuffledNames = new String[names.length];
        for (int i = 0; i < names.length; i++)
        {
            turn = (int) (Math.random() * names.length);
            shuffledNames[turn] = names[i];
        }
        return shuffledNames;
    }

    public static String findWinner (String[] names, int[] scores, int not)
    {
        int mostBrains = 0;
        String winner = "";
        if (not == 0)
        {
            for (int x = 0; x < scores.length; x++)
            {
                if (scores[x] > mostBrains)
                {
                    mostBrains = scores[x];
                    winner = names[x];
                }
            }
        }
        if (mostBrains >= 13)
            return winner;
        else
            return null;
    }

}