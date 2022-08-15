package com.company;

public abstract class ZombieDie {

    public static final int NOT_ROLLED = 0;
    public static final int RUNNER = 1;
    public static final int BRAIN = 2;
    public static final int SHOT = 3;
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int YELLOW = 3;
    private int dieColor;
    private int value;

    public ZombieDie (int dieColor)
    {
        this.dieColor = dieColor;
        this.value = NOT_ROLLED;
    }

    public int getValue()
    {
        return value;
    }

    public int getDieColor()
    {
        return dieColor;
    }

    public void setDieColor (int dieColor)
    {
        this.dieColor = dieColor;
    }

    public void setValue (int value)
    {
        this.value = value;
    }

    public String toString()
    {
        String s = "";
        if (value == NOT_ROLLED)
        {
            if (dieColor == 1)
                s = "Red";
            if (dieColor == 2)
                s = "Green";
            if (dieColor == 3)
                s = "Yellow";
        }
        else
        {
            if (dieColor == RED)
            {
                if (value == 1)
                    s = "Red-Runner";
                if (value == 2)
                    s = "Red-Brain";
                if (value == 3)
                    s = "Red-Shot";
            }
            if (dieColor == GREEN)
            {
                if (value == 1)
                    s = "Green-Runner";
                if (value == 2)
                    s = "Green-Brain";
                if (value == 3)
                    s = "Green-Shot";
            }
            if (dieColor == YELLOW)
            {
                if (value == 1)
                    s = "Yellow-Runner";
                if (value == 2)
                    s = "Yellow-Brain";
                if (value == 3)
                    s = "Yellow-Shot";
            }
        }
        return s;
    }

    public abstract void roll();

}
