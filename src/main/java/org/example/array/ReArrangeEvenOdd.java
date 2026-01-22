package org.example.array;

public class ReArrangeEvenOdd {
    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            // i = 1 → 2nd element → even position in 1-based indexing
            if (i % 2 == 1) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
            // i = 2 → 3rd element → odd position in 1-based indexing
            else {
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 6, 4};
        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
