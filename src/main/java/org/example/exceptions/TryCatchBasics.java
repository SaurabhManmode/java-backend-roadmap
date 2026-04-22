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
    }

    static int overridingValuesInFinally() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
