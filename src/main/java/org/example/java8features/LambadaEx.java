package org.example.java8features;

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

        List<String> list = List.of("saurabh", "manmode", "shubham", "mane", "hi", "hello");
        // names start with the s
        List<String> namesWiths = list.stream()
                .filter(name -> name.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(namesWiths);


        // enclosed example
        Add enclosed = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(enclosed.addition(5, 8));


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