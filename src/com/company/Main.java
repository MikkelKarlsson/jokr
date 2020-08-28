package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        randomJoke();
        input(scan, randomJoke());
    }

    public static List randomJoke(){
        List<String> aList = new ArrayList<>();
        aList.add("joke1");
        aList.add("joke2");
        aList.add("joke3");
        aList.add("joke4");
        aList.add("joke5");
        shuffle(aList);
        return aList;

    }

    public static void input(Scanner scan, List aList){
        System.out.println("Do u wanna listen to a joke?\n1. Yes\n2. No");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.println(aList.get(1));
        } else {
            System.out.println("Fuck u");
        }
    }
}
