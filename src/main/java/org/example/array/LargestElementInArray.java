package org.example.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {12, 54, 63, 77, 23, 78, 99};
        int largestEl = largestElementInArray(arr);
        System.out.println(largestEl);
    }

    private static int largestElementInArray(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}
