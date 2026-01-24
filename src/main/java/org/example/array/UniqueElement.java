package org.example.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int uniqueElement = getUniqueElement2(arr);
        System.out.println(uniqueElement);
    }

    private static int getUniqueElement2(int[] arr) {
     return    Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .mapToInt(e->e.getKey())
                .findFirst().getAsInt();

    }

    private static int getUniqueElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return -1;
    }


}
