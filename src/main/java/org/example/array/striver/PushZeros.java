package org.example.array.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 5, 0, 6, 7, 8, 0};

        // optimal
        pushAllZeroOptimal(arr);

        //brute
  //      pushAllZeros(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void pushAllZeroOptimal(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    private static void pushAllZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                list.add(i);
            }
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
