package com.company;

public class YellowZombieDie extends ZombieDie {

    public YellowZombieDie()
    {
        super(YELLOW);
    }

    @Override
    public void roll()
    {
        int dieRoll = (int) (Math.random() * 6);
        if (dieRoll == 0 || dieRoll == 1)
            setValue(RUNNER);
        else if (dieRoll == 2 || dieRoll == 3)
            setValue(BRAIN);
        else
            setValue(SHOT);
    }
}
