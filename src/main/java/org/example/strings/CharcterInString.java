package org.example.strings;

public class CharcterInString {

    public static void main(String[] args) {
        String s = "Geeksforgeeks";
        char c = 'k';
        int idx = findCharacterInString(s, c);
        System.out.println(idx);
    }

    private static int findCharacterInString(String s, char c) {
        int idx = s.indexOf(c);
        return (idx != -1) ? idx : -1;

    }
}
