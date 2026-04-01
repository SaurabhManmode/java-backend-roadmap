package org.example.array.striver;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 6, 6};
        //bruteforce using set
        Set<Integer> set = removeDups(arr);
        System.out.println(set);
    }

    private static Set<Integer> removeDups(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }
        return set;
    }
}
