package org.example.array.striver;

public class LargestInArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 5, 10};
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
