package org.example.array;

public class MinOps {

    public static void main(String[] args) {
        int[] arr = {21, 33, 9, 45, 63};
        int k = 6;
        int ops = minOps(arr, k);
        System.out.println(ops);
    }

    private static int minOps(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (var i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

        }
        int res = 0;
        for (var i = 0; i < arr.length; i++) {
            if ((max - arr[i]) % k != 0) {
                return -1;
            } else {
                res += (max - arr[i]) / k;
            }
        }
        return res;
    }
}
