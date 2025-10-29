package org.example.datatypes;

public class FarhToDegree {
    public static void main(String[] args) {
        float fahrenheitValue = 212.0f;
        float degrees = fahrenheitToDegrees(fahrenheitValue);
        System.out.println(degrees + " degrees");
    }

    static float fahrenheitToDegrees(float value) {
        return ((value - 32) * 5) / 9;
    }
}
