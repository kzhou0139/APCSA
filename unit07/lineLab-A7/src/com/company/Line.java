package com.company;

public class Line {

    private MyPoint p1;
    private MyPoint p2;
    private double slope;
    private double xInt;
    private double yInt;

    public Line (MyPoint p1, MyPoint p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        fixData();
    }

    public MyPoint getPoint1()
    {
        return p1;
    }

    public MyPoint getPoint2()
    {
        return p2;
    }

    public double getSlope()
    {
        return slope;
    }

    public double getYInt()
    {
        return yInt;
    }

    public double getXInt()
    {
        return xInt;
    }

    public void setPoint1 (MyPoint p1)
    {
        this.p1 = p1;
        fixData();
    }

    public void setPoint2 (MyPoint p2)
    {
        this.p2 = p2;
        fixData();
    }

    public void fixData()
    {
        slope = (p2.getY() - p1.getY()) / (p2.getX() -p1.getX());
        xInt = ((p2.getY() * (p2.getX() - p1.getX())) - ((p2.getY() - p1.getY()) * p2.getX())) / (p1.getY() - p2.getY());
        yInt = ((p2.getY() * (p2.getX() - p1.getX())) - ((p2.getY() - p1.getY()) * p2.getX()))/ (p2.getX() - p1.getX());
    }

    public String toString()
    {
        String s = "Points: [(" + p1.getX() + ", " + p1.getY() + ") , (" + p2.getX() + ", " + p2.getY() + ")]";
        s += "\nSlope: " + getSlope();
        s += "\nX Intercept: " + getXInt();
        s += "\nY Intercept: " + getYInt();
        s+= "\nEquation: y = " + getSlope() + "x +" + getYInt();
        return s;
    }

}
