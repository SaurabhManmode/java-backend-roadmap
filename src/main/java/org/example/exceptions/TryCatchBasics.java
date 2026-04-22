package org.example.exceptions;

public class TryCatchBasics {

    public static void main(String[] args) {

        // skipping finally
        try{
            System.exit(0);
        }finally {
            System.out.println("Hello");
        }

    }
}
