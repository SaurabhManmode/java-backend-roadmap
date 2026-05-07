package org.example.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEx {

    public static void main(String[] args) {
        // creation of stream
        //from collections
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> intstream = list.stream();

        //from stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        //from array
        int[] arr = {1, 2, 4, 5, 6};
        IntStream fromArray = Arrays.stream(arr);

        //create empty stream
        Stream<Object> empty = Stream.empty();

        //using builder
        Stream.Builder<Object> builder = Stream.builder();

        //Intermediate operations
        //1. Filter
        List<Integer> ls = List.of(5, 10, 27, 4, 80, 60);
        List<Integer> filteredlist = ls.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredlist);
        Stream<String> stream = Stream.of(
                "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

      /*  List<String> capitalStrings = stream.filter(str -> Character.isUpperCase(str.charAt(1)))
                .collect(Collectors.toList());*/

        //     System.out.println(capitalStrings);

        List<String> endsWithS = stream.filter(
                str -> str.endsWith("s")
        ).collect(Collectors.toList());

        System.out.println(endsWithS);

        //2 map
        List<Integer> nums = List.of(3, 6, 9, 27);
        List<Integer> multiplication = nums.stream().map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println(multiplication);

        List<String> smallcases = List.of("sauru", "kri", "beed");
        List<String> upper = smallcases.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper);

        List<Integer> length = smallcases.stream()
                .map(String::length)
                .toList();
        System.out.println(length);

        // sorted
        List<Integer> unsorted = List.of(4, 5, 8, 1, 0, 2, 6);
        List<Integer> sorted = unsorted.stream()
                .sorted()
                .toList();
        System.out.println(sorted);

        IntStream random = IntStream.generate(
                () -> (int) (Math.random() * 100)
        ).limit(5);

        int[] array = random.sorted()
                .toArray();
        System.out.println(Arrays.toString(array));

        // distinct
        List<Integer> dups = List.of(1, 1, 2, 2, 3, 3, 7, 7, 7, 8);
        List<Integer> distinct = dups.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        //skip

        List<Integer> skipped = dups.stream()
                .skip(4)
                .toList();
        System.out.println(skipped);


    }


}


