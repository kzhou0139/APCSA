package com.company;

import java.util.ArrayList;

public class HangmanGame {

    public static final int MAX_GUESSES = 6;
    private int wrongGuesses;
    private ArrayList<String> sentences = new ArrayList<String>();
    private String sentence;
    private ArrayList<Character> vowels = new ArrayList<Character>();
    private ArrayList<Character> consonants = new ArrayList<Character>();

    public HangmanGame()
    {
        sentences.add("January first is New Years Day!");
        sentences.add("February fourteenth is Valentines Day!");
        sentences.add("February twelfth is Chinese New Years!");
        sentences.add("April fourth is Easter!");
        sentences.add("July fourth is Independence Day!");
        sentences.add("November eleventh is Veterans Day!");
        sentences.add("November twenty-fifth is Thanksgiving Day!");
        sentences.add("December twenty-fourth is Christmas Eve!");
        sentences.add("December twenty-fifth is Christmas Day!");
        sentences.add("December thirty-first is New Years Eve!");
        wrongGuesses = 0;
        int randomSentence = (int)(Math.random() * 10);
        sentence = sentences.get(randomSentence);
    }

    public boolean won ()
    {
        String blank = "";
        char[] sentenceChar = sentence.toCharArray();
        char[] newSentence = new char[sentenceChar.length];
        for (int i = 0; i < sentenceChar.length; i++)
        {
            char upper = Character.toUpperCase(sentenceChar[i]);

            if (vowels.contains(upper) == true || consonants.contains(upper) == true)
                newSentence[i] = sentenceChar[i];
            else
                newSentence[i] = '_';

            if (sentenceChar[i] == 32)
                newSentence[i] = ' ';
            if (sentenceChar[i] == 33)
                newSentence[i] = '!';
            if (sentenceChar[i] == 45)
                newSentence[i] = '-';
        }
        blank = String.valueOf(newSentence);

        if (blank.contains("_"))
            return false;
        else
            return true;
    }

    public void printSentence ()
    {
        String blank = "";
        char[] sentenceChar = sentence.toCharArray();
        char[] newSentence = new char[sentenceChar.length];
        for (int i = 0; i < sentenceChar.length; i++)
        {
            char upper = Character.toUpperCase(sentenceChar[i]);

            if (vowels.contains(upper) == true || consonants.contains(upper) == true)
                newSentence[i] = sentenceChar[i];
            else
                newSentence[i] = '_';

            if (sentenceChar[i] == 32)
                newSentence[i] = ' ';
            if (sentenceChar[i] == 33)
                newSentence[i] = '!';
            if (sentenceChar[i] == 45)
                newSentence[i] = '-';
        }
        blank = String.valueOf(newSentence);
        System.out.println(blank);
    }

    public int guessesLeft ()
    {
        int gLeft = 6 - wrongGuesses;
        return gLeft;
    }

    public boolean addGuessedLetter (char c)
    {
        char lower = Character.toLowerCase(c);
        boolean ret = false;
        if (consonants.contains(c) == false && vowels.contains(c) == false)
        {
            if (isVowel(c) == true)
                vowels.add(c);
            else
                consonants.add(c);

            if (isInSentence(c) == true || isInSentence(lower))
                ret = true;
            else
            {
                wrongGuesses++;
                ret = false;
            }
        }
        else
           ret = false;

        return ret;
    }

    public void printGuessed ()
    {
        System.out.println("Guessed vowels: " + vowels);
        System.out.println("Guessed consonants: " + consonants);
        System.out.println("Your have " + guessesLeft() + " wrong guesses left.");
    }

    public boolean isPunctuation (char c)
    {
        if (c == 33 || c == 44 || c == 46 || c == 63 || c == 59 || c == 58 || c == 39)
            return true;
        else
            return false;
    }

    public boolean isInSentence (char c)
    {
        char newC = Character.toUpperCase(c);
        int x = 0;
        boolean ret = false;

        if (sentence.indexOf(c) != -1 || sentence.indexOf(newC) != -1)
            x = 1;

        addGuessedLetter(newC);

        if (x == 1)
            ret = true;
        else
            ret = false;

        return ret;
    }

    public Boolean isVowel (char c)
    {
        if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117 || c == 65 || c == 69 || c == 73 || c == 79 || c == 85)
            return true;
        else
            return false;
    }
}
