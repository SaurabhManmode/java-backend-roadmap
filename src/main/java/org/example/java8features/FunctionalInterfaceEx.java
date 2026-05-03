package org.example.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceEx {

    public static void main(String[] args) {
        //Consumer
        Consumer<Integer> display = (value) -> System.out.println(value);
        display.accept(10);

        Consumer<List<Integer>> modify = (list) -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        modify.accept(list);
        dispList.accept(list);

        modify.andThen(dispList).accept(list);

        //Biconsumer

        BiConsumer<List<Integer>, List<Integer>> biConsumer = (list1, list2) -> {
            list1.stream().forEach(a -> System.out.println(a));
            list2.stream().forEach(a -> System.out.println(a));
        };

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(8, 10, 20);

        biConsumer.accept(list1, list2);

        // predicate
        Predicate<Integer> predicate = (n) -> n > 10;
        System.out.println(predicate.test(11));

        List<Integer> evenList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}
