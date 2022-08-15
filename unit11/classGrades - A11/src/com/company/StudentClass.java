package com.company;

import java.util.ArrayList;

public class StudentClass {

    public static final int ACADEMIC = 0;
    public static final int PRE_AP = 1;
    public static final int AP = 2;
    private double majorWeight;
    private double minorWeight;
    private double otherWeight;
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    private String className;
    private int type;

    public StudentClass (String className, int type)
    {
        this.className = className;
        this.type = type;
        if (type == 0)
        {
            majorWeight = 0.55;
            minorWeight = 0.30;
            otherWeight = 0.15;
        }
        if (type == 1)
        {
            majorWeight = 0.60;
            minorWeight = 0.30;
            otherWeight = 0.10;
        }
        if (type == 2)
        {
            majorWeight = 0.70;
            minorWeight = 0.20;
            otherWeight = 0.10;
        }
    }

    public String getClassName ()
    {
        return className;
    }

    public ArrayList<Assignment> getAssignments ()
    {
        return assignments;
    }

    public double getMinorWeight ()
    {
        return minorWeight;
    }

    public double getMajorWeight ()
    {
        return majorWeight;
    }

    public double getOtherWeight ()
    {
        return  otherWeight;
    }

    public int getType ()
    {
        return type;
    }

    public void addAssignment (Assignment a)
    {
        assignments.add(a);
    }

    public double average ()
    {
        double finalAvg = (minorAverage() * getMinorWeight()) + (majorAverage() * getMajorWeight()) + (otherAverage() * getOtherWeight());
        return finalAvg;
    }

    public double minorAverage ()
    {
        double total = 0;
        int numMinor = 0;
        double average = 0;
        for (int i = 0; i < assignments.size(); i++)
        {
            if (assignments.get(i).getCategory() == 1)
            {
                total += assignments.get(i).getGrade();
                numMinor++;
            }
        }

        if (numMinor > 0)
            average = total / numMinor;
        else
            average = 100;

        return average;
    }

    public double majorAverage ()
    {
        double total = 0;
        int numMajor = 0;
        double average = 0;
        for (int i = 0; i < assignments.size(); i++)
        {
            if (assignments.get(i).getCategory() == 2)
            {
                total += assignments.get(i).getGrade();
                numMajor++;
            }
        }

        if (numMajor > 0)
            average = total / numMajor;
        else
            average = 100;

        return average;
    }

    public double otherAverage ()
    {
        double total = 0;
        int numOther = 0;
        double average = 0;
        for (int i = 0; i < assignments.size(); i++)
        {
            if (assignments.get(i).getCategory() == 0)
            {
                total += assignments.get(i).getGrade();
                numOther++;
            }
        }

        if (numOther > 0)
            average = total / numOther;
        else
            average = 100;

        return average;
    }

}
