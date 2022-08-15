package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-Class Grades-");
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the name of your class: ");
        String className = sc.nextLine();
        System.out.print("Enter the type of class (0 - Academic, 1 - Pre-AP, 2 - AP): ");
        int classType = sc.nextInt();
        while (classType < 0 || classType > 2)
        {
            System.out.println("Invalid input, try again.");
            System.out.print("Enter the type of class (0 - Academic, 1 - Pre-AP, 2 - AP): ");
            classType = sc.nextInt();
        }
        StudentClass newClass = new StudentClass(className, classType);

        printMenu();
        int selection = sc.nextInt();

        while (true)
        {
            if (selection == 1)
            {
                System.out.println();
                System.out.print("Enter the name of the assignment: ");
                String assignmentName = sc.nextLine();
                assignmentName = sc.nextLine();
                System.out.print("Enter the type of assignment (0 - other, 1 - Minor, 2 - Major): ");
                int assignmentCategory = sc.nextInt();
                System.out.print("Enter the grade: ");
                double assignmentGrade = sc.nextInt();
                Assignment newAssignment = new Assignment(assignmentName, assignmentGrade, assignmentCategory);
                newClass.addAssignment(newAssignment);
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 2)
            {
                System.out.println();
                System.out.println("-Remove Menu-");
                for (int i = 0; i < newClass.getAssignments().size(); i++)
                {
                    int categoryI =  newClass.getAssignments().get(i).getCategory();
                    String categoryS = "";
                    if (categoryI == 0)
                        categoryS = "other";
                    if (categoryI == 1)
                        categoryS = "minor";
                    if (categoryI == 2)
                        categoryS = "major";
                    System.out.println(i + ". " + newClass.getAssignments().get(i).getAssignmentName() + " (" + categoryS + ") " + newClass.getAssignments().get(i).getGrade());
                }
                int sizeOne = newClass.getAssignments().size();
                System.out.println(sizeOne + ". Cancel");
                System.out.print("Enter selection: ");
                int removeSelection = sc.nextInt();
                if (removeSelection != sizeOne)
                    newClass.getAssignments().remove(removeSelection);
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 3)
            {
                System.out.println();
                System.out.println("-Modify Menu-");
                for (int i = 0; i < newClass.getAssignments().size(); i++)
                {
                    int categoryI =  newClass.getAssignments().get(i).getCategory();
                    String categoryS = "";
                    if (categoryI == 0)
                        categoryS = "other";
                    if (categoryI == 1)
                        categoryS = "minor";
                    if (categoryI == 2)
                        categoryS = "major";
                    System.out.println(i + ". " + newClass.getAssignments().get(i).getAssignmentName() + " (" + categoryS + ") " + newClass.getAssignments().get(i).getGrade());
                }
                int sizeOne = newClass.getAssignments().size();
                System.out.println(sizeOne + ". Cancel");
                System.out.print("Enter Selection: ");
                int modifySelection = sc.nextInt();
                System.out.println();

                if (modifySelection != sizeOne)
                {
                    System.out.println("-Change Menu-");
                    System.out.println("1. Assignment Name");
                    System.out.println("2. Grade");
                    System.out.println("3. Category");
                    System.out.println("4. Cancel");
                    System.out.print("Enter Selection: ");
                    int changeSelection = sc.nextInt();

                    if (changeSelection == 1)
                    {
                        System.out.print("Enter the new assignment name: ");
                        String newAssignmentName = sc.nextLine();
                        newClass.getAssignments().get(modifySelection).setAssignmentName(newAssignmentName);
                    }
                    if (changeSelection == 2)
                    {
                        System.out.print("Enter the new grade: ");
                        double newGrade = sc.nextDouble();
                        newClass.getAssignments().get(modifySelection).setGrade(newGrade);
                    }
                    if (changeSelection == 3)
                    {
                        System.out.print("Enter the new category: ");
                        int newCategory = sc.nextInt();
                        newClass.getAssignments().get(modifySelection).setCategory(newCategory);
                    }
                    if (changeSelection == 4)
                    {
                        printMenu();
                        selection = sc.nextInt();
                    }
                }
                else
                {
                    printMenu();
                    selection = sc.nextInt();
                }
            }

            if (selection == 4)
            {
                int typeI = newClass.getType();
                String typeS = "";
                if (typeI == 0)
                    typeS = "Academic";
                else if (typeI == 1)
                    typeS = "Pre-AP";
                else
                    typeS = "AP";
                System.out.println();
                System.out.println("Class Name:         " + newClass.getClassName());
                System.out.println("Type:               " + typeS);
                System.out.println();
                System.out.printf("Other Weight/Points:       %2.2f /  %2.2f", newClass.getOtherWeight(), newClass.otherAverage() * newClass.getOtherWeight());
                System.out.printf("\nMinor Weight/Points:       %2.2f /  %2.2f", newClass.getMinorWeight(), newClass.minorAverage() * newClass.getMinorWeight());
                System.out.printf("\nMajor Weight/Points:       %2.2f /  %2.2f", newClass.getMajorWeight(), newClass.majorAverage() * newClass.getMajorWeight());
                System.out.printf("\nGrade:              %3.2f", newClass.average());
                System.out.println();

                System.out.printf("\nOther Assignments:  (Average) %3.2f\n", newClass.otherAverage());
                int otherX = 0;
                for (int i = 0; i < newClass.getAssignments().size(); i++)
                {
                    int type = newClass.getAssignments().get(i).getCategory();
                    if (type == 0)
                    {
                        if (otherX == 0)
                        {
                            System.out.println("   Assignment Name        Grade");
                            otherX = 1;
                        }
                        System.out.printf("   %-15s        %-17.2f\n", newClass.getAssignments().get(i).getAssignmentName(), newClass.getAssignments().get(i).getGrade());
                    }
                }
                System.out.printf("\nMinor Assignments:  (Average) %3.2f\n", newClass.minorAverage());
                int minorX = 0;
                for (int i = 0; i < newClass.getAssignments().size(); i++)
                {
                    int type = newClass.getAssignments().get(i).getCategory();
                    if (type == 1)
                    {
                        if (minorX == 0)
                        {
                            System.out.println("   Assignment Name        Grade");
                            minorX = 1;
                        }
                        System.out.printf("   %-15s        %-17.2f\n", newClass.getAssignments().get(i).getAssignmentName(), newClass.getAssignments().get(i).getGrade());
                    }
                }
                System.out.printf("\nMajor Assignments:  (Average) %3.2f\n", newClass.majorAverage());
                int majorX = 0;
                for (int i = 0; i < newClass.getAssignments().size(); i++)
                {
                    int type = newClass.getAssignments().get(i).getCategory();
                    if (type == 2)
                    {
                        if (majorX == 0)
                        {
                            System.out.println("   Assignment Name        Grade");
                            majorX = 1;
                        }
                        System.out.printf("   %-15s        %-17.2f\n", newClass.getAssignments().get(i).getAssignmentName(), newClass.getAssignments().get(i).getGrade());
                    }
                }
                printMenu();
                selection = sc.nextInt();
            }

            if (selection == 5)
                System.exit(0);
        }
    }

    public static void printMenu ()
    {
        System.out.println();
        System.out.println("-Class Menu-");
        System.out.println("1. Add Assignment");
        System.out.println("2. Remove Assignment");
        System.out.println("3. Modify Assignment");
        System.out.println("4. View Class Information");
        System.out.println("5. Exit");
        System.out.print("Enter selection: ");
    }
}
