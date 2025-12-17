package org.example.array;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        var newLength = findNewLength(arr);

        for (var i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }
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
