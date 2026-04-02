package org.example.array;

public class MissingElement {


    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        int element = findMissingElement(arr);
        System.out.println(element);
    }

    private static int findMissingElement(int[] arr) {
        System.out.println(arr.length);
        int n = arr.length + 1;
        int sum = 0;
        for (var i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        return expectedSum - sum;
    }
}
