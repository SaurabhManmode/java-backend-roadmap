package org.example.logicbuilding;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        int n = 4; // number of rows
        printNumberChangingPyramid(n);
    }

    public static void printNumberChangingPyramid(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
