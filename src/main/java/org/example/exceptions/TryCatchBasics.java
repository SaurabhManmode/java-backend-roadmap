package org.example.exceptions;

public class TryCatchBasics {

    public static void main(String[] args) {

        // skipping finally
        try {
            //  System.exit(0);
        } finally {
            System.out.println("Hello");
        }
        //values in finally
        System.out.println(overridingValuesInFinally());

        // variable modification in finally
        System.out.println(valueModicationInFinally());


        // exception supression
        try{
            throw new RuntimeException("try exception");
        }finally {
            throw new RuntimeException("Finally exception");
        }
    }

    private static int valueModicationInFinally() {

        int x = 1;
        try {
            return x;
        } finally {
            x = 2;
        }
    }

    static int overridingValuesInFinally() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
