package com.company;
import java.util.ArrayList;

public class Video extends Rental {

    public static final int G = 0;
    public static final int PG = 1;
    public static final int PG13 = 2;
    public static final int R = 3;
    private String director;
    private String description;
    private ArrayList<String> leadingActors = new ArrayList<String>();
    private int minutes;

    public Video (String title, double cost, int rating, boolean rented, String description, String director,
                  ArrayList<String> leadingActors, int minutes)
    {
        super(title, cost, rating, rented);
        this.description = description;
        this.director = director;
        this.leadingActors = leadingActors;
        this.minutes = minutes;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDirector()
    {
        return director;
    }

    public ArrayList<String> getLeadingActors()
    {
        return leadingActors;
    }

    public int getMinutes()
    {
        return minutes;
    }

    @Override
    public String toString()
    {
        String ratingS = "";
        String s = "";
        s += "Title:                   " + getTitle();
        if (getRating() == 0)
            ratingS = "G";
        if (getRating() == 1)
            ratingS = "PG";
        if (getRating() == 2)
            ratingS = "PG13";
        if (getRating() == 3)
            ratingS = "R";
        s += "\nRating:                  " + ratingS;
        s += "\nCost:                    " + getCost();
        s += "\nDirector:                " + getDirector();
        s += "\nLeading Actors:          " + getLeadingActors();
        s += "\nRuntime:                 " + getMinutes();
        s += "\nDescription:             " + getDescription();

        return s;
    }

}
