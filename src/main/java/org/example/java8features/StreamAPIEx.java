package org.example.java8features;

import java.util.Arrays;
import java.util.List;
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
        int [] arr ={1,2,4,5,6};
        IntStream fromArray = Arrays.stream(arr);

        //create empty stream
        Stream<Object> empty = Stream.empty();

        //using builder
        Stream.Builder<Object> builder = Stream.builder();


    }
}


