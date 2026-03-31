package org.example.array.striver;

import java.util.Arrays;

public class SecondSmallestAndSecondLargest {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 7, 0};
        int secondSmallest = secondSmallestInArray(arr);
        int secondLargest = secondLargestEle(arr);

        int arr2[] = secondLargestAndSmallest(secondSmallest, secondLargest);

        System.out.println(Arrays.toString(arr2));
    }

    private static int[] secondLargestAndSmallest(int secondSmallest, int secondLargest) {
        return new int[]{secondLargest, secondSmallest};
    }

    private static int secondLargestEle(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }

    private static int secondSmallestInArray(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
