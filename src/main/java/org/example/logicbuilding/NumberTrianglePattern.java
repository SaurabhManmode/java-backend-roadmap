package org.example.logicbuilding;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        printNumberTriangle(5);
    }

    public static void printNumberTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
