package org.example.array.striver;

import java.util.Arrays;

public class LeftRotateArrayByD {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr.length;
        //having space complexity
        rotateArrayByD(arr, d);
        System.out.println(Arrays.toString(arr));

        //avoid space
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotateArrayByD(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
            j++;
        }

    }


    //avoiding space


}
