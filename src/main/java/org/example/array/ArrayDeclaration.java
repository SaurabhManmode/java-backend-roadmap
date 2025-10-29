package org.example.array;

public class ArrayDeclaration {
    public static void main(String[] args) {
        //array with size 5
        int arr[] = new int[5];
        //array literal
        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        // array literal
        int[] arr3 = {1, 2, 3, 4, 5};

        // accessing element from array
        System.out.println(arr3[3]);

        //accessing all the elements from array
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // updating values of array to 10
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = 10;
        }

        // accessing new values from array
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
