package org.example.array;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 0, 44, 5, 6};
        int secondSmallest = secondSmallest(arr);
        System.out.println(secondSmallest);

        Integer i = Arrays.stream(arr)
                .sorted()
                .skip(1)
                .findFirst().getAsInt();
        System.out.println(i);
    }

    private static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest > arr[i]) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
