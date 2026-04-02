package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElementInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 7, 4, 1};
        int num = firstNonRepeatingElement(arr);
        System.out.println(num);

        int num2 = firstNonRepeatingElement2(arr);
        System.out.println(num2);
    }

    private static int firstNonRepeatingElement2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    private static int firstNonRepeatingElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }

            }
            if (!repeated) {
                return arr[i];
            }
        }
        return -1;
    }
}
