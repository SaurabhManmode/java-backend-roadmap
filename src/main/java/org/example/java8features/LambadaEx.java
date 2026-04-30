package org.example.java8features;

public class LambadaEx {

    public static void main(String[] args) {
        // how we can provide implementation for the lambada expression

        Add add = (a, b) -> a + b;

        System.out.println(add.addition(5,6));
    }
}


//functional interface

interface Add {
    int addition(int a, int b);
}

//types of lambada parameters