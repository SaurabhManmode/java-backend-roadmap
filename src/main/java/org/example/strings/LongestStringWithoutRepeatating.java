package org.example.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestStringWithoutRepeatating {

    public static void main(String[] args) {
        String s = "abcabcd"; // abcd

        int length = longestStingWithoutRepeatatingCharacter(s);
        System.out.println(length);

        String maxString = longestStingWithoutRepeatatingCharacter2(s);
        System.out.println(maxString);
    }

    private static int longestStingWithoutRepeatatingCharacter(String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }

    private static String longestStingWithoutRepeatatingCharacter2(String s) {
        int left = 0;
        String maxString = null;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

        }
        maxString = set.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return maxString;

    }
}
