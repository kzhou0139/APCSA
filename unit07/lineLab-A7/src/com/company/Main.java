package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Set up your lines: ");
        System.out.println();
        System.out.println("Line one point one...");
        MyPoint L1P1 = makePoint();
        System.out.println("Line one point two...");
        MyPoint L1P2 = makePoint();
        System.out.println("Line two point one...");
        MyPoint L2P1 = makePoint();
        System.out.println("Line two point two...");
        MyPoint L2P2 = makePoint();

        Line L1 = new Line (L1P1, L1P2);
        Line L2 = new Line (L2P1, L2P2);

        mathMenu();
        int selection = sc.nextInt();

        int changeSelection = 0;

        while ((selection >= 1) && (selection <= 6))
        {
            if (selection == 1)
            {
                System.out.println();
                System.out.println("Data for line 1: ");
                System.out.println(L1.toString());
                changeMenu();
                changeSelection = sc.nextInt();
                if (changeSelection == 1)
                {
                    System.out.println("New point one for Line one...");
                    L1P1 = makePoint();
                    L1.setPoint1(L1P1);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else if (changeSelection == 2)
                {
                    System.out.println("New point two for Line one...");
                    L1P2 = makePoint();
                    L1.setPoint2(L1P2);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else if (changeSelection == 3)
                {
                    System.out.println("New point one for Line one...");
                    L1P1 = makePoint();
                    L1.setPoint1(L1P1);
                    System.out.println("New point two for Line one...");
                    L1P2 = makePoint();
                    L1.setPoint2(L1P2);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else
                {
                    mathMenu();
                    selection = sc.nextInt();
                }
            }

            else if (selection == 2)
            {
                System.out.println();
                System.out.println("Data for line 2: ");
                System.out.println(L2.toString());
                changeMenu();
                changeSelection = sc.nextInt();
                if (changeSelection == 1)
                {
                    System.out.println("New point one for Line two...");
                    L2P1 = makePoint();
                    L2.setPoint1(L2P1);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else if (changeSelection == 2)
                {
                    System.out.println("New point two for Line two...");
                    L2P2 = makePoint();
                    L2.setPoint2(L2P2);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else if (changeSelection == 3)
                {
                    System.out.println("New point one for Line two...");
                    L2P1 = makePoint();
                    L2.setPoint1(L2P1);
                    System.out.println("New point two for Line two...");
                    L2P2 = makePoint();
                    L2.setPoint2(L2P2);
                    mathMenu();
                    selection = sc.nextInt();
                }
                else
                {
                    mathMenu();
                    selection = sc.nextInt();
                }
            }

            else if (selection == 3)
            {
                System.out.println();
                System.out.println("Line one: ");
                System.out.println(L1.toString());
                mathMenu();
                selection = sc.nextInt();
            }

            else if (selection == 4)
            {
                System.out.println();
                System.out.println("Line two: ");
                System.out.println(L2.toString());
                mathMenu();
                selection = sc.nextInt();
            }

            else if (selection == 5)
            {
                double xIntersect = (L2.getYInt() - L1.getYInt()) / (L1.getSlope() - L2.getSlope());
                double yIntersect = ((L1.getSlope() * L2.getYInt()) - (L2.getSlope() * L1.getYInt())) / (L1.getSlope() - L2.getSlope());

                if (L1.getSlope() == L2.getSlope())
                {
                    System.out.println();
                    System.out.println("The lines do not intersect.");
                    mathMenu();
                    selection = sc.nextInt();
                }
                else
                {
                    System.out.println();
                    System.out.println("The lines intersect at point (" + xIntersect + ", " + yIntersect + ")");
                    mathMenu();
                    selection = sc.nextInt();
                }
            }

            else
            {
                System.out.println("Good bye.");
                break;
            }
        }

        while ((selection < 1) || (selection > 6))
        {
            System.out.println();
            System.out.println("Invalid input. Please enter a number between 1 and 6.");
            mathMenu();
            selection = sc.nextInt();
        }

        }

    public static MyPoint makePoint()
    {
        Scanner sc1 = new Scanner (System.in);
        System.out.print("Enter the x value: ");
        int x = sc1.nextInt();
        System.out.print("Enter the y value: ");
        int y = sc1.nextInt();

        MyPoint point = new MyPoint(x, y);
        return point;
    }

    public static void mathMenu()
    {
        System.out.println();
        System.out.println("-Main Menu-");
        System.out.println("1. Change Line 1");
        System.out.println("2. Change Line 2");
        System.out.println("3. View Line 1");
        System.out.println("4. View Line 2");
        System.out.println("5. View line intersection");
        System.out.println("6. Exit");
        System.out.print("Enter selection: ");
    }

    public static void changeMenu()
    {
        System.out.println();
        System.out.println("-Change Menu");
        System.out.println("1. Change Point 1");
        System.out.println("2. Change Point 2");
        System.out.println("3. Change Both Points");
        System.out.println("4. Cancel");
        System.out.print("Enter selection: ");
    }
}
