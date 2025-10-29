package org.example.logicbuilding;

public class SolidSquare {
    public static void main(String[] args) {
        int n=6;
        printSolidSquare(n);
    }
    public static void printSolidSquare(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
