package org.example.logicbuilding;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        printLeftHalfPyramid(n);
    }

    public static void printLeftHalfPyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();;
        }
    }
}
