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
        try {
            throw new RuntimeException("try exception");
        } finally {
            throw new RuntimeException("Finally exception");
        }


        // order of catch block wrong
        try {
            int x = 10 / 0;

        } catch (Exception e) {

        } catch (ArithmeticException e) {

        }

        // correct order
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {

        } catch (Exception e) {

        }
        // try with finally
        try {
            System.out.println("try");
        } finally {
            System.out.println("finally");
        }

        //try without catch and finally
        try {
            //CTE
        }

        // catch multiple exceptions

        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException  | NullPointerException en){
            System.out.println("Handled");
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
