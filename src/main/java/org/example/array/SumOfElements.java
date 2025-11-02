package org.example.array;

import java.util.Arrays;

public class SumOfElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = sumOfArray(arr);
        System.out.println(sum);

        Integer i = Arrays.stream(arr)
                .sum();
        System.out.println(i);
    }

    private static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
