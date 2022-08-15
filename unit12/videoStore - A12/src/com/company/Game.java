package com.company;

public class Game extends Rental {

    public static final int G = 0;
    public static final int EVERYONE = 1;
    public static final int EVERYONE_TEN_PLUS = 2;
    public static final int TEEN = 3;
    public static final int MATURE = 4;
    public static final int ADULTS_ONLY = 5;
    public static final int RATING_PENDING = 6;
    private String platform;
    private int numberOfPlayers;

    public Game (String title, double cost, int rating, boolean rented, String platform, int numberOfPlayers)
    {
        super(title, cost, rating, rented);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getPlatform()
    {
        return platform;
    }

    public int getNumberOfPlayers()
    {
        return numberOfPlayers;
    }

    @Override
    public String toString()
    {
        String s = "";
        s += "Title:                   " + getTitle();
        s += "\nRating:                  " + getRating();
        s += "\nCost:                    " + getCost();
        s += "\nPlatform:                " + getPlatform();
        s += "\nNumber of Players:       " + getNumberOfPlayers();

        return s;
    }
}
