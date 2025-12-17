package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> list = getAllSubArray(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> getAllSubArray(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                current.add(arr[j]);        // extend subarray instead of looping k
                result.add(new ArrayList<>(current));
            }
        }
        return result;
    }
}
