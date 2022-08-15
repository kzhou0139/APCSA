package com.company;

public class Player {

    private int bank;
    private int current;
    private String playerName;

    public Player(String name)
    {
        this.playerName = name;
        this.bank = 0;
        this.current = 0;
    }

    public int getBank()
    {
        return bank;
    }

    public int getCurrent()
    {
        return current;
    }

    public void resetCurrent()
    {
        current = 0;
    }

    public void bankCurrent()
    {
        bank += current;
    }

    public void addToCurrent (int v)
    {
        current += v;
    }

    public String toString()
    {
        String s = playerName;
        return s;
    }
}
