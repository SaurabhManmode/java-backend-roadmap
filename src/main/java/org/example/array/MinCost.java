package org.example.array;

public class MinCost {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2};
        int minCost = findMinCostOps(arr);
        System.out.println(minCost);
    }

    private static int findMinCostOps(int[] arr) {
        int n = arr.length;
        int min = arr[0];

        for (var i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (n - 1) * min;
    }
}
