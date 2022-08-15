package com.company;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Rental> rentals = new ArrayList<Rental>();

    public VideoStore()
    {
        /*Video: String title, double cost, int rating, boolean rented, String description, String director
        ArrayList<String> leadingActors, int minutes*/

        //Video1
        String titleV1 = "Monsters Inc.";
        double costV1 = 3.99;
        int ratingV1 = 0;
        boolean rentedV1 = false;
        String descriptionV1 = "Monsters Incorporated is the largest scare factory in the monster world, and James P. Sullivan is one of its top scarers. Sullivan is a huge, intimidating monster " +
                "with blue fur, large purple spots and horns. His scare assistant, best friend and roommate is Mike Wazowski, a green, opinionated, feisty little one-eyed monster. Visiting from the " +
                "human world is Boo, a tiny girl who goes where no human has ever gone before.";
        String directorV1 = "Pete Docter";
        ArrayList<String> leadingActorsV1 = new ArrayList<String>();
        leadingActorsV1.add("John Goodman");
        leadingActorsV1.add("Billy Crystal");
        leadingActorsV1.add("Mary Gibbs");
        int minutesV1 = 96;
        Rental monstersInc = new Video(titleV1, costV1, ratingV1, rentedV1, descriptionV1, directorV1, leadingActorsV1, minutesV1);
        rentals.add(monstersInc);

        //Video2
        String titleV2 = "Coco";
        double costV2 = 3.99;
        int ratingV2 = 1;
        boolean rentedV2 = false;
        String descriptionV2 = "Despite his family's generations-old ban on music, young Miguel dreams of becoming an accomplished musician like his idol Ernesto de la Cruz. Desperate to prove his talent, " +
                "Miguel finds himself in the stunning and colorful Land of the Dead. After meeting a charming trickster named Héctor, the two new friends embark on an extraordinary journey to unlock the real story " +
                "behind Miguel's family history.";
        String directorV2 = "Adrian Molina, Lee Unkrich";
        ArrayList<String> leadingActorsV2 = new ArrayList<String>();
        leadingActorsV2.add("Anthony Gonzalez");
        leadingActorsV2.add("Benjamin Bratt");
        leadingActorsV2.add("Gael García Bernal");
        int minutesV2 = 109;
        Rental coco = new Video(titleV2, costV2, ratingV2, rentedV2, descriptionV2, directorV2, leadingActorsV2, minutesV2);
        rentals.add(coco);

        //Video3
        String titleV3 = "Wonder Woman";
        double costV3 = 3.99;
        int ratingV3 = 2;
        boolean rentedV3 = false;
        String descriptionV3 = "Before she was Wonder Woman, she was Diana, princess of the Amazons, trained to be an unconquerable warrior. Raised on a sheltered island paradise, Diana meets an American pilot who " +
                "tells her about the massive conflict that's raging in the outside world. Convinced that she can stop the threat, Diana leaves her home for the first time. Fighting alongside men in a war to end all wars," +
                " she finally discovers her full powers and true destiny.";
        String directorV3 = "Patty Jenkins";
        ArrayList<String> leadingActorsV3 = new ArrayList<String>();
        leadingActorsV3.add("Gal Gadot");
        leadingActorsV3.add("Chris Pine");
        int minutesV3 = 149;
        Rental wonderWoman = new Video(titleV3, costV3, ratingV3, rentedV3, descriptionV3, directorV3, leadingActorsV3, minutesV3);
        rentals.add(wonderWoman);

        //Video4
        String titleV4 = "A Star is Born";
        double costV4 = 3.99;
        int ratingV4 = 3;
        boolean rentedV4 = false;
        String descriptionV4 = "Seasoned musician Jackson Maine discovers -- and falls in love with -- struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jackson coaxes " +
                "her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jackson fights an ongoing battle with his own internal demons.";
        String directorV4 = "Bradley Cooper";
        ArrayList<String> leadingActorsV4 = new ArrayList<String>();
        leadingActorsV4.add("Bradley Cooper");
        leadingActorsV4.add("Lady Gaga");
        int minutesV4 = 134;
        Rental aStarIsBorn = new Video(titleV4, costV4, ratingV4, rentedV4, descriptionV4, directorV4, leadingActorsV4, minutesV4);
        rentals.add(aStarIsBorn);

        //String title, double cost, int rating, boolean rented, String platform, int numberOfPlayers
        //Game1
        String titleG1 = "Minecraft";
        double costG1 = 7.99;
        int ratingG1 = 2;
        boolean rentedG1 = false;
        String platformG1 = "PlayStation 3, Xbox 360, PlayStation 4, Xbox One";
        int numberOfPlayersG1 = 10;
        Rental minecraft = new Game(titleG1, costG1, ratingG1, rentedG1, platformG1, numberOfPlayersG1);
        rentals.add(minecraft);

        //Game2
        String titleG2 = "Grand Theft Auto: San Andreas";
        double costG2 = 6.99;
        int ratingG2 = 5;
        boolean rentedG2 = false;
        String platformG2 = "PlayStation 2, Xbox 360, PlayStation 3";
        int numberOfPlayersG2 = 2;
        Rental GTAsanAndreas = new Game(titleG2, costG2, ratingG2, rentedG2, platformG2, numberOfPlayersG2);
        rentals.add(GTAsanAndreas);

        //Game3
        String titleG3 = "Call of Duty: Modern Warfare";
        double costG3 = 9.99;
        int ratingG3 = 4;
        boolean rentedG3 = false;
        String platformG3 = "PlayStation 4, Xbox One";
        int numberOfPlayersG3 = 2;
        Rental CODmodernWarfare = new Game(titleG3, costG3, ratingG3, rentedG3, platformG3, numberOfPlayersG3);
        rentals.add(CODmodernWarfare);

        //Game4
        String titleG4 = "NBA 2K21";
        double costG4 = 8.99;
        int ratingG4 = 2;
        boolean rentedG4 = false;
        String platformG4 = "PlayStation 4, PlayStation 5, Xbox One";
        int numberOfPlayersG4 = 4;
        Rental nba2K21 = new Game(titleG4, costG4, ratingG4, rentedG4, platformG4, numberOfPlayersG4);
        rentals.add(nba2K21);
    }

    public ArrayList<Video> getVideos()
    {
        ArrayList<Video> videos = new ArrayList<Video>();
        for (int i = 0; i < rentals.size(); i++)
        {
            if (rentals.get(i) instanceof Video)
                videos.add((Video) rentals.get(i));
        }

        return videos;
    }

    public ArrayList<Game> getGames()
    {
        ArrayList<Game> games = new ArrayList<Game>();
        for (int i = 0; i < rentals.size(); i++)
        {
            if (rentals.get(i) instanceof Game)
                games.add((Game) rentals.get(i));
        }

        return games;
    }

    public ArrayList<Rental> getRented()
    {
        return rentals;
    }

    public void addRental (Rental r)
    {
        rentals.add(r);
    }

    public ArrayList<Game> gamesInStock()
    {
        ArrayList<Game> gamesInStockA = new ArrayList<Game>();
        for (int i = 0; i < rentals.size(); i++)
        {
            if (rentals.get(i) instanceof Game)
            {
                if (rentals.get(i).getRented() == false)
                    gamesInStockA.add((Game) rentals.get(i));
            }
        }

        return gamesInStockA;
    }

    public ArrayList<Video> videosInStock()
    {
        ArrayList<Video> videosInStockA = new ArrayList<Video>();
        for (int i = 0; i < rentals.size(); i++)
        {
            if (rentals.get(i) instanceof Video)
            {
                if (rentals.get(i).getRented() == false)
                    videosInStockA.add((Video) rentals.get(i));
            }
        }

        return videosInStockA;
    }

}
