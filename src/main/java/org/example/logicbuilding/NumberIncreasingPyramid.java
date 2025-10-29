package org.example.logicbuilding;

public class NumberIncreasingPyramid {

    public static void main(String[] args) {
        int n = 4;
        printNumberIncreasingPyramid(n);
    }

    public static void printNumberIncreasingPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
