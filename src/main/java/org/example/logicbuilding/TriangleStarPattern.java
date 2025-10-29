package org.example.logicbuilding;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int n = 5;
        printTriangleStarPattern(n);
    }

    public static void printTriangleStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
