package org.example.array;

public class PushAllZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 5, 0};
        pushAlzeros(arr);
        for (var num : arr) {
            System.out.println(num);
        }
    }

    private static void pushAlzeros(int[] arr) {

        int count = 0;
        for (var i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }
    }
}
