package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWithinK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,6,7,5};
        int k = 3;
        var result = isDuplicateWithinK(arr, k);
        System.out.println(result);
    }

    private static boolean isDuplicateWithinK(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (var i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);

            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }
}
