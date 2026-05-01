package org.example.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambadaEx {

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
            Thread.currentThread().setName("Saurabh's Thread");
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(myThread);
        thread.start();

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