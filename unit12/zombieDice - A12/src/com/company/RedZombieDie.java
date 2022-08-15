package com.company;

public class RedZombieDie extends ZombieDie {

    public RedZombieDie()
    {
        super(RED);
    }

    @Override
    public void roll()
    {
        int dieRoll = (int) (Math.random() * 6);
        if (dieRoll == 0 || dieRoll == 1)
            setValue(RUNNER);
        else if (dieRoll == 2)
            setValue(BRAIN);
        else
            setValue(SHOT);
    }
}
