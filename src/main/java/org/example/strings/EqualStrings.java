package org.example.strings;

public class EqualStrings {

    public static void main(String[] args) {
        String s1 = "Saurabh";
        String s2 = "Saurabh";
        System.out.println(s1.equals(s2));
        System.out.println(equalStrings(s1, s2));

    }

    public static boolean equalStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

        }
        return true;
    }

}

