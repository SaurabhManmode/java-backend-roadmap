package org.example.array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        var value = isSorted(arr);
        System.out.println(value);
    }

    private static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
