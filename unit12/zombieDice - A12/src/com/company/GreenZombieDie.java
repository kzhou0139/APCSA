package com.company;

public class GreenZombieDie extends ZombieDie {

    public GreenZombieDie()
    {
        super(GREEN);
    }

    @Override
    public void roll()
    {
        int dieRoll = (int) (Math.random() * 6);
        if (dieRoll == 0 || dieRoll == 1)
            setValue(RUNNER);
        else if (dieRoll == 2 || dieRoll == 3 || dieRoll == 4)
            setValue(BRAIN);
        else
            setValue(SHOT);
    }
}
