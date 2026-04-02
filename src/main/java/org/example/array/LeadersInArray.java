package org.example.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = leadersInArray(arr);
        System.out.println(leaders);
    }

    private static List<Integer> leadersInArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        var n = arr.length;
        var rightMost = arr[n - 1];
        list.add(rightMost);
        for (var i = n - 2; i >= 0; i--) {
            if (arr[i] >= rightMost) {
                rightMost = arr[i];
                list.add(rightMost);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
