package org.example.array.striver;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 7, 0};
        int largest = arr[0];
        // first pass
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // second pass
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        System.out.println(secondLargest);
    }
}
