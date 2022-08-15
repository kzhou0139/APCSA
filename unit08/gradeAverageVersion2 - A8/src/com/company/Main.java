package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("---Grade Average Version Two---");
        System.out.println();
        System.out.println("How many grades does the student have?");
        int numGrades = sc.nextInt();
        System.out.println();
        double [] grades = new double[numGrades];

        for (int i = 0; i < grades.length; i++)
        {
            int gradeN = i + 1;
            System.out.print("Enter a grade " + gradeN + ": ");
            double newGrade = sc.nextDouble();
            grades[i] = newGrade;
        }

        System.out.println();
        double gradeTotal = 0;

        for (int j = 0; j < grades.length; j++)
        {
            gradeTotal += grades[j];
        }

        double average = gradeTotal / numGrades;

        System.out.printf("The student's average is %3.2f.", average);
        System.out.println();

        if (average >= 90)
            System.out.println("The student's grade letter is a(n) A.");
        if ((average < 90) && (average >= 80))
            System.out.println("The student's grade letter is a(n) B.");
        if ((average < 80) && (average >= 70))
            System.out.println("The student's grade letter is a(n) C.");
        if (average < 70)
            System.out.println("The student's grade letter is a(n) F.");
    }
}
