package com.company;

public class MyPoint {

    private double x;
    private double y;

    public MyPoint()
    {
        x = y = 1;
    }

    public MyPoint (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public String toString()
    {
        String s = "(" + x + ", " + y + ")";
        return s;
    }
}
