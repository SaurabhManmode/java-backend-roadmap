package org.example.array;

public class SmallestNumberInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 6, -1, -10};

        int smallest = smallestNumberInArray(arr);
        System.out.println(smallest);
    }

    private static int smallestNumberInArray(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
