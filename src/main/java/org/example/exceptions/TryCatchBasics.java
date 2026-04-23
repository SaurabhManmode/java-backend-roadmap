package org.example.exceptions;

import java.io.FileReader;
import java.io.IOException;

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
    /*    try {
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
   // checked exception without handling
        FileReader fr = new FileReader("data.txt");


    }

    // writing code after throw
    private static void codeAfterThrows(){
        throw new RuntimeException();
        System.out.println();*/

        System.out.println(expwithFinally());
        nestedTryCatch();

        //return catch and finally
        System.out.println(catchPlusfinally());

        //suppressed exception
        suppressedException();

        //change exception in finally
       changeExceptionInFinally();

        // notMatchingExceptionBlocks
        notMatchingExceptionBlocks();

    }

    private static void notMatchingExceptionBlocks() {
        try {
            int x = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }
    }

    private static void changeExceptionInFinally(){
        try {
            throw new RuntimeException("Try");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void suppressedException() {
        try (MyResource mr = new MyResource()) {
            throw new RuntimeException("Main");
        } catch (Exception e) {

        }
    }

    private static int catchPlusfinally() {

        try {
            int x = 10 / 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }

    // throw vs throws
    public static void throwVsThrows() throws IOException {
        FileReader fr = new FileReader("data.txt");

        try {
            throw new RuntimeException();
        } catch (Exception e) {

        }
    }

    // nested try catch
    private static void nestedTryCatch() {
        try {
            try {
                int x = 10 / 0;
            } catch (NullPointerException e) {
                System.out.println("Inner exception");
            }
        } catch (Exception e) {
            System.out.println("Outer exception");
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

    static int expwithFinally() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }
}
