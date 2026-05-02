package org.example.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LambadaEx {

    static String[] games
            = {"COD", "Prince Of Persia", "GTA-V5",
            "Valorant", "FIFA 22", "Fortnite"};
    static String[] tracks
            = {"Believer", "Cradles", "Taki Taki", "Sorry",
            "Let Me Love You"};

    public static void main(String[] args) {
        // how we can provide implementation for the lambada expression
        Add add = (a, b) -> a + b;
        System.out.println(add.addition(5, 6));

        // single parameter lambada

        NoParameter noParameter = () -> System.out.println("single Parameter");
        noParameter.display();

        SingleParameter singleParameter = n -> n * n;//use of parenthesis is optional for single parameter

        System.out.println(singleParameter.square(5));

        // for multiparameter refer add example

        // Lambada with collection

        List<String> nameList = List.of("saurabh", "manmode", "shubham", "mane", "hi", "hello");
        // names start with the s
        List<String> namesWiths = nameList.stream()
                .filter(name -> name.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(namesWiths);


        // enclosed example
        Add enclosed = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(enclosed.addition(5, 8));

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(55);
        numList.add(4);
        numList.add(3);
        numList.add(2);

        //decreasing order
        Collections.sort(numList, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println(numList);

        // creation of thread using lambada
        Runnable myThread = () -> {
            Thread.currentThread().setName("Saurabh's Thread"); // thread 0
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(myThread);
        thread.start();

        //multi threading example 2
        Runnable basic = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running task by the " + threadName);

        };

        Thread basic1 = new Thread(basic);
        Thread basic2 = new Thread(basic);
        basic1.start();
        basic2.start();

        //lambada with multithreading example 2
        RandomPlayer randomPlayer = new RandomPlayer();

        Random random = new Random();

        Runnable gameRunner = () -> {
            try {

                randomPlayer.playGame(games[random.nextInt(games.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Runnable musicPlayer = () -> {
            try {
                randomPlayer.playMusic(tracks[random.nextInt(tracks.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);

        game.start();
        music.start();

        //block lambada

        Factorial f = (n) -> {
            int res = 1;

            for (int i = 1; i <= n; i++) {
                res = i * res;
            }
            return res;
        };

        System.out.println("Factorial is " + f.fact(5));

    }
}


//functional interface

interface Add {
    int addition(int a, int b);
}

//types of lambada parameters

interface NoParameter {
    void display();
}

interface SingleParameter {
    int square(int a);
}

class RandomPlayer {
    public void playGame(String gameName) throws InterruptedException {
        System.out.println(gameName + " game started");
        Thread.sleep(500);
        System.out.println("game ended");
    }

    public void playMusic(String trackName) throws InterruptedException {
        System.out.println(trackName + " is playing");
        Thread.sleep(500);
        System.out.println("music ended");
    }
}

interface Factorial {
    int fact(int n);
}