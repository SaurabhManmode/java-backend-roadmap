package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAlternateInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // iterative approach
        printAlternateElements(arr);

        // recursive approach
        List<Integer> list = getAlternateRec(arr);
        System.out.println(list);
    }

    private static List<Integer> getAlternateRec(int[] arr) {
        List<Integer> list = new ArrayList<>();
        getAlternates(arr, 0, list);
        return list;
    }

    private static void getAlternates(int[] arr, int idx, List<Integer> list) {
        if (idx < arr.length) {
            list.add(arr[idx]);
            getAlternates(arr, idx + 2, list);
        }
    }

    private static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(" " + arr[i]);
            System.out.println();
        }
    }
}
