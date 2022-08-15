package com.company;
import java.util.*;

public class ZombieDiceBucket {

    private ArrayList<ZombieDie> bucket = new ArrayList<ZombieDie>();

    public ZombieDiceBucket()
    {
        this.bucket = new ArrayList<ZombieDie>();
    }

    public void loadBucket()
    {
        bucket.clear();
        bucket.add(new GreenZombieDie());
        bucket.add(new GreenZombieDie());
        bucket.add(new GreenZombieDie());
        bucket.add(new GreenZombieDie());
        bucket.add(new GreenZombieDie());
        bucket.add(new GreenZombieDie());
        bucket.add(new YellowZombieDie());
        bucket.add(new YellowZombieDie());
        bucket.add(new YellowZombieDie());
        bucket.add(new YellowZombieDie());
        bucket.add(new RedZombieDie());
        bucket.add(new RedZombieDie());
        bucket.add(new RedZombieDie());
    }

    public ZombieDie draw()
    {
        if (bucket.isEmpty())
            return null;
        else
        {
            int drawDie = (int) (Math.random() * bucket.size());
            ZombieDie die = bucket.get(drawDie);
            bucket.remove(drawDie);
            die.toString();
            return die;
        }
    }

    public void remove(ZombieDie a)
    {
        bucket.remove(a);
    }

    public ZombieDie getGreen()
    {
        ZombieDie dieColor = new GreenZombieDie();
        return dieColor;
    }

    public ZombieDie getRed()
    {
        ZombieDie dieColor = new RedZombieDie();
        return dieColor;
    }

    public ZombieDie getYellow()
    {
        ZombieDie dieColor = new YellowZombieDie();
        return dieColor;
    }

}
