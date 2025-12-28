package org.example.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        var newLength = findNewLength(arr);

        for (var i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }

        //using hashset
        Set<Integer> distinct = findDistinctElement(arr);
        System.out.println(distinct);

        //using java 8

        List<Integer> distinctVal = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(distinctVal);

    }

    private static Set<Integer> findDistinctElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (var i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }
        return set;
    }

    private static int findNewLength(int[] arr) {
        var n = arr.length;
        if (n <= 1)
            return n;
        var index = 1;
        for (var i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }

}
