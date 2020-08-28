package com.company;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Main m = new Main();

        m.displayRandom(m.getJokes(), scan);
    }

    private ArrayList<String> getJokes()
    {
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("How does a scientist freshen their breath? With experi-mints");
        jokes.add("What did the 0 say to the 8? Nice belt.");
        jokes.add("Knock knock.\nWho's there? \nHatch. \nHatch who? \nBless you!");
        jokes.add("Why did the melons plan a big wedding? Because they cantaloupe!");

        return jokes;
    }

    private void displayRandom(ArrayList<String> strings, Scanner scan)
    {


        System.out.println("Wanna listen to a joke?\nIf yes, press enter.\n");
        scan.nextLine();

        boolean flag = true;
        while(flag) {
            int index = new Random().nextInt(strings.size());
            System.out.println(strings.get(index));
            System.out.println("\nAnother one? We the best music! ENTERRRRRRRRRRR <3 ^^ O.o\n\n\n");
            scan.nextLine();
        }
    }
}