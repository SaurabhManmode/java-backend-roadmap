package org.example.array;

public class SmallestAndLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, -4, 99, 55};
        printSmallestAndLargestElementInArray(arr);
    }

    private static void printSmallestAndLargestElementInArray(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
